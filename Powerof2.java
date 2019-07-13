package Labwork;

import java.util.Scanner;
 public class Powerof2{

	public boolean check(int n) 
	{ 
		int i=2;
		while(i<n)
		{
			i=i*2;
		}
			if(i==n)
			{
			return true;
			}
			else
			{
			return false;
			}
	 }	

	public static void main(String[] args)
	{
		System.out.println(" Enter a number");
		Scanner scanner = new Scanner(System.in);
		
		int k = scanner.nextInt();
		Powerof2 power = new Powerof2();
		boolean y = power.check(k);
		if(y)
		System.out.println(" the number is power of 2");
		else 
			System.out.println(" the number is not power of 2");
		scanner.close();
	}
}
 

