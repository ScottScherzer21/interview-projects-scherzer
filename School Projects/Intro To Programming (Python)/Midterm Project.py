
max_ = int(input('Select a number: ')) 
mid = max_//2 #Figuring out the mid



for row in range(max_): #repeat this for x amount of rows
    
        


    for column in range(max_):    #repeats this for x amount of columns 
        if row == mid or column == mid: #Print 5 **** in the middle
            print("*", end ='')
        else :                     #if not middle, print space
            print(' ', end='')
    
    print('')   #end loop
