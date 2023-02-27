/*
Spy Number in java
ex.1
n=132
sum(n)=1+3+2=6
product(n)=1*3*2=6
sum(n)==product(n)
6==6
132 is Spy Number

ex.2
217 is not a spy number
*/
import java.util.Scanner;

class Spy
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Enter the number to check = ");
		int n = sc.nextInt();
		int bup=n;
		int sum=0;
		int product=1;
		while(n>0)
		{
			int rem = n%10;
			sum = sum + rem;
			product = product*rem;
			n = n/10;
		}
		System.out.println("\n Sum = "+sum);
		System.out.println("\n Product = "+product);
		if(sum==product)
		{
			System.out.println("\n\t"+bup+" is spy number");
		}
		else
		{
			System.out.println("\n\t"+bup+" is not spy number");
		}
	}
}























