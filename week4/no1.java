package week4;

import java.util.Scanner;

public class no1 {

	 public static void main(String[] args) {
		 
		 Scanner sc = new Scanner(System.in);
		 int time = sc.nextInt();
		 int result = time;
		 
		 System.out.print(fibo(result));
			 
		 }
	 


	public static int fibo(int n) {
		if(n<=1)
			return n;
		else
			return fibo(n-2)+fibo(n-1);
	}
}