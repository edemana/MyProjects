''' This program takes the frequency of a radiation 
    and returns the category it falls under
    '''

# Takes the year from the user 
year = int(input('Enter year: '))

# Coditional that determine which is a leap year
if year % 400==0 or year%4==0 :
    print('It is a leap year')
elif year%100==0:
    print('It is not a leap year')
else:
    print('It is not a leap year')