while(True):
    print("Press q to Quit :(")
    a = input("Enter a number: ")
    if(a =='q'):
        break
    try:
        print('Trying...')
        if(int(a) > 6):
            print("Number is greater than 6!")
    except Exception as e:
        print(f'Wrong input! Error: {e}')
print('Thanks for playing the game!')
    
    