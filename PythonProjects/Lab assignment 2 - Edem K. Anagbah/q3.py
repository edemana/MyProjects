import turtle
wn = turtle.Screen()
bob = turtle.Turtle()

# Draws a polygon
def polygon(t, length, n):
    ''' This function draws a polygon with n sides
        and equal length. t is a turtle'''
    angle = 360/n
    for i in range(n):
        t.fd(length)
        t.lt(angle)
polygon(bob, 100, 5)