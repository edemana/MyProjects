''' This program takes an integer from a user
    and determines whether it is odd or even
'''

# Takes user's input 
number = int(input('Enter number: '))

# Condition categories the users input and displays an output based on satisfied conditions
if number%2 == 0:
    print(number, "is an even number.")
else :
    print(number, "is an odd number.")