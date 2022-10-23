package Chapter09;

import java.util.Scanner;

public class Problem_24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("문자열을 입력하세요 : ");
        String string = scanner.nextLine();
        String newStr = "";

        for(int i = 0; i < string.length(); i++){
            if(string.charAt(i) >= 'A' && string.charAt(i) <= 'Z'){
                newStr += (char) (string.charAt(i) + 'a' - 'A');
            }else if(string.charAt(i) >= 'a' && string.charAt(i) <= 'z'){
                newStr += (char) (string.charAt(i) + 'A' - 'a');
            }else{
                newStr += string.charAt(i);
            }
        }

        System.out.printf("변환된 문자열 ==> %s", newStr);
    }
}
