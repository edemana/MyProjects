######################################################################
# triple_turtles.py
# Author: Edem K. Anagbah
# Username: edem.anagbah
#
# Acknowledgements: Original code by: Dr. Scott Heggen, Berea College
# licensed under a Creative Commons
# Attribution-Noncommercial-Share Alike 3.0 United States License.
######################################################################

import turtle
wn = turtle.Screen()


sly = turtle.Turtle()  # create a turtle instance
sly.hideturtle()
sly.pensize(3)
sly.color("black")

sly.fillcolor("brown")
sly.begin_fill()

# draw a hexagon
for side in range(6):
    sly.forward(100)
    sly.left(60)
sly.end_fill()
sly.penup()


nun = turtle.Turtle()    #create a turtle instance 
nun.color("black")
nun.hideturtle()
nun.penup()
nun.pensize(4)

# move turtle to the center of the hexagon to draw a circle
nun.left(75)
nun.forward(70)
nun.right(118)
nun.fillcolor("black")

nun.pendown()
nun.begin_fill()
nun.circle(40)
nun.end_fill()
nun.penup()
nun.left(180)

# move turtle above to write a text
nun.forward(100)
nun.pendown()
nun.write("My first pencil",move= True,align='right',font=("Times New Roman",20,("bold","normal")))

wn.exitonclick()

