abstract class A{
	abstract void loan();
	abstract void mini();
	void abc(){
	System.out.print("Hi");	
}
}

abstract class B extends A{
	void loan(){
	System.out.println("Hi Demo");
	
}

void mini(){
}

abstract void OT();
}


class Demo extends B{
void OT(){}
}
class Abst{
	public static void main(String args[]){

	Demo d= new Demo();
	d.OT(); d.loan(); d.mini();
}


}