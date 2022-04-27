import java.util.*;

class Reverse{
public static void main(String args[]){
System.out.println("Enter a string: ");
Scanner sc= new Scanner(System.in);
String str= sc.next();
char[] ch= str.toCharArray();
String rev="";
for(int i=ch.length-1; i>=0;i--){
rev=rev+ch[i];
}
System.out.println("Reverse string: "+rev);
}

}