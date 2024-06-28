initial_deposit = int(input("Enter initial amount deposited:\n"))

current_amount = initial_deposit
for year in range(1, 4):
    current_amount = current_amount + current_amount * 4 / 100
    print("Current amount for Year",year,":", round(current_amount, 2))

