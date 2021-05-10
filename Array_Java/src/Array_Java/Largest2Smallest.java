package Array_Java;
import java.util.Scanner;
public class Largest2Smallest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int max1,max2,min1,min2;
		max1=max2=Integer.MIN_VALUE;
		min1=min2=Integer.MAX_VALUE;
		for(int i=0;i<n;i++) {
			if(a[i]>max1) {
				max2=max1;
				max1=a[i];
			}
			else if(a[i]>max2)
				max2=a[i];
		}
		System.out.println("Largest: "+max1+" & "+max2);
		for(int i=0;i<n;i++) {
			if(a[i]<min1) {
				min2=min1;
				min1=a[i];
			}
			else if(a[i]<min2)
				min2=a[i];
		}
		System.out.println("Smallest: "+min1+" & "+min2);
		
	}
}
