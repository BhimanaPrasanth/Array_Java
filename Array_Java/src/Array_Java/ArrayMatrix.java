package Array_Java;
import java.util.Scanner;
public class ArrayMatrix {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int i,j;
	    System.out.println("Please enter 9 integer numbers: ");
		  int n=sc.nextInt();
		  int a[][]=new int[n][n];
		  for(i=0;i<n;i++)
		  {
		      for(j=0;j<n;j++)
		      {
			  a[i][j]=sc.nextInt();
		      }
		  }
		  
		  System.out.println("The given array is :");
		  for(i=0;i<n;i++)
		  {
		  for(j=0;j<n;j++)
		  {
		      System.out.print(a[i][j]+" ");
		  }
		  System.out.print("\n");
		  }
	}
}


