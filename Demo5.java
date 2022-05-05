// Assignment 1


import java.util.Scanner;

class Clerk
{

static String desig="Clerk";
static int salary= 15000;
int id;
String name;
int age;
Clerk(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter ID");
        id=sc.nextInt();
        System.out.println("Enter Name");
        name=sc.next();
        System.out.println("Enter Age");
	age=sc.nextInt();
    }
void display(){
System.out.println("ID is:"+id);
System.out.println("Name is:"+name);
System.out.println("Age is:"+age);
System.out.println("Designation is:"+desig);
System.out.println("Salary is:"+salary);
}
}

class Developer
{
static String desig="Developer";
static int salary= 25000;
int id;
String name;
int age;
Developer(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter ID");
        id=sc.nextInt();
        System.out.println("Enter Name");
        name=sc.next();
        System.out.println("Enter Age");
	age=sc.nextInt();
    }
void display(){
System.out.println("ID is:"+id);
System.out.println("Name is:"+name);
System.out.println("Age is:"+age);
System.out.println("Designation is:"+desig);
System.out.println("Salary is:"+salary);
}
}

class Tester
{
static String desig="Tester";
static int salary= 20000;
int id;
String name;
int age;
Tester(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter ID");
        id=sc.nextInt();
        System.out.println("Enter Name");
        name=sc.next();
        System.out.println("Enter Age");
	age=sc.nextInt();

    }
void display(){
System.out.println("ID is:"+id);
System.out.println("Name is:"+name);
System.out.println("Age is:"+age);
System.out.println("Designation is:"+desig);
System.out.println("Salary is:"+salary);
}
}

class Manager
{
static String desig="Manager";
static int salary= 50000;
int id;
String name;
int age;

Manager(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter ID");
        id=sc.nextInt();
        System.out.println("Enter Name");
        name=sc.next();
        System.out.println("Enter Age");
	age=sc.nextInt();
    }
void display(){
System.out.println("ID is:"+id);
System.out.println("Name is:"+name);
System.out.println("Age is:"+age);
System.out.println("Designation is:"+desig);
System.out.println("Salary is:"+salary);
}
}

class Demo5{
public static void main(String args[]){
/*Clerk cl= new Clerk();
Developer dev= new Developer();
Tester tst= new Tester();
Manager mg= new Manager();*/

System.out.println("Enter a number between 1-5");
Scanner sc= new Scanner(System.in);
 int n=sc.nextInt();
        if(n>0 && n<=5){
            switch(n){
                case 1:
                   Clerk cl=new Clerk();
                    cl.display();
                    break;
                case 2:
                    Developer dev=new Developer();
                    dev.display();
                    break;
                case 3:
                    Tester tst=new Tester();
                    tst.display();
                    break;
                case 4:
                   Manager mg=new Manager();
                    mg.display();
                    break;
                case 5:
                    System.out.println("Exit, Thank you");
}
}
}
}




































