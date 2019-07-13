package Labwork;

import java.util.Scanner;

public class CalculateSum {
	int i=1,count=0;
	private int check(int n) {
		
		for (i=1;i<=n;i++)
		{
			if(i%3==0 || i%5==0)
			{
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println(" Enter the value of k:");
		Scanner scanner= new Scanner(System.in);
		int k = scanner.nextInt();
		CalculateSum Sum = new CalculateSum();
		int y= Sum.check(k);
		System.out.println(y);
		scanner.close();
		
	}

	

}
