import java.util.*;

class Palindrome{
public static void main(String args[])  
   {  String str, rev= "";  
      Scanner sc = new Scanner(System.in);   
      System.out.println("Enter a string or number");  
      str = sc.nextLine();   
      int len = str.length();   
      for ( int i = len- 1; i >= 0; i-- )  
         rev= rev+ str.charAt(i);  
      if (str.equals(rev))  
         System.out.println("Palindrome.");  
      else  
         System.out.println("Not a Palindrome.");   
   }  

}