package Chapter02;

import java.io.IOException;
import java.util.Scanner;

public class Problem_03 {
    public static void main(String[] args) throws IOException {
        int a, b;
        char c;

        Scanner scanner = new Scanner(System.in);

        System.out.print("첫번째 계산할 값을 입력하세요 ==> ");
        a = scanner.nextInt();

        System.out.print("+ - * / % ==> ");
        c = (char)System.in.read();

        System.out.print("두번째 계산할 값을 입력하세요 ==> ");
        b = scanner.nextInt();

        if (c == '+') {
            System.out.printf("%d+%d=%d\n", a, b, a + b);
        } else if (c == '-') {
            System.out.printf("%d-%d=%d\n", a, b, a - b);
        } else if (c == '*') {
            System.out.printf("%d*%d=%d\n", a, b, a * b);
        } else if (c == '/') {
            if (b == 0){
                System.out.println("0으로 나누면 안됩니다.");
            }else {
                System.out.printf("%d/%d=%d\n", a, b, a / b);
            }
        } else if (c == '%') {
            if (b == 0){
                System.out.println("0으로 나누면 안됩니다.");
            }else {
                System.out.printf("%d%%%d=%d\n", a, b, a % b);
            }
        }
    }
}
