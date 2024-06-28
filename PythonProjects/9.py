''' This program takes the frequency of a radiation 
    and returns the category it falls under
    '''
# Takes the frequency of the radiation from the user 
frequency = int(input('Enter the frequency: '))

# Conditional examine wavelength and display the corresponding category
if frequency < 3 *10**9:
    print('Radio waves')
elif 3 *10**9 < frequency <  3 *10**12:
    print('Microwaves')
elif 3 *10**12 < frequency <  4.3 *10**14:
    print('Infrared light')
elif 4.3 *10**14 < frequency < 7.5 *10**14:
    print('Visible light')
elif 7.5 *10**14 < frequency < 3 *10**17:
    print('Ultraviolet light')
elif 3 *10**17 < frequency < 3 *10**19:
    print('X-rays')
elif frequency > 3 *10**19:
    print('Gamma rays')