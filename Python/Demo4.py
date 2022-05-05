def abc():
    for i in range(10):
        print("Function", i);
    

abc();

class Demo:
    def __init__(self, uid, name, age):
        for i in range(10):
            print("Constructor", uid, name, age);

    def display(self, salary, desig):
        for i in range(10):
            print("Method", i, salary, desig);

d= Demo(100, "Jagruti", 22);
d.display(5000, 'Clerk');
