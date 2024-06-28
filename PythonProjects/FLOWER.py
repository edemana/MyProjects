
    

    

petal_colour = input('Pick a colour: ')
l = []

n = int(input("Enter a number between 100 and 300: "))
l.append(n)
for m in l:
    x=int(m)
    y=int(m)
def draw_flower(petal_color):
    '''draws the petals and stems of a flower'''
    
    
    import turtle
    import random
    wn = turtle.Screen()
    wn.bgpic("black-soil-1.gif") # image was downloaded from https://th.bing.com/th/id/OIP.SFBdNBmfVyjfgJGRoMEq4QHaEK?pid=ImgDet&rs=1
    t = turtle.Turtle()
    flowert = turtle.Turtle()
    
    
    flowert.speed(0)
    #flowert.hideturtle()
    flowert.penup()
    flowert.goto(x,y)
    flowert.pendown()
    
    # Set the petal color
    flowert.color(petal_colour)
    
    # Draw the petals
         
    t.up()
    t.goto(x,y)
    t.circle(50,39)
    t.pendown()
    t.pensize(7)
    t.color("green")
    t.circle(-80, -80)
    t.hideturtle()
    t.stamp()
    
    for i in range(5):
        flowert.begin_fill()
        flowert.circle(50, 180)
        flowert.left(36)
        flowert.end_fill()
   
    

    flowert.left(50)
    flowert.color("yellow")
    flowert.up()
    flowert.goto(x+36,y+36)
    flowert.down()
    flowert.begin_fill()
    flowert.circle(20, 360)
    flowert.end_fill()
    flowert.hideturtle()
    flowert.up()
    
    
draw_flower(petal_colour)
for i in range(5):
    x = x+70
    y = y+70
    draw_flower(petal_colour)
    x = x-150
    y = y-150
    draw_flower(petal_colour)
    x = x-110
    y = y+110
    draw_flower(petal_colour)
