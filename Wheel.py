def hello(name): # has one parameter
    '''function that says hello to the parameter name'''
    print("Hello, " + name + '!\n')

def main(): # has zero parameters
    '''a program that uses functions'''
    your_name = input("What's your name?\n")
    hello(your_name) # function call

main() # function call
