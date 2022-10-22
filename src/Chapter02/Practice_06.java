package Chapter02;

import java.util.Scanner;

public class Practice_06 {
    public static void main(String[] args) {
        int a, b, c, d;

        Scanner scanner = new Scanner(System.in);

        System.out.print("첫번째 계산할 값을 입력하세요 ==> ");
        a = scanner.nextInt();

        System.out.print("두번째 계산할 값을 입력하세요 ==> ");
        b = scanner.nextInt();

        System.out.print("세번째 계산할 값을 입력하세요 ==> ");
        c = scanner.nextInt();

        System.out.print("네번째 계산할 값을 입력하세요 ==> ");
        d = scanner.nextInt();

        System.out.printf("%d+%d-%d*%d=%d\n", a, b, c, d, a + b - c * d);
    }
}
