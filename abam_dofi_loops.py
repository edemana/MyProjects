import turtle                   # allows us to use the turtles library

wn = turtle.Screen()            # Setup the window and its attributes
wn.bgcolor("yellow")            # Change the background color
wn.title("abam & dofi")         # Make a title

abam = turtle.Turtle()          # Create abam  "instance"
abam.color("blue")
abam.pensize(6)

dofi = turtle.Turtle()          # Create dofi "instance"  
dofi.color("hotpink")
dofi.pensize(4)

dofi.penup()
dofi.forward(-100)               # Move dofi away from the origin
dofi.pendown()

for i in range(3):               # Make dofi draw equilateral triangle
    dofi.forward(100)
    dofi.left(120)

abam.penup()
abam.forward(50)                # Move abam away from the origin
abam.pendown()

abam.fillcolor('red')
abam.begin_fill()
for i in range(4):              # Make abam draw a square 
    abam.forward(110)          
    abam.left(90)
abam.end_fill()

wn.exitonclick()              # to close Turtle Screen
