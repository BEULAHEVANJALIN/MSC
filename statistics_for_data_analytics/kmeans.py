import numpy as np
import matplotlib.pyplot as plt
import random

def d(x, y):
	return ((x[0]-y[0])**2 + (x[1]-y[1])**2)**(1/2)
	
k = 4
n = 100
points = np.random.rand(n, 2)
plt.scatter(points[:,0],points[:,1])
plt.show()
centres = random.choices(points, k)
cluster = dict()
