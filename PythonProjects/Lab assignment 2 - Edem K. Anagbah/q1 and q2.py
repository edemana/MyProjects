import turtle
wn = turtle.Screen()
bob = turtle.Turtle()

# Draws a square
def square(t, length):
    ''' This function draws a square with a length.
        t is a turtle.'''
    for i in range(4):
        t.fd(length)
        t.lt(90)

square(bob, 100)  
