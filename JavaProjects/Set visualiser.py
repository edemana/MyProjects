import tkinter as tk
from matplotlib import pyplot as plt
from matplotlib_venn import venn2


def perform_set_operation():
    # Get sets from user input
    global set1, set2
    set1 = set(entry_set1.get().split())
    set2 = set(entry_set2.get().split())

    # Perform set operation based on user choice
    operation = operation_var.get()
    if operation == "Union":
        result_set = set1.union(set2)
    elif operation == "Intersection":
        result_set = set1.intersection(set2)
    # Add more cases for difference and complement

    # Update Venn diagram
    update_venn_diagram(result_set)


def update_venn_diagram(result_set):
    plt.cla()  # Clear the previous diagram
    venn2([set1, set2], set_labels=("Set 1", "Set 2"))
    plt.title("Venn Diagram")
    plt.show()


# GUI setup
root = tk.Tk()
root.title("Set Operations Visualizer")

# Set Input
tk.Label(root, text="Set 1:").pack()
entry_set1 = tk.Entry(root)
entry_set1.pack()

tk.Label(root, text="Set 2:").pack()
entry_set2 = tk.Entry(root)
entry_set2.pack()

# Set Operation Selection
operations = [
    "Union",
    "Intersection",
    "Compliment",
    "Difference",
]  # Add more operations
operation_var = tk.StringVar(root)
operation_var.set(operations[0])

operation_menu = tk.OptionMenu(root, operation_var, *operations)
tk.Label(root, text="Select Set Operation:").pack()
operation_menu.pack()

# Perform Set Operation Button
tk.Button(root, text="Perform Set Operation", command=perform_set_operation).pack()

# Venn Diagram Initialization
plt.ion()  # Turn on interactive mode
fig, ax = plt.subplots()
ax.set_title("Venn Diagram")
plt.show()

root.mainloop()
