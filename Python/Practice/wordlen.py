text ='I wonder what is this and which word is the longest amoungst all words'
l2 = list()
li = text.split()
for i in li:
    l2.append([len(i),i])
l2.sort(reverse=True)
print(l2[0][1] + " is the longest word")
