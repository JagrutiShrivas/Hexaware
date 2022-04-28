class A{
static int a=1000;
static void abc(){
System.out.println("Hi abc method");
}
}

class Demo4{
public static void main(String args[]){

A a= new A();
A.abc();
a.abc();
System.out.println(A.a);
}
}