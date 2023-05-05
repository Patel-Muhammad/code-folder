#finally will run regardless of try or exception
#Even if the program is exited the finally will run but normally it would have not ran
try:
    a = int(input("Enter a number: "))
    c = 1 / a
    print(c)
except Exception as e:
    print(e)
    exit()
finally:
    print("Finallay is executed regadless of try or exception or event if the program is exited")

print("But if program is exited, this won't be printed")