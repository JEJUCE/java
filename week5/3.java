import java.util.Scanner;
public class 3 {
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
               
		for(int i = 0; i <= N; i++) {
			primechecking(i);
		}
    
	}
  
	public static void primechecking(int number) {
		if(number < 2) {
			return;
		}
		
		if(number == 2) {
			System.out.println(number);
			return;
		}
		
        
		for(int i = 2; i < number; i++) {
			if(number % i == 0) {
				return;
			}
		}
		System.out.println(number);
		return;
	}
 
 
}