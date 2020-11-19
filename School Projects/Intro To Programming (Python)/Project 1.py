variableOne = int( input( "Enter first number:" ) )

variableTwo = int( input( "Enter second number:" ) )
#user assigns variables

result = variableOne + variableTwo
#machine assigning third variable 

#Checking for zero, then a negative, then greater than 100
if result == 0:         
    print("Result is zero") 
elif result < 0:
    print("Result is negative")
elif result >= 100:
    print("Result is more than 99")

#Then if theyre both equal and it will tell if more than 99     
if variableOne == variableTwo:
    print("The numbers are equal")


    
