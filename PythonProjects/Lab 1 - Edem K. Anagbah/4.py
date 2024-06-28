import math as m

radius = float(input("Enter radius: "))
height = float(input("Enter height: "))

volume = (m.pi * radius**2) * height

print(f"Volume of cylinder: {round(volume, 1)}")
