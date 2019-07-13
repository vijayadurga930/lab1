package Labwork;

import java.util.Scanner;
class DifferenceSquares{
	 public int Difference(int n)
	 {
	      int i,y=0,sum=0,sum2=0;
	      {
		 for ( i=1;i<=n;i++) 
			{
			sum=sum+i*i;
			}
	for( int j=1;j<=n;j++)	          
		           	{
		        	   sum2= sum2+j;
		           	}
		        	y= (sum2*sum2)-sum;
			 return y ;
	      }
	   }
	
	public static void main(String[] args) {
		DifferenceSquares obj = new DifferenceSquares();
		System.out.println(" Enter the value of k");
		Scanner scanner = new Scanner(System.in);
		
		int number = scanner.nextInt();
	 System.out.println(" sum:" + obj.Difference(number));
		 scanner.close();

	}

	

}
