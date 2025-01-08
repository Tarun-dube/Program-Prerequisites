import java.util.Scanner;

public class volume{
   public static void main(String[] args){
         Scanner sc= new Scanner(System.in);
		 
		 System.out.println("enter the radius");
		 int x= sc.nextInt();
		 
		 System.out.println("enter the height");
		 int y= sc.nextInt();
		 
		 double volume= 3.14*x*x*y;
		 
		 System.out.println(volume);
   }
}