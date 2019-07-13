package Labwork;

import java.util.Scanner;

public class IncreasingOrder {

	public boolean check(int num) {
		int n=num;
		int reminder=n%10;
		n=n/10;
		int flag=1;
		while(n>0)
		{
			
			if((reminder>n%10) && flag==1)
				{
				 reminder=n%10;
				 n=n/10;
				}
			else
			{
				flag=0;
				reminder=n%10;
				n=n/10;
		     }
		}
		if(flag==1)
			return true;
		else
			return false;
	}
	
	

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt();
		IncreasingOrder obj = new IncreasingOrder();
		 boolean y = obj.check(k);
		System.out.println(y);
		scanner.close();
		
		
		
		 
		
	}


	
}
