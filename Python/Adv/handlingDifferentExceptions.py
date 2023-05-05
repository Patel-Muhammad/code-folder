try:
    a = int(input("Enter a number: "))
    c = 1/a
    print(c)
except ValueError as v:
    print(v)
    print("Input is NaN")
except ZeroDivisionError as z:
    print(z)
    print("Cannot divide by zero")
print("Thanks for using..")
