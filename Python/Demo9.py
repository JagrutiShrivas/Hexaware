f=open("Emp.txt", "w");

name=input("Enter name: ");
age=input("Enter age: ");
salary=input("Enter salary: ");
desig=input("Enter desig: ");
myrecord=(name, age, salary, desig)


for i in myrecord:
    f.write(i);
    f.write('\t');

f.close();
