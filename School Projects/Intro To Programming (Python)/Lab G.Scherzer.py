#Lab G Scherzer


'''Define a function that "handles" a math error'''
def ErrorFinder(x, y):
     try:
         result = x // y

     #checking for each type of error
     except ZeroDivisionError:
         return("Division by zero error.")

     except UnboundLocalError:
         return("Error!")

     except TypeError:
         return("Error! Please enter a Int")

     except NameError:
         return("Name Error!")

     #returning result if no exceptions are met.
     else:
         return result

     

#two non-zero numbers
answer = (ErrorFinder (10,2))
print('Your answer is', answer)

#two numbers with the first one a 0
answer = (ErrorFinder (0,2))
print('Your answer is', answer)

#two numbers with the second one a 0
answer= (ErrorFinder (10,0))
print('Your answer is', answer)

#a number and a letter
answer = (ErrorFinder (10,'a'))
print('Your answer is', answer)
