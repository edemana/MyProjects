days = int(input("Enter days: "))
hours = int(input("Enter hours: "))
minutes = int(input("Enter minutes: "))
seconds = int(input("Enter seconds: "))

time_in_seconds = days * (24 * 60 * 60) + hours * (60 * 60) + minutes * 60 + seconds

print(f"Time in seconds: {time_in_seconds}")