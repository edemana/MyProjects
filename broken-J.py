import turtle

wn = turtle.Screen()
wn.bgcolor("orange")
tj = turtle.Turtle()
tj.color("navyblue")
tj.pensize(5)
tj.penup()
tj.left(90)
tj.forward(75)
tj.right(90)
tj.pendown()
tj.forward(50)              # top of J
tj.right(90)            # turning to make top of J
tj.forward(100)      # middle of J
tj.circle(-50, 180)   # bottom of J
tj.penup()     
tj.forward(100)  
    

wn.exitonclick()  
