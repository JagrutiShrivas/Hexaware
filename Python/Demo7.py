class Emp:
    def __init__(self, name, age, salary, desig):
        self.name=name;
        self.age=age;
        self.salary=salary;
        self.desig=desig;

    def display(self):
        print("My name is: ", self.name, "Age is: ",self.age);

class Clerk(Emp):
    def __init__(self,name, age, salary, desig):
        Emp.__init__(self, name, age, salary, desig)

c=Clerk("Ram", 22, 30000, "Clerk");
c.display();
