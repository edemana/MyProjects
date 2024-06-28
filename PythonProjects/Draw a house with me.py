# The program draws a beautiful house.

def s():
    """Draws the sky and green grass"""
    
    
    wn.bgcolor("green")
    t.up()
    t.goto(-800,-100)
    t.down()
    t.color("deepskyblue")
    t.begin_fill()
    t.speed(5)

    for _ in range(2):
        t.forward(2000)
        t.left(90)
        t.forward(500)
        t.left(90)
    t.end_fill()
def l():
    
    '''draws the sun'''
    t.up()
    t.goto(-320,225)
    t.down()
    t.color("yellow")
    t.begin_fill()
    t.circle(35)
    t.end_fill()
    t.hideturtle()

def c():
    '''draws the cloud'''
    t.up()
    t.goto(200,200)
    t.down()
    t.color("white")
    t.begin_fill()
    t.circle(25)
    t.end_fill()
    t.hideturtle()

    t.up()
    t.goto(220,240)
    t.down()
    t.color("white")
    t.begin_fill()
    t.circle(30)
    t.end_fill()
    t.hideturtle()

    t.up()
    t.goto(230,215)
    t.down()
    t.color("white")
    t.begin_fill()
    t.circle(35)
    t.end_fill()
    t.hideturtle()

    t.up()
    t.goto(190,225)
    t.down()
    t.color("white")
    t.begin_fill()
    t.circle(25)
    t.end_fill()
    t.hideturtle()
def h():  
    '''draws the house'''
    t.up()
    t.goto(-100,-100)
    t.down()
    t.color("brown",col)
    t.begin_fill()

    for i in range(4):
        t.forward(170)
        t.left(90)
        
    t.end_fill()
    # draws a chimney
    t.up()
    t.goto(20,130)
    t.down()
    t.color("brown","dark red")
    t.begin_fill()

    for i in range(2):
        t.forward(40)
        t.left(90)
        t.forward(100)
        t.left(90)
    t.end_fill()
def r():    
    '''draws the roof''' 
    t.up()
    t.goto(-127,70)
    t.down()
    t.color("brown","firebrick")
    t.begin_fill()

    for i in range(3):
        t.forward(230)
        t.left(120)
    t.end_fill()
def w():    
    ''' draws the windows'''
    t.pensize(5)
    t.up()
    t.goto(0,0)
    t.down()
    t.color("black","white")
    t.begin_fill()

    for i in range(4):
        t.forward(50)
        t.left(90)
    t.end_fill()

    t.up()
    t.goto(0,25)
    t.down()
    t.forward(50)
    t.up()
    t.goto(25,0)
    t.left(90)
    t.down()
    t.forward(50)

    t.up()
    t.goto(-80,0)
    t.down()
    t.right(90)
    t.color("black","white")
    t.begin_fill()

    for i in range(4):
        t.forward(50)
        t.left(90)
    t.end_fill()
    t.up()
    t.goto(-80,25)
    t.down()
    t.forward(50)
        
    t.up()
    t.goto(-55,0)
    t.left(90)
    t.down()
    t.forward(50)
def d():
    '''draws the door'''
    t.penup()
    t.goto(-40, -97)
    t.down()
    t.right(90)
    t.color("dark red","black")
    t.begin_fill()
    for i in range(2):
        t.forward(50)
        t.left(90)
        t.forward(85)
        t.left(90)
    t.end_fill()    

    t.penup()
    t.goto(-30, -60)
    t.down()
    t.color("dark red")
    t.begin_fill()
    t.circle(5)
    t.end_fill
    t.hideturtle()
    
    
name = input('Hey friend\nWhat is your name? ')
print('Hello ', name ,'!')
print('Let us build something')
col = input("Give me a colour: ") # allows user to choose a colour for the house 
age = int(input(' How old are you? '))


import turtle
wn = turtle.Screen()
wn.addshape('car.gif')
t = turtle.Turtle()
car = turtle.Turtle()
t.speed(5)


if 0<age<13:

    s()
    l()
    c()
    h()
    r()
    w()
    d()
else:
    print('I think you are too old for this activity')

car.shape('car.gif')
car.up()
car.goto(-200,-150)
car.speed(1)

def move():
    
    car.forward(500)
    car.backward(500)
    
for i in range(3):
    move()

    
wn.exitonclick

a = "YES"
u = input("Was it fun?\n").upper()
if u == a:
    print('I am glad it was!')
else:
    print("I am sorry it wasn't!")

