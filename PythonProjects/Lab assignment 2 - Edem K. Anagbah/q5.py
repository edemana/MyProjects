import turtle
import math


wn = turtle.Screen()
bob = turtle.Turtle()

def polygon(t, length, n):
    ''' This function draws a polygon with n sides
        and equal length. t is a turtle'''
    angle = 360/n
    for i in range(int(n/20)):
        t.fd(length)
        t.lt(angle)
        
def circle(t, r):
    ''' This function calls the polygon function
        and draws a circle with radius r. t is a turtle'''
    n = 100
    length = (2*math.pi*r)/n
    polygon(t, length, n)
    

def arc(t, r, angle):
    ''' This function calls the circle function to draw an arc with radius r and an angle '''
    for i in range(int(round(angle/18, 0))):
    
        circle(bob, 100)
        
arc(bob, 100, 90)
        

