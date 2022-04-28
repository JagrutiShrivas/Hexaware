import java.util.*;
import java.io.*;


class A{
void abc() throws MinAgeException{
Scanner sc= new Scanner(System.in);
System.out.print("Enter age: ");
int age= sc.nextInt();
if(age<18){
throws new MinAgeException("Age must be more than 18");
}
else{
System.out.println("Eligible");
}
}

}
class EHDemo3{
public static void main(String args[]){
try{
A a= new A();
a.abc();
}

catch(MinAgeException me){
System.out.println(me);
}
catch(Exception e){
System.out.println(e);
}
}


class MinAgeException extends Exception{
MinAgeException(String str){
super(str);
}

}
}
}




















