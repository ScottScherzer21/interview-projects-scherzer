import math


print("Enter 5 numbers.")
a = float(input("Enter 1st: "))
b = float(input("Enter 2nd: "))
c = float(input("Enter 3rd: "))
d = float(input("Enter 4th: "))
e = float(input("Enter 5th: "))

print("what do you want me to do with these 5 numbers you gave me?")
print("Options:")
print("sum (1)")
print("mean (2)")
print("standard deviation (3)")
print("range (4)")

#user picks 
x = input("Select function: ")

#sum
if (x == "1") :
    print( a + b + c + d + e)
#mean (average)
elif (x == "2") :
    y = ( a + b + c + d + e)
    print(y / 5)
#standard deviation
elif (x == "3") :
    y = ( a + b + c + d + e)
    sm = (y / 5) #simple mean 
    print("simple mean:" , sm)
    new_mean = (((a-sm)**2) + ((b-sm)**2)  +  ((c-sm)**2)   +  ((d-sm)**2)  +  ((e-sm)**2) )  / 5 
    print("new mean: ",new_mean)
    print("answer: ", math.sqrt(new_mean) )
#range
elif ( x == "4") :
    h = max(a,b,c,d,e)
    o = min(a,b,c,d,e)
    print(h - o)

else : print("Error 1")
