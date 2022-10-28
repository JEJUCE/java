import java.util.ArrayList;
import java.util.Scanner;
public class 1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> name = new ArrayList<>();
		ArrayList<String> longest = new ArrayList<>();
			
		for(int i=0; i<5;i++) {//숫자 입력받기
			String names = sc.nextLine();
			name.add(i, names);	
		}
		
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
			
			if(name.get(i).length() > name.get(j).length()) {
				longest.add(0,name.get(i)); 
			}
			if(name.get(i).length() < name.get(j).length()){
				longest.add(0,name.get(j)); 
			}
		System.out.print(longest.get(0));
		}
		
		
	}	

}
}
