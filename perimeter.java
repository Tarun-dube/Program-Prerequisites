import java.util.Scanner;

public class perimeter{
   public static void main(String[] args){
         Scanner sc= new Scanner(System.in);
		 
		 System.out.println("enter the length");
		 int x= sc.nextInt();
		 
		 System.out.println("enter the breadth");
		 int y= sc.nextInt();
		 
		 int sum=(x+y)*2;
		 
		 System.out.println(sum);
   }
}