"""The Guessing Game in python."""
import random

random.seed(10)
lower_bound = 1
upper_bound = 100
random_value = random.randint(lower_bound, upper_bound)


def guess_game(seed: int) -> None:
    global random_value
    print(
        "Welcome to the Guessing Game!\nI'm thinking of a number between 1 and 100. Can you guess it"
    )
    no_of_tries = 1

    while True:
        guess = int(input("Guess a number: "))
        if guess != random_value:
            no_of_tries += 1
            if guess < random_value:
                print("Good try, but that's too low. Try again.")
            elif guess > random_value:
                print("Good try, but that's too high. Try again.")
        else:
            if no_of_tries == 1:
                print(
                    f"Yes! You guessed correctly after your first try! Congratulations."
                )
            else:
                print(
                    f"Yes! You guessed correctly after {no_of_tries} tries! Congratulations."
                )
            break


guess_game(10)
