#Which number is the biggest ??
#2/06/2020


#User picks three numbers

temp = input("Pick a 1st number: " )
number1 = int(temp)

temp = input("Pick a 2nd number: " )
number2 = int(temp)

temp = input("Pick a 3rd number: " )
number3 = int(temp)


#machine searches for max 
x = max(number1, number2, number3)
print("The max number out of the three that you gave me is" ,x)
    

