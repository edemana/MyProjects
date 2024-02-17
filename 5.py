''' This program takes the year and predicts
    the zodiac animal related to it.
'''

year = int(input("Enter the year: "))

# Conditional sort the years 
if abs(year - 2000)%12==0:
    print('Dragon')
elif abs(year - 2001)%12==0:
    print('Snake')
elif abs(year - 2002)%12==0:
    print('Horse')
elif abs(year - 2003)%12==0:
    print('Sheep')
elif abs(year - 2004)%12==0:
    print('Monkey')
elif abs(year - 2005)%12==0:
    print('Rooster')
elif abs(year - 2006)%12==0:
    print('Dog')
elif abs(year - 2007)%12==0:
    print('Pig')
elif abs(year - 2008)%12==0:
    print('Rat')
elif abs(year - 2009)%12==0:
    print('Ox')
elif abs(year - 2010)%12==0:
    print('Tiger')
elif abs(year - 2011)%12==0:
    print('Hare')