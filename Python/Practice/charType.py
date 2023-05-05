text = "DSU@e123.-learning"
d1={
    'letter' : 0,
    'digit': 0,
    'lower':0,
    'upper':0
}

for i in text:
    if(i.isalpha()):
        d1['letter'] += 1
    if(i.isdigit()):
        d1['digit'] += 1
    if(i.isupper()):
        d1['upper'] += 1
    if(i.isalpha()):
        d1['lower'] += 1
    
print(d1)