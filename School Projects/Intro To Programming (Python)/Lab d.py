"""
define a multiplication function
"""

def mult( val1, val2, val3 ) :

    desiredResult = val1 * val2 * val3

    return desiredResult


"""
call the mult function to mult values 
"""

#Assigning value 1,2,3
val1 = int(input("Enter a number: "))
val2 = int(input("Enter a second number: "))
val3 = int(input("Enter a third number: "))

'''
Storing our 3 values AND function in a new variable
'''

returnedValue = mult(val1, val2, val3)

"""
We do not need to use a * becuase we already defined it in the function.
"""

#Print the result 
print( val1, "*" , val2 , "*" , val3 ,"=" ,returnedValue )
