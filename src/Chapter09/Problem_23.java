package Chapter09;

import java.util.Scanner;

public class Problem_23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("문자열을 입력하세요 : ");
        String string = scanner.nextLine();
        String rev = "";

        for(int i = string.length() - 1; i >= 0; i--){
            rev += string.charAt(i);
        }

        System.out.printf("내용을 거꾸로 출력 ==> %s", rev);
    }
}
