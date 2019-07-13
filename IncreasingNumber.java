package Labwork;

import java.util.Scanner;
 public class IncreasingNumber {
	 public int check(int n) {
	 int i=0,sum=0,reminder=0;
	 while(n>0)
	 {
		 reminder=n%10;
		 reminder++;
		 sum= sum+(int) Math.pow(10, i) * reminder;
		 i++;
		 n=n / 10;
	 }
	 return sum;
	 }
	 
	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt();
		IncreasingNumber obj = new IncreasingNumber();
		int results= obj.check(k);
		System.out.println(" answer is:" +results);
		scanner.close();
		
		

	}

	

}
