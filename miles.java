import java.util.Scanner;

public class miles{
   public static void main(String[] args){
         Scanner sc= new Scanner(System.in);
		 
		 System.out.println("enter the distance in km");
		 int x= sc.nextInt();
		 
		 double m=x*0.621371;
		 
		 
		 System.out.println(m);
   }
}