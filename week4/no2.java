package week4;
import java.util.Scanner;

public class no2 {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		int base = sc.nextInt();
		int exponet = sc.nextInt();

		System.out.print(powers(base,exponet));
	}
	 
	public static int powers(int n , int j) {
			if(j==1)
				return n;
			else
				return n*powers(n,j-1);
		}

}