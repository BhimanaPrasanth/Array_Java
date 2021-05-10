package Array_Java;
import java.util.Scanner;
public class ArraySearch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.println("Enter Ele to Search:");
		int ele=sc.nextInt();
		int flag=0,i;
		for(i=0;i<n;i++)
			if(a[i]==ele) {
				flag=1;
				break;
			}
		if(flag==1)
			System.out.println(ele+" at pos "+(i+1));
		else
			System.out.println(-1);
			
	}

}
