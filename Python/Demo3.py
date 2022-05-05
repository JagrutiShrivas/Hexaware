'''def create():
    id= input("Enter id: ");
    name= input("Enter name: ");
    age= input("Enter age: ");
    salary= input("Enter salary: ");
    desig= input("Enter designation: ");
print("=====================");
print("ID: ",id);
print("",);
print("",);
print("",);'''


def abc():
    for i in range(10):
        print("Function", i);
    

abc();

class Demo:
    def __init__(self):
        for i in range(10):
            print("Constructor", i);

    def display(self):
        for i in range(10):
            print("Method", i);

d= Demo();
d.display();
