import java.util.*;

class Fibonacci{

	public static void main(String args[])
	{
		int n,firstterm=0,secondterm=1,count=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number:");
		n= sc.nextInt();
		System.out.println("Fibonacci series upto" + n);
		while(count<n)
		{
			System.out.println(firstterm + " ");
			int nextterm = firstterm +secondterm;
			firstterm = secondterm;
			secondterm = nextterm;
			count++;

		}
	}
}