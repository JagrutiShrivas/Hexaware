class Clerk:
    salary= 15000;
    desig= "Clerk";

    def __init__(self):
        self.uid=input("Enter id: ");
        self.name=input("Enter name: ");
        self.age=input("Enter age: ");

    def display(self):
        print("Emp details...........");
        print("Name is ", self.name);
        print("ID is ", self.uid);
        print("age is ", self.age);
        print("Salary is ", self.salary);
        print("Desig is ", self.desig);

    def raiseSal(self):
        print("After raising salary....");
        print("Name is ", self.name);
        print("ID is ", self.uid);
        print("Age is ", self.age);
        print("Salary is ", self.salary+2000);
        print("Desig is ", self.desig);
e=Clerk();
e.display();
e.raiseSal();
