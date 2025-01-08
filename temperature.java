import java.util.Scanner;

public class temperature{
   public static void main(String[] args){
         Scanner sc= new Scanner(System.in);
		 
		 System.out.println("enter the temperature");
		 int x= sc.nextInt();
		 
		 int f=(x*9/5)+32;
		 
		 
		 System.out.println(f);
   }
}