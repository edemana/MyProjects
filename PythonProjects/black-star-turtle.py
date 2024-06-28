#####################################################################
# Original Author: Dr. Jan Pearce, Fulbright Scholar
# Program to demonstrate use of images, which must be in gif format
#
# licensed under a Creative Commons
# Attribution-Noncommercial-Share Alike 3.0 United States License.
#####################################################################

import turtle
wn = turtle.Screen()
wn.bgpic('black-star-square.gif') # original photo by Dr. Pearce
wn.addshape('turtle.gif')
# turtle image downloaded from https://ashe.si/3JKL192!
im = turtle.Turtle()
im.penup()
im.goto(-210, 230)
im.write("Turtle Goes to Black Star Square", font=('Arial', 20, 'bold')) 
im.goto(200, -100)
im.speed(1)
im.shape('turtle.gif')

im.backward(170)
im.left(90)
for i in range(5):
    im.forward(20)
    im.backward(20)

wn.exitonclick()

