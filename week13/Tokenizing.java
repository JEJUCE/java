import java.util.Scanner;

public class Tokenizing {
	
	public static void main(String[] args) {	
		int cnt[] = new int[26]; 	
		Scanner sc = new Scanner(System.in);			
		System.out.println("Input: ");
		String str = sc.nextLine();
		String[] splitStr = str.split("-");
		
		System.out.println("Output:");

		for (int j = 1; j <splitStr.length+1 ; j++ ){				
			System.out.println(splitStr[j]);			
		}

}
	}

