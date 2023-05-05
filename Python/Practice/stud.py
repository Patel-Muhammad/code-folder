class Student:
    def __init__(self,name,roll):
        self.name = name
        self.roll = roll
    def __str__(self):
        return (f"Name:{self.name}\nRoll no:{self.roll}\nAge:{self.age}\nMarks:{self.marks}\n")
    def setAge(self):
        self.age = input("Enter age: ")
    def setMarks(self):
        self.marks = input("Enter marks:")

s1 = Student("Muhammad",290)
s1.setAge()
s1.setMarks()
# s1.display()
print(s1)