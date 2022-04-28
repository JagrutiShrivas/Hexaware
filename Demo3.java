import java.util.Scanner;
class A{
A(){
Scanner sc= new Scanner(System.in);

System.out.println("Enter ID");
int id= sc.nextInt();

System.out.println("Enter name");
String name= sc.next();

System.out.println("Enter age");
int age= sc.nextInt();

System.out.println("Enter salary");
int salary= sc.nextInt();

System.out.println("Enter designation");
String desig= sc.next();

System.out.println("ID is: "+id);
System.out.println("Name is: "+name);
System.out.println("Age is: "+age);
System.out.println("Salary is: "+salary);
System.out.println("Designation is: "+desig);
}
}
class Demo3{
public static void main(String args[]){
A a= new A();
}
}