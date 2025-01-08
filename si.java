import java.util.Scanner;

public class si{
   public static void main(String[] args){
         Scanner sc= new Scanner(System.in);
		 
		 System.out.println("enter the principle");
		 int x= sc.nextInt();
		 
		 System.out.println("enter the rate");
		 int y= sc.nextInt();
		 
		 System.out.println("enter the time");
		 int z= sc.nextInt();
		 
		 
		 double s=(x*y*z)/100;
		 
		 System.out.println(s);
   }
}