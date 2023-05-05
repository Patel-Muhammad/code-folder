text = "My name is Muhammad and i am studing in the is me the i"
l = text.split()
d1 = dict ()
for i in text:
    if(i in d1):
        d1[i] = d1[i] + 1
    else:
        d1[i] = 1
li = list(d1.items())
li.sort()
print(li)

