package Demo;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int n;
      int fact_Vari =1;
      Scanner ss = new Scanner(System.in);
      System.out.println("Enter a number");
      n = ss.nextInt();
      int i = 1;
      while (i<=n) {
    	  fact_Vari *=i;
    	  i++;
      }
      System.out.println("Factorial is : " + fact_Vari);
	}

}
