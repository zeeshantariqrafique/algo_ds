from functools import reduce 
num = 5
factorial = reduce(lambda x,y: x*y,range(1,num+1))
print(factorial)
