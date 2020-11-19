#Scott Scherzer
#project 2

#When you're done test
#0,0,0
#100,100,100
#75,65,50


#Collecting three grades
g1 = float ( input ( 'enter paper grade:' ) )
g2 = float ( input ( 'enter midterm grade:' ) )
g3 = float ( input ( 'enter final grade:' ) )

#Calculating sum  
grades_sum = (g1 + g2 + g3)

#convert average percent and printing it
final_grade_percent = (grades_sum / 3)
print( "Final grade percent:" , final_grade_percent )

#Showing program whats the crieteria for each letter, then printing it
if final_grade_percent >= 90 :
    print( "Final letter grade: A" )

elif final_grade_percent >= 80 :
    print( "Final letter grade: B" )

elif final_grade_percent >= 70 :
    print( "Final letter grade: C" )

elif final_grade_percent >= 60 :
    print( "Final letter grade: D" )

else :
    print( "Ooops, please work harder" ) 
