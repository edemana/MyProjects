import turtle

wn=turtle.Screen()
wn.setup(625,625)

tun = turtle.Turtle()
hun = turtle.Turtle()

tun.pencolor("green")
tun.pensize(15)
tun.speed(10)

tun.penup()
tun.goto(-280,-280)

for lines in range(4):
    tun.down()
    tun.forward(560)
    tun.left(90)
    

hun.pensize(25)
hun.up()
hun.goto(-260,-260)
hun.down()
hun.color("blue")
hun.speed(10)
for _ in range(13):
    hun.forward(520)
    hun.left(90)
    hun.forward(20)
    hun.left(90)
    hun.forward(520)
    hun.right(90)
    hun.forward(20)
    hun.right(90)
hun.forward(520)

wn.exitonclick()
    
  
  