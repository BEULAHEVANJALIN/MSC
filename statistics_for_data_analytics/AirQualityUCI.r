getwd()
setwd("/home/beulah/statistics_for_data_analytics")
dataset = read.csv2('AirQualityUCI.csv', stringsAsFactors = FALSE)
View(dataset)
sapply(dataset, class)
# install.packages("readxl")
# library(readxl)
# dataset <- read_excel("AirQualityUCI.xlsx")
summary(dataset)

# Removing the last 114 rows and last 2 columns, as all of them are null values along with the date
tail(dataset, n = 115)
dataset = dataset[1:9357, 1:15]
View(dataset)
summary(dataset)

str(dataset)
dim(dataset)
head(dataset)
is.null(dataset)
is.na(dataset)
sum(is.na(dataset))

# Replacing -200 value in the dataset with NA
dataset[dataset == -200] = NA
is.na(dataset)
sum(is.na(dataset))

sapply(dataset, function(x) sum(is.na(x)))

percentmissing<-function(x){
  (colSums(is.na(x))/nrow(x))*100
}
percentmissing(dataset)

sapply(dataset, class)

# Converting character to Date
library(lubridate) 
dataset$Date<- dmy(dataset$Date)
dataset$Time<- hms(dataset$Time)
View(dataset)
# newDataset <- na.omit(dataset)
# sum(is.na(newDataset))

# install.packages("DMwR")
# library(DMwR)
# original <- dataset  # backup original data
# actuals <- original$CO.GT.[is.na(dataset$CO.GT.)]
# predicteds <- rep(mean(dataset$CO.GT., na.rm=T), length(actuals))
# regr.eval(actuals, predicteds)

install.packages("mice")
library(mice)
md.pattern(dataset)

install.packages("VIM")
library(VIM)
mice_plot <- aggr(dataset, col=c('navyblue','yellow'),
                    numbers=TRUE, sortVars=TRUE,
                    labels=names(dataset), cex.axis=.7,
                    gap=1, ylab=c("Missing data","Pattern"))
# There are 65% values in the data set with no missing value.
# There are 12% missing values in AH, 8% missing values in RH and so on.
imputed_Data <- mice(dataset, m=5, maxit = 50, method = 'pmm', seed = 500)
# m  – Refers to 5 imputed data sets
# maxit – Refers to no. of iterations taken to impute missing values
# method – Refers to method used in imputation. we used predictive mean matching.
summary(imputed_Data)
# checking imputed values
imputed_Data$imp$CO.GT.
completeData <- complete(imputed_Data, 2)
sum(is.na(completeData))
summary(completeData)

install.packages('devtools')
devtools::install_github("laresbernardo/lares")
library(lares)
corr_cross(completeData, # name of dataset
           max_pvalue = 0.05, # display only significant correlations (at 5% level)
           top = 10 # display top 10 couples of variables (by correlation coefficient)
)

# fit <- with(data = completeData, exp = lm(AH ~ C6H6.GT. + PT08.S2.NMHC.)) 
# devtools::install_github("rstudio/pool", force = TRUE)
# install.packages('pool')
# library(pool)
# combine <- pool(fit)
# summary(combine)

completeData = completeData[, 3:15]
corrMatrix = cor(completeData, method = c("pearson", "kendall", "spearman")) 
install.packages('corrplot')
library(corrplot)
corrplot(corrMatrix, method = "number")

# ensure the results are repeatable
set.seed(7)
# load the library
library(mlbench)
library(caret)
# find attributes that are highly corrected (ideally >0.75)
highlyCorrelated <- findCorrelation(corrMatrix, cutoff=0.5)
# print indexes of highly correlated attributes
print(highlyCorrelated)

