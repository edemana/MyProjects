#####################################################################
# Original Author: Dr. Jan Pearce, Fulbright Scholar
# Program to demonstrate use of images, which must be in gif format
#
# licensed under a Creative Commons
# Attribution-Noncommercial-Share Alike 3.0 United States License.
#####################################################################

import turtle
import random

wn = turtle.Screen()
wn.bgpic("jesus.gif")
wn.addshape("nl.gif")
wn.addshape("slamb.gif")
wn.addshape("slily.gif")
diff_shape = ("slamb.gif", "slily.gif")

tj = turtle.Turtle()
tj.penup()

gj = turtle.Turtle()


def good():
    
    """ Writes a short message"""
    tj.goto(-480,-200)
    tj.color("dark red")
    tj.write("Remember that\n""Jesus Christ gave up His life\nfor your sins because He loves you.\nAppreciate Him with your life.\n\n""HAPPY EASTER!", font=('Lucida Calligraphy', 13,'bold'))


def comp():
    """ shows a picture of a sacrificed lamb and a lily randomly """
    gj.penup()
    gj.speed(1)
    x = random.randrange(-400,400)
    y = random.randrange(-350,350)
    for shap in diff_shape:
        gj.shape(shap)
        gj.goto(x,y)
    
    
    
def key_j():
    """ positions a sacrificed lamb randomly """
    for _ in range(20):
            comp()
    
def lamb():
    """ Calls the lamb image and the other functions """
    good()
    tj.goto(300,-210)
    tj.shape("nl.gif")
    tj.speed(1)
    for _ in range(3):
        tj.left(30)
        tj.forward(20)
        tj.backward(20)
        

lamb()

wn.onkey(key_j, 'j')
wn.listen()

wn.exitonclick()