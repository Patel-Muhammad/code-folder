class Person:
    def __init__(self,n,age,adh,gen):
        self.name = n
        self.age = age
        self.adhar = adh
        self.gender = gen
    def intro(self):
        print(f"Hello I am a Person, and my name is {self.name}")
        

class Emp(Person):
    gen = "M"
    def __init__(self,n,age,sal,gen):
        super().__init__(self,n,age,gen)
        self.sal = sal

    def intro(self):
        print(f"Hello I am an Employee, and my name is {self.name}")


p1 = Person("Muhammad",19,737609,"M")
e1 = Emp("Ash",21,10,"m")

