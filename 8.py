''' This program reads a string of characters from the user.
    Then displays a message indicating whether the characters
    are valid for an older style license plate or a newer style license plate
'''

# Reads the plate number from the user 
plate_number = input("Enter the license plate's number: ")

# Analyses the users input and displays a response if the conditions are met
if len(plate_number)== 6:
    print('The plate number;', plate_number,'belongs to the older style license plates.')
    
elif len(plate_number)== 7:
    print('The plate number;', plate_number,'belongs to the newer style license plates.')
    
else:
     print('The plate number;', plate_number,'is invalid.')