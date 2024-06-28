a = input("Your color choice ")

import turtle
wn = turtle.Screen()
bax = turtle.Turtle()
bax.pensize(5)
bax.color("black")

bax.hideturtle()

bax.fillcolor(a)
bax.begin_fill()

for side in range(4):
    bax.forward(100)
    bax.left(90)
    bax.forward(50)
    bax.left(90)
bax.end_fill()

wn.exitonclick()