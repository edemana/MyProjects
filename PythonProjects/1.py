''' This program takes three numbers and finds
    the minimum, maximum and mid value
'''
# Reads three numbers from the user 
a = int(input('Enter a number: '))
b = int(input('Enter a number: '))
c = int(input('Enter a number: '))

minimum = min(a,b,c) # picks the minimum value
maximun = max(a,b,c) # picks the maximum value
mid_value = (a+b+c) - (maximun+minimum) # evaluates the mid value

# Display the values 
print(minimum)
print(maximun)
print(mid_value)