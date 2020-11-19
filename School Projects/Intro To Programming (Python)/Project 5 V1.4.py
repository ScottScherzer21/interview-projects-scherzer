'''
define a function to print a top or bottom border
'''
def characterlooper(character):
  
  for outerborder in range(week):
    print('|', end = '')
    for innerborder in range(spaces_and_dashes):
        print(character , end = '')

  print('|')

'''
assigning general variables
'''

#7 days in a week
week = 7

#10 spaces or dashes for our column separation 
spaces_and_dashes = 10

'''
user tells py. how many days are in the month, and what day of the week does the month start
'''

monthDays = int(input("How many days are in this month?: "))
print()

#making sure response is valid
if monthDays > 32: print('Error. too any days in month')
elif monthDays < 28: print('Error. not enough days in month')

print()
print('Options: monday, tuesday, wednesday, thursday, friday, saturday, sunday')
print()
monthStart_input = str(input('What Day of the week does this month start?: '))
print()

                                    
'''
coverting user str input into an int variable
'''

if monthStart_input == 'sunday': date = 1
elif monthStart_input == 'monday': date = 0
elif monthStart_input == 'tuesday': date = -1
elif monthStart_input == 'wednesday': date = -2
elif monthStart_input == 'thursday': date = -3
elif monthStart_input == 'friday': date = -4
elif monthStart_input == 'saturday': date = -5


'''
print a top border
'''
character = '-'
characterlooper(character)

'''
Print MTWTFSS
'''
mtwtfss = 10
mid = mtwtfss//2 
i = 1

'''
label columns by days of the weeks for aestetics
'''

for mtwtfssloop in range(7):
    print('|' , end = '')
    for column in range(mtwtfss):    
        
        '''converting a str to an integer so python can count the days and
        change them in my loop'''

        if i == 1: a ='S'
        elif i == 2: a ='M'
        elif i == 3: a ='T'
        elif i == 4: a ='W'
        elif i == 5: a ='T'
        elif i == 6: a ='F'
        elif i == 7: a ='S'

        #some code i stole from project 4
        if column == mid: 
            print(a, end ='')
        else :                    
            print(' ', end='')

    #keeps changing int every time loop cycles through 
    i = i + 1           
        



print('|') 

'''
Calender printing
'''

for weekloop in range(5): 


    '''
    Print a top border
    '''
    
    character = '-'
    characterlooper(character)


    '''
    print the date or print a space
    '''
    
    #Repeat this three times verically
    for WeekDaySpacesLoop in range(3):

        #print 7 days horrizontaly 
        for DateOrBlanks in range(7):
            blankcount = 10
         
            #print a date in top left corner, or print ' ' to fit within the range of the month and month start       
            print('|', end = '')

            if WeekDaySpacesLoop == 0 and (date < 1 or date > monthDays):
              print(' ', end = '')

              blankcount = 9
              date = date + 1
              
              
            elif WeekDaySpacesLoop == 0:
                print(date, end = '')

                #blankcount assignment
                if date > 9: blankcount = 8

                else : blankcount = 9

                date = date + 1

            #print this many spaces after the date is printed
            for spaces in range(blankcount):
                print(' ', end = '')
                    
        
        print('|')

'''
Print bottom border to finish
'''
character = '-'
characterlooper(character)


