package Chapter06;

import java.util.Scanner;

public class Problem_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("글자를 입력 : ");
        String string = scanner.nextLine();

        System.out.printf("입력된 문자열 ==> %s\n", string);
        System.out.printf("변환된 문자열 ==> ");

        for (int i = string.length() - 1; i >= 0; i--) {
            System.out.printf("%c", string.charAt(i));
        }
    }
}
