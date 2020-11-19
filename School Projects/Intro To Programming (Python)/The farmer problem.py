#Farmer Algo

#Legs per animal
chick = 2
cow = 4 
pig = 4 

#User input anmount of animal stock
temp = input("How many chickens?: ")
chick_quant = int(temp)

temp = input("How many cows?: ")
cow_quant = int(temp) 

temp = input("How many pigs?: ")
pig_quant = int(temp) 


#count legs and total print 
print ( ( chick * chick_quant )  + ( cow * cow_quant ) + ( pig * pig_quant ) )



