def income_tax(gross_income):
    # Initializes variables
    tax = 0
    remaining_income = gross_income

    # Calculates tax based on income brackets
    if remaining_income <= 402:
        pass  # No tax for income up to 402
    elif remaining_income <= 512:
        tax += (remaining_income - 402) * 0.055
    elif remaining_income <= 642:
        tax += (remaining_income - 512) * 0.1 + 5.5
    elif remaining_income <= 3642:
        tax += (remaining_income - 642) * 0.175 + 18.5
    elif remaining_income <= 20037:
        tax += (remaining_income - 3642) * 0.25 + 543.5
    elif remaining_income <= 50000:
        tax += (remaining_income - 20037) * 0.30 + 4642.25
    elif remaining_income > 50000:
        tax += (remaining_income - 50000) * 0.35 + 13631.15

    # Calculates net salary after deducting tax
    net_salary = gross_income - tax
    return net_salary


def main():
    # Gets gross salary input from the user
    gross_salary = float(input("Enter your gross monthly salary (GH¢): "))

    # Calculates and display net income
    result = income_tax(gross_salary)
    print(f"Net Income: GH¢{result:.2f}")


if __name__ == "__main__":
    # Runs the main function
    main()
