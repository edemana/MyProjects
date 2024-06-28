import turtle
import math 
wn = turtle.Screen()
bob = turtle.Turtle()

def polygon(t, length, n):
    ''' This function draws a polygon with n sides
        and equal length. t is a turtle'''
    angle = 360/n
    for i in range(n):
        t.fd(length)
        t.lt(angle)
        
def circle(t, r):
    ''' This function calls the polygon function
        and draws a circle with radius r. t is a turtle'''
    n = 100
    length = (2*math.pi*r)/n
    polygon(t, length, n)

# Tries the circle function with a range of r values 
for r in [50,100,150,200]:
    
    circle(bob, r)