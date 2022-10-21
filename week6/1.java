import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
public class 1 { 
	public static void main(String[] args) { 
		
		ArrayList<Integer> lotto = new ArrayList<>(6);
		ArrayList<Integer> right= new ArrayList<>(6);
		ArrayList<Integer> number = new ArrayList<>(6);
		SecureRandom randomNumbers = new SecureRandom();
		int checker = 0; //일치하는 갯수	
		int k=0;
		
		int[] nums = Arrays.stream(args).mapToInt(Integer::parseInt).toArray(); 
		
		for(int i=0; i<nums.length;i++) {
			int[] numm = Arrays.stream(args).mapToInt(Integer::parseInt).toArray(); 
			number.add(numm[i]);
		}
		
		System.out.print("로또 숫자 갯수와 숫자를 입력하세요  :");
		System.out.println(number);
		
		System.out.print("\n사용자가 입력한 숫자:");
		for(int i=1; i<nums.length;i++) { //입력 숫자 출력하기
			
			System.out.print(nums[i]+" ");
		}
		for(int i=0; i<nums.length; i++) { //로또 번호 만들기
			int num = randomNumbers.nextInt(45)+1;
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
		for(int i=0; i<nums.length; i++) {// 로또 번호 출력
			System.out.printf("%d"+" ",lotto.get(i));
		}

		for(int v=0; v<nums.length;v++) { //당첨 확인
			for(int m=0;m<nums.length;m++) {
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