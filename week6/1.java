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
		int checker = 0; //��ġ�ϴ� ����	
		int k=0;
		
		int[] nums = Arrays.stream(args).mapToInt(Integer::parseInt).toArray(); 
		
		for(int i=0; i<nums.length;i++) {
			int[] numm = Arrays.stream(args).mapToInt(Integer::parseInt).toArray(); 
			number.add(numm[i]);
		}
		
		System.out.print("�ζ� ���� ������ ���ڸ� �Է��ϼ���  :");
		System.out.println(number);
		
		System.out.print("\n����ڰ� �Է��� ����:");
		for(int i=1; i<nums.length;i++) { //�Է� ���� ����ϱ�
			
			System.out.print(nums[i]+" ");
		}
		for(int i=0; i<nums.length; i++) { //�ζ� ��ȣ �����
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
		System.out.print("\n������ �ζ� ����:"); 
		for(int i=0; i<nums.length; i++) {// �ζ� ��ȣ ���
			System.out.printf("%d"+" ",lotto.get(i));
		}

		for(int v=0; v<nums.length;v++) { //��÷ Ȯ��
			for(int m=0;m<nums.length;m++) {
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