#Scott Scherzer 
#project 3


amount = int(input("How many asteriks do you want?: "))


#rows
zero = 0 #Assigning a number to compare to amount 
while zero < amount: 

    #columns
    zero2 = 0 #Assigning a number to compare to amount with diff var
    while zero2 < amount: #columns 
        print(' * ', end = '') #Print columns untill theres none left
        zero2 = zero2 + 1 #end loop
    
    print()
    zero = zero +1 #Stop printing rows when theres been x columns printed 

    
    



