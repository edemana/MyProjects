''' This program takes that reads the number of minutes and text messages
    used in a month from the user. Display the base charge, additional minutes
    charge (if any), additional text message charge (if any),
    the 911 fee, tax, and total bill amount

'''

# Reads the minutes and text messages from user 
m = int(input('Enter the number of minutes (starting from 50 mins): '))
t = int(input('Enter the number of text messages (starting from 50 texts): '))
fee_911 = 0.44
base_charge = 15
base_911 = 15 + fee_911
tax = (0.05*base_charge)

# Conditional display unique if met
if m == 50 and t == 50:
    tax = (0.05*base_charge) 
    total_bill_amount = base_911 +  tax
    print(round(base_charge, 2))
    print(round(fee_911, 2))
    print(round(tax, 2))
    print("Total bill amount: $",round(total_bill_amount, 2))

elif m > 50 and t > 50:
    additional_minutes_charge =float((m-50)*0.25)
    additional_text_message_charge = float((t-50)*0.15)
    bill = additional_minutes_charge + additional_text_message_charge + base_911
    tax = (0.05*bill)
    total_bill_amount = bill +  tax
    
    print(round(base_charge, 2))
    print(round(additional_minutes_charge, 2))
    print(round(additional_text_message_charge,2))
    print(round(fee_911, 2))
    print(round(tax, 2))
    print("Total bill amount: $",round(total_bill_amount, 2))
else:
    print('Wrong input')
    
