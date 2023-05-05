
#=====================Tuple===================

# my_tuple = (12,45,"ejkgneij")
# my_tuple1 = (15,65,[0,-1,4],("Hello","World"))
# print(my_tuple1)

# #Adding only one element to tuple:
# my_tuple2 = ("Oii ek hi element hai",)
# print(my_tuple2)
# # print(type(my_tuple2))

# print(my_tuple1.count(65))
# print(my_tuple1.index(65))
# # print(my_tuple1.len())


#==================Dictionary================
robot = {
    'name':"Chitti",
    'dob':2008,
    'memory':"1 zetabyte",
    'speed': "1 terahertz",
    'love_intrest':"Sana"
}

#print(robot.keys()) Give only a list of keys
#print(robot.items()) List of key value pairs which is a typle
#print(robot.get("dob")) Gives the vlue of the key

#Update will update the value of the key
# robot.update({"memory":"2 zetabyte"})
# print(robot)

#Adding to dictionary
# robot.update({"owner":"Om"})

#Pop takes the key and removes the pair
# robot.pop('memory')

x = robot.popitem()
print(robot)



