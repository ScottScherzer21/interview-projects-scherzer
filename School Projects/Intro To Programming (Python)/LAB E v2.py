#lab E
#Scott Scherzer 
#max of two functions

'''define a function to find the max of 2 parameters'''

def maxOfTwo(parameter1, parameter2):
    if parameter1 > parameter2:
        maximum = parameter1
    else :
        maximum = parameter2

    return(maximum)

#program 
print(maxOfTwo( 5, 7 ))
print(maxOfTwo( 105, 7 ))
print(maxOfTwo( "yes", "no" ))
print(maxOfTwo( False, 0 ))
print(maxOfTwo( 0, False ))
print(maxOfTwo( 0, "" ))



'''the reason why the results are different for d and e are different
are because python is converting it from a boolean value to a numeric
value before doing the comparison.'''
