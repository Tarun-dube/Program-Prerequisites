import java.util.Scanner;

public class average{
   public static void main(String[] args){
         Scanner sc= new Scanner(System.in);
		 
		 System.out.println("enter the first no.");
		 int x= sc.nextInt();
		 
		 System.out.println("enter the second no.");
		 int y= sc.nextInt();
		 
		 System.out.println("enter the third no.");
		 int z= sc.nextInt();
		 
		 
		 double s=(x+y+z)/3;
		 
		 System.out.println(s);
   }
}