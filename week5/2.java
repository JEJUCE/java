import java.util.Scanner;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
public class no2{
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> lotto = new ArrayList<>(6);
		ArrayList<Integer> number = new ArrayList<>(6);
		ArrayList<Integer> right= new ArrayList<>(6);
		SecureRandom randomNumbers = new SecureRandom();
		int checker = 0; //��ġ�ϴ� ����	
		int k=0;
		
		int lottotype = sc.nextInt();
		
		for(int i=0; i<lottotype;i++) {//���� �Է¹ޱ�
			int num = sc.nextInt();
			number.add(i, num);
			for(int m=0;m<i;m++) {// �ߺ��� �ٽ� �Է�
				if(number.get(i) == number.get(m)){ 
					System.out.print("����! �ٽ� �Է� :");
					number.remove(i);
					i--;
					break;
				}
				
				
			}
		}
		
		
		/*System.out.print("����ڰ� �Է��� ���� :");
		Collections.sort(number);
		for(int i=0; i<lottotype;i++) { //�Է� ���� ����ϱ�
			System.out.printf("%d"+" ", number.get(i));
		}*/
		Collections.sort(number);
		
		for(int i=0; i<lottotype; i++) { //�ζ� ��ȣ �����
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
		System.out.print("\n������ �ζ� ����:"); 
		for(int i=0; i<lottotype; i++) {// �ζ� ��ȣ ���
			System.out.printf("%d"+" ",lotto.get(i));
		}
		
		for(int v=0; v<lottotype;v++) { //��÷ Ȯ��
			for(int m=0;m<lottotype;m++) {
				if(number.get(m) == lotto.get(v)) { 
					checker++;
					int rightone = lotto.get(v);
					right.add(k,rightone); 
					k++;
				}
			}
		}
		System.out.printf("\n��ġ�ϴ� ������ ���� : "+ "%d", checker);
		System.out.print("\n��ġ�ϴ� ���� : ");
		
		for(int i=0; i<k; i++) { // ��ġ�ϴ� ���� ���
			System.out.printf("%d"+" ",right.get(i)); 
		} 
		}
	}
	/*	
		Arrays.sort(number);	
		
		
		

		Arrays.sort(lotto); 	
		
		
		

		for(int v=0; v<6;v++) { //��÷ Ȯ��
			for(int m=0;m<6;m++) {
				if(number[m] == lotto[v]) { 
					checker++;
					right[k]= lotto[v];
					k++;
				}
			}
		}
		System.out.printf("\n��ġ�ϴ� ������ ���� : "+ "%d", checker);
		System.out.print("\n��ġ�ϴ� ���� : ");
		for(int i=0; i<k; i++) { // ��ġ�ϴ� ���� ���
			System.out.print(right[i] + " "); 
		} 
	}	
}	*/