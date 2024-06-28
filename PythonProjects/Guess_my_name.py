
print("Hey there!\nGuess my age range?")
age = int(input(" Age: "))

import turtle
import random
wn = turtle.Screen()
t = turtle.Turtle()

wn.addshape("wr.gif") # this image was downloaded from https://th.bing.com/th/id/OIP.Vkf7_29J8cJlVNaFqVBVLQAAAA?pid=ImgDet&rs=1
wn.addshape("ok.gif") # this image wa downloaded from https://th.bing.com/th/id/OIP.zZUtPlu2tn08fpJ5CpYtwgAAAA?pid=ImgDet&rs=1
wn.addshape("other_me.gif") 

def good():
    """ Gives a colourful picture background and tells if the guess is correct"""
    wn.bgpic("Edem.gif")
    t.penup()
    t.goto(200,200)
    t.shape("ok.gif")
    t.speed(6)
    t.left(90)
    for _ in range(4):
        t.forward(40)
        t.forward(-40)
    t.goto(200,200)
    t.stamp()
    t.hideturtle()
    t.goto(60,40)
    t.color("Dark green")
    t.write("You might be right :) ", font=('Lucida Calligraphy', 13,'bold'))
    
def better():
    """ Gives a colourful picture background and tells if the guess is wrong """
    wn.bgpic("other_me.gif")
    t.penup()
    t.goto(200,200)
    t.shape("wr.gif")
    t.speed(6)
    t.left(90)
    for _ in range(4):
        t.forward(40)
        t.forward(-40)
    t.goto(200,200)
    t.stamp()
    t.hideturtle()
    t.goto(60,40)
    t.color("Dark red")
    t.write("That is not true :( \nI'm not that old", font=('Lucida Calligraphy', 13,'bold'))
    
def bad():
    """ Gives a gray picture background and tells if the guess is wrong"""
    wn.bgpic("old_me.gif")
    t.penup()
    t.goto(200,200)
    t.shape("wr.gif")
    t.speed(6)
    t.left(90)
    for _ in range(4):
        t.forward(40)
        t.forward(-40)
    t.goto(200,200)
    t.stamp()
    t.hideturtle()
    t.goto(60,40)
    t.color("red")
    
def key_x():
    """ Reminds the user to try again """
    t.goto(60,-200)
    t.write(" You can try again :) ", font=('Lucida Calligraphy', 13,'bold'))
    
# A conditional that regulates the outcome of every guess
if 26>age>19:
    good()
elif age>25:
    better()
    
else:
    bad()
    t.write("That is not true :( \nI'm not that young", font=('Lucida Calligraphy', 13,'bold'))
    
wn.onkey(key_x, 'x')
wn.listen()

wn.exitonclick()
        