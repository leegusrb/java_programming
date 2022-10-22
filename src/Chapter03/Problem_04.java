package Chapter03;

import java.util.Scanner;

public class Problem_04 {
    public static void main(String[] args) {
        int n;

        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력하세요 ==> ");
        n = scanner.nextInt();

        System.out.println("10진수 ==> " + n);
        System.out.println("16진수 ==> " + Integer.toHexString(n).toUpperCase());
        System.out.println("8진수 ==> " + Integer.toOctalString(n));
    }
}
