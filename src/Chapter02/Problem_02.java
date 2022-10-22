package Chapter02;

import java.util.Scanner;

public class Problem_02 {
    public static void main(String[] args) {
        int a, b, n;

        Scanner scanner = new Scanner(System.in);

        System.out.print("첫번째 계산할 값을 입력하세요 ==> ");
        a = scanner.nextInt();

        System.out.print("<1>덧셈 <2>뺄셈 <3>곱셈 <4>나눗셈 ==> ");
        n = scanner.nextInt();

        System.out.print("두번째 계산할 값을 입력하세요 ==> ");
        b = scanner.nextInt();

        if (n == 1) {
            System.out.printf("%d+%d=%d\n", a, b, a + b);
        } else if (n == 2) {
            System.out.printf("%d-%d=%d\n", a, b, a - b);
        } else if (n == 3) {
            System.out.printf("%d*%d=%d\n", a, b, a * b);
        } else if (n == 4) {
            System.out.printf("%d/%d=%d\n", a, b, a / b);
        }
    }
}
