import java.util.Scanner;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;


public class 2{ 

	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> lotto = new ArrayList<>(6);
		ArrayList<Integer> number = new ArrayList<>(6);
		ArrayList<Integer> right= new ArrayList<>(6);
		SecureRandom randomNumbers = new SecureRandom();
		int checker = 0; //일치하는 갯수	
		int k=0;
		
		int lottotype = sc.nextInt();
		
		for(int i=0; i<lottotype;i++) {//숫자 입력받기
			int num = sc.nextInt();
			number.add(i, num);
			for(int m=0;m<i;m++) {// 중복시 다시 입력
				if(number.get(i) == number.get(m)){ 
					System.out.print("오류! 다시 입력 :");
					number.remove(i);
					i--;
					break;
				}
				
				
			}
		}
		
		
		/*System.out.print("사용자가 입력한 숫자 :");
		Collections.sort(number);
		for(int i=0; i<lottotype;i++) { //입력 숫자 출력하기
			System.out.printf("%d"+" ", number.get(i));
		}*/
		Collections.sort(number);
		
		for(int i=0; i<lottotype; i++) { //로또 번호 만들기
			int num = randomNumbers.nextInt(10)+1;
			lotto.add(i,num);	
			for(int j=0; j<i; j++) { 
				if(lotto.get(i) == lotto.get(j)) { 
					lotto.remove(i);
					i--;
					break; 
				} 
			} 
		} 
		Collections.sort(lotto);
		System.out.print("\n생성된 로또 숫자:"); 
		for(int i=0; i<lottotype; i++) {// 로또 번호 출력
			System.out.printf("%d"+" ",lotto.get(i));
		}
		
		for(int v=0; v<lottotype;v++) { //당첨 확인
			for(int m=0;m<lottotype;m++) {
				if(number.get(m) == lotto.get(v)) { 
					checker++;
					int rightone = lotto.get(v);
					right.add(k,rightone); 
					k++;
				}
			}
		}
		System.out.printf("\n일치하는 숫자의 개수 : "+ "%d", checker);
		System.out.print("\n일치하는 숫자 : ");
		
		for(int i=0; i<k; i++) { // 일치하는 숫자 출력
			System.out.printf("%d"+" ",right.get(i)); 
		} 
		}
	}
