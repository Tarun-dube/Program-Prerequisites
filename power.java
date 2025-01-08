import java.util.Scanner;

public class power{
   public static void main(String[] args){
         Scanner sc= new Scanner(System.in);
		 
		 System.out.println("enter the base");
		 int x= sc.nextInt();
		 
		 System.out.println("enter the exponent");
		 int y= sc.nextInt();
		 
		 
		 double result=Math.pow(x,y);
		 System.out.println(result);
   }
}