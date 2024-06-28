import random

# Sets a seed for reproducibility
random.seed(10)

# Defines the lower and upper bounds for the random number
lower_bound = 1
upper_bound = 100

# Generates a random number between lower_bound and upper_bound
random_value = random.randint(lower_bound, upper_bound)


def guess_game(seed: int) -> None:
    global random_value

    # Welcome message
    print(
        "Welcome to the Guessing Game!\nI'm thinking of a number between 1 and 100. Can you guess it?"
    )

    # Initializes the number of tries
    no_of_tries = 0

    # Main loop
    while True:
        # Gets user input for the guess
        guess = int(input("Guess a number: "))
        no_of_tries += 1  # Increment the number of tries for each guess

        # Checks if the guess is too low, too high, or correct
        if guess < random_value:
            print("Good try, but that's too low. Try again.")
        elif guess > random_value:
            print("Good try, but that's too high. Try again.")
        else:
            # Displays a congratulatory message when the guess is correct
            print(
                f"Yes! You guessed correctly after {no_of_tries} {'try' if no_of_tries == 1 else 'tries'}! Congratulations."
            )
            break  # Exit the loop when the correct guess is made


# Starts the guessing game with a seed value
guess_game(10)
