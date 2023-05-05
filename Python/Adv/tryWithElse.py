#else will run when try will run
try:
    a = input("Enter a number: ")
    c = 1/int(a)
except Exception as e:
    print(e)
else:
    print("There was no exception!")