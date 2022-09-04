import java.util.Scanner;

public class for_loop{
   public static void main(String args[])
   {
      System.out.println("Enter the limit....");
	  Scanner in = new Scanner(System.in);
	  int n = in.nextInt();
	  for(int i=2;i<=n;i=i+2)
	  {  
	     System.out.println(i);
	  }
   }
}