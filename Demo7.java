import java.util.Scanner;
class Emp{
String name;
String desig;
Emp(){
Scanner sc= new Scanner(System.in);
System.out.println("Name: ");
name= sc.next();
System.out.println("Desig: ");
desig= sc.next();
}
}

class clerk extends Emp{
clerk(){
void display(){
System.out.println("Name: "+name);
System.out.println("Desig: "+desig);
}
}
}
class dev extends Emp{
dev(){
void display(){
System.out.println("Name: "+name);
System.out.println("Desig: "+desig);
}
}
}
class tester extends Emp{
tester(){
void display(){
System.out.println("Name: "+name);
System.out.println("Desig: "+desig);
}
}
}
class Demo7{
public static void main(String args[]){
clerk c= new clerk();
c.display();

dev d= new dev();
d.display();

tester t= new tester();
t.display();
}
}