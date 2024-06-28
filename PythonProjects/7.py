''' This program takes the frequency of a radiation 
    and returns the category it falls under
    '''

# Takes the date from the user 
d = int(input('Day: '))
m= int(input('Month: '))
y= int(input('Year: '))

# Conditionals sorts the users input
if m in [4, 6, 9, 11] and 0<d<31:
    print('Date:', y,'-', m,'-',  d=+1)
elif m in [4, 6, 9, 11] and d>31:
    m = m+1
    d = d - 30
    print('Date:', y,'-', m ,'-',  d)
    
elif m in [1,3,5,7,8,10,12] and 0<d<32:
    print('Date:', y,'-', m,'-',  d)
elif m in [1,3,5,7,8,10,12] and d>=32:
    m = m+1
    d = d - 31
    print('Date:', y,'-', m,'-',  d)
elif m==2 and d<=28:
    d = d + 1
    print('Date:', y,'-', m,'-',  d)
    
            