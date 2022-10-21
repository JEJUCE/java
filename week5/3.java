import java.util.Scanner;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
public class 3{
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
