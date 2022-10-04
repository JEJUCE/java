package week4;
import java.util.Scanner;

public class no3 {


	
	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		System.out.print("which Dimension do you calculate?");
		double dimension = sc.nextDouble();
		
		if (dimension == 2) {
			double x1 = sc.nextDouble();  
			double y1 = sc.nextDouble(); 
			double x2 = sc.nextDouble();  
			double y2 = sc.nextDouble();
			System.out.print(distance(x1,y1,x2,y2));
		}
		if(dimension == 3) {
			double x1 = sc.nextDouble();
			double y1 = sc.nextDouble(); 
			double z1 = sc.nextDouble(); 
			double x2 = sc.nextDouble();  
			double y2 = sc.nextDouble();
			double z2 = sc.nextDouble();
			System.out.print(distance(x1,y1,z1,x2,y2,z2));
		}
		
	}
		

			
	
	
	 
public static double distance(double x1 , double y1, double x2, double y2) {
	return Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
}

public static double distance(double x1 , double y1, double z1, double x2, double y2, double z2) {
	return Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2)+(z1-z2)*(z1-z2));
}
}