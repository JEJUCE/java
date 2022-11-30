import java.util.Scanner;
 
public class Main {
	
	public static void main(String[] args) {	
		int cnt[] = new int[26]; 	
		Scanner sc = new Scanner(System.in);			
		String str = sc.nextLine();
		String[] splitStr = str.split("\\s+");
		
		System.out.println("word length    occurrences");
			for(int k = 0 ; k < splitStr.length ; k++){
				cnt[splitStr[k].length()]++;		
			}	
			
		for (int j = 1; j <splitStr.length+1 ; j++ ){				
			System.out.println("    "+ j + "              " + cnt[j]);			
		}	
	}
}

