mid = 3//2


max_ = int(input("Pick a number: ")) #user picks number 
mid = max_//2 #Figuring out the mid



for row in range(max_): #repeat this for x amount of rpws
    
        


    for column in range(max_):    #repeats this for x amount of columns 
        if row == mid and column == mid: #Print 0 in the middle
            print("0", end ='')
        else :                     #if not middle, print *
            print('*', end='')
    
    print('')   #end loop

    
        
