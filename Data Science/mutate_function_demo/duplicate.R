################################################################
# AUTHOR : THIYAGARAJAN PARAMASIVAN
# CODE : MSCT32
# NAME : DATA SCIENCE AND ANALYTICS
# ORGANISATION : DEPARTMENT OF COMPUTER SCIENCE, CENTRAL UNIVERSITY OF TAMIL NADU
###############################################################
library(purrr)
triple <- function(x) x * 3


triple(1)
triple(2)
triple(3)

map(1:3, triple)

#identify the duplicate elements
duplicated(c(1,2,1,3,1,4))
#gives the location of duplicate elements
which(duplicated(c(1,2,1,3,1,4)))





mydata = data.frame (NAME =c ('Alisa','Bobby','jodha','jack','raghu','Cathrine',
                              'Alisa','Bobby','kumar','Alisa','jack','Cathrine'),
                     Age = c (26,24,26,22,23,24,26,24,22,26,22,25),
                     Score =c(85,63,55,74,31,77,85,63,42,85,74,78))

mydata

#distinct() Function in Dplyr  -  Remove duplicate rows of a dataframe in R
library(dplyr)

distinct(mydata)
# OR
library(dplyr) 
mydata %>% distinct()


#Remove Duplicate Rows based on a variable
library(dplyr)

# Remove duplicate rows of the dataframe using NAME variable
distinct(mydata,NAME, .keep_all= TRUE)

#OR
library(dplyr) 
mydata %>% distinct(NAME, .keep_all= TRUE)

#Remove Duplicate Rows based on multiple variables


library(dplyr)

# Remove duplicate rows of the dataframe using NAME and Age variables
distinct(mydata, NAME,Age, .keep_all= TRUE)

#OR
library(dplyr) 
mydata %>% distinct(NAME,Age, .keep_all= TRUE)

#DROP Duplicates in R using unique() function in R

## Apply unique function for data frame in R
unique(mydata)

#unique rows of the dataframe by keeping last occurrences
#unique() function along with the argument fromLast =T indicates keeping
#the last occurrence in the process of identifying unique values
## unique value of dataframe in R by keeping last occurrences

unique(mydata, fromLast=T)


#unique value of the columns in the dataframe
unique(mydata$NAME)


#Remove Duplicates based on a column using duplicated() function
## unique value of the column in R dataframe 
mydata[!duplicated(mydata$NAME), ]


