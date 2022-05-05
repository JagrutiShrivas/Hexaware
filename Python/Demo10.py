import os.path

myfile= input("Enter file name where you want to write: ");
mf=os.path.exists(myfile);

if(mf):
    f=open(myfile, "w");
    name=input("Enter name: ");
    age=input("Enter age: ");
    salary=input("Enter salary: ");
    desig=input("Enter desig: ");
    myrecord=(name, age, salary, desig)

    for i in myrecord:
        f.write(i);
        f.write('\t');

    f.close();

else:
    print("File not found");
