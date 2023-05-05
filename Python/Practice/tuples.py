# t1 = 1,2,3,4
# t2 = 1,
# t3 = tuple((54,32,23))
# print(type(t1))
# print(type(t2))
# print(type(t3))

# tcolor = ("red","blue","green")

# for i in tcolor:
#     print(i)
# print(tcolor[1])

# print(tcolor[1:])

# clr = tcolor[1:]
# print(type(clr))
# print(clr)


# t1 = ("red","blue","green")
# l1 = list(t1)
# l1[0] = "black"
# l1.insert(1,"red")
# l1.append("white")
# t2 = tuple(l1)
# print(t2)
# print(type(t2))


#===============================IMPPPP=======================
# You have a list of words and you want to sort 
# them from longest to shortest:

# text = 'I wonder what is this and which word is the longest amoungst all words'
# words = text.split()
# # print(words)

# li = list()

# for i in words:
#     li.append([len(i),i])
# # print(li)

# li.sort(reverse=True)
# print(li)

# revList = list()

# for x , y in li:
#     revList.append(y)

# print(revList)
# print("Longest word is : " , revList[0])
#===============================/IMPPPP=======================




#===============================IMPPPP=======================
# HOw to sort a dictionary
d1= {'a':4, 'd':13, 'b':9, 'c':6}
li = list(d1.items())
print(li)

li.sort()
print(li)

d1 = dict (li)

print(d1)

# #===============================/IMPPPP=======================

# # Reverese Key: val pair to val:key pair in other dictionary
# # d1 = {
# #     "name": "Muhammad",
# #     "usn": 290
# # }
# # li = list(d1.items())
# # d3 = {}

# # for key,val in li:
# #     d3[val] = key

# # print(d3)
# # d2={}



# # for key in d1:
# #     d2[d1[key]] = key
# # # d2[d1["name"]]="name"

# # print(d2)


# #Change tuple values:

# # tp = ("red","blue","green","black")
# # li = list(tp)
# # li[li.index("black")] = "white"
# # tp2 = tuple(li)
# # print(tp2)


# text=" To understand basic concepts of computational thinking. To understand python python python python python programming for problem solving. To introduce different debugging and unit testing tools. To solve real world problems using data structures. Learn to handle files and exception handling in."


# print("Hello world")
# text = text.lower()
# words = text.split()
# # print(words)
# dist = {}

# for i in words:
#     if i not in dist:
#         dist[i] = 1
#     else:
#         dist[i] = dist[i] + 1

# # print(dist)
# print("=====================================================")

# li = list(dist.items())
# # print(li)
# newDist = list()

# for key,val in li:
#     newDist.append([val,key])

# newDist.sort(reverse=True)

# # print(newDist)

# print("The most occured word: " ,newDist[0][1] )
# print("Number of occurences: ",newDist[0][0])

