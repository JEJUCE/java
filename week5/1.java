import java.util.Scanner;
import java.security.SecureRandom;
import java.util.Arrays;

public class no1 { 
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		int lotto[] = new int [6]; 
		int number[] = new int [6];
		int right[]= new int [6];
		SecureRandom randomNumbers = new SecureRandom();
		int checker = 0; //��ġ�ϴ� ����	
		int k=0;
		
		for(int i=0; i<6;i++) {//���� �Է¹ޱ� 
			number[i] = sc.nextInt();
			for(int m=0;m<i;m++) {// �ߺ��� �ٽ� �Է�
				if(number[i] == number[m]) { 
					System.out.print("����! �ٽ� �Է� :");
					i--; 
					break;
				}
				
			}
		}
		System.out.print("����ڰ� �Է��� ���� :");
		Arrays.sort(number);	
		for(int i=0; i<6;i++) { //�Է� ���� ����ϱ�
			System.out.print(number[i]+" ");
		}
		
		for(int i=0; i<6; i++) { //�ζ� ��ȣ �����
			lotto[i] = randomNumbers.nextInt(45)+1; 
			
			for(int j=0; j<i; j++) { 
				if(lotto[i] == lotto[j]) { 
					i--; 
					break; 
				} 
			} 
		} 

		Arrays.sort(lotto); 	
		System.out.print("\n������ �ζ� ����:"); 
		
		for(int i=0; i<6; i++) {// �ζ� ��ȣ ���
			System.out.print(lotto[i]+" ");
		}

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
}	