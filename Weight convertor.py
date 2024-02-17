weight = input("What is your weight?\n")
nw = input ("(K)g or (L)bs: " )
# 1 pound = 0.45359237 kg
if nw.upper() == "L":
    ans = (0.45359237 * int(weight))
    print(ans, "Kg\n")
elif nw.upper() == "K":
    ans = (int(weight) / 0.45359237)
    print(ans, "Kg")
    