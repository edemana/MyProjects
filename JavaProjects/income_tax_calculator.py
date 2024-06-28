def income_tax(gross_income: float) -> float:
    cumulative_incomes = [402, 512, 642, 3642, 20037, 50000]
    cumulative_tax = [0, 5.5, 18.5, 543.5, 4642.25, 13631.15]
    tax_rates = [0, 5, 10, 17.5, 25, 30, 35]

    tax = 0
    remaining_income = gross_income

    for i in range(len(cumulative_incomes)):
        if remaining_income <= cumulative_incomes[i]:
            tax += cumulative_tax[i - 1]
            remaining_income -= cumulative_incomes[i - 1]
            tax += remaining_income * (tax_rates[i] / 100)
            break
        else:
            tax += cumulative_tax[-1]
            remaining_income -= cumulative_incomes[-1]
            tax += remaining_income * (tax_rates[-1] / 100)
            break

    net_salary = gross_income - tax
    return net_salary


# Takes input from the user
gross_salary = float(input("Enter your gross monthly salary (GH¢): "))
if "__main__" == __name__:
    # Calculates tax and net salary
    net_salary = income_tax(gross_salary)

# Displays results
print(f"Net Monthly Salary: GH¢{net_salary:.2f}")
