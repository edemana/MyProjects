''' This program takes the lenght of sides of a triangle
    and returns the category it falls undername of the triangle
'''
# Takes the length of first , second and third side
first, second, third = input('Enter the lengths of the triangle (with a comma separating them): ').split(',')
a = int(first)
b = int(second)
c = int(third)

if a==b and b==c:
    print('The triangle is an equilateral triangle')
elif a==b or b==c:
    print('The triangle is an isosceles triangle')
else:
    print('The triangle is a scalene triangle')