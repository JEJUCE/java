import java.util.Scanner;
 
public class text {
    public static void main(String[] args) {
        
        int alphabet[] = new int[26];
        
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            alphabet[ch - 'a']++;
        }
        
        // 아스키코드에서 영어소문자는 
        // 97 = 'a' 부터  ----- 122 = 'z' 까지입니다.
        
        // 만약에 영어대문자부터 하고 싶다면
        // 65 = 'A' 부터 ----- 90 = 'Z' 까지입니다.
        
        for(int i = 0; i < 26; i++) {
            System.out.println((char)(97+i) + ":" + alphabet[i]);
        }
    }
}