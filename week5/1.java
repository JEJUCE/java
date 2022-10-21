import java.util.Scanner;
import java.security.SecureRandom;
import java.util.Arrays;



public class 1 {
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		int lotto[] = new int [6]; 
		int number[] = new int [6];
		int right[]= new int [6];
		SecureRandom randomNumbers = new SecureRandom();
		int checker = 0; //일치하는 갯수	
		int k=0;

		for(int i=0; i<6;i++) {//���� �Է¹ޱ�


		for(int i=0; i<6;i++) {//숫자 입력받기

			number[i] = sc.nextInt();
			for(int m=0;m<i;m++) {// 중복시 다시 입력
				if(number[i] == number[m]) { 
					System.out.print("오류! 다시 입력 :");
					i--; 
					break;
				}
				
			}
		}
		System.out.print("사용자가 입력한 숫자 :");
		Arrays.sort(number);	
		for(int i=0; i<6;i++) { //입력 숫자 출력하기
			System.out.print(number[i]+" ");
		}
		
		for(int i=0; i<6; i++) { //로또 번호 만들기
			lotto[i] = randomNumbers.nextInt(45)+1; 
			
			for(int j=0; j<i; j++) { 
				if(lotto[i] == lotto[j]) { 
					i--; 
					break; 
				} 
			} 
		} 

		Arrays.sort(lotto); 	
		System.out.print("\n생성된 로또 숫자:"); 
		
		for(int i=0; i<6; i++) {// 로또 번호 출력
			System.out.print(lotto[i]+" ");
		}

		for(int v=0; v<6;v++) { //당첨 확인
			for(int m=0;m<6;m++) {
				if(number[m] == lotto[v]) { 
					checker++;
					right[k]= lotto[v];
					k++;
				}
			}
		}
		System.out.printf("\n일치하는 숫자의 개수 : "+ "%d", checker);
		System.out.print("\n일치하는 숫자 : ");
		for(int i=0; i<k; i++) { // 일치하는 숫자 출력
			System.out.print(right[i] + " "); 
		} 
	}	
}	