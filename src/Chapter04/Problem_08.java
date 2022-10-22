package Chapter04;

import java.util.Scanner;

public class Problem_08 {
    public static void main(String[] args) {
        double a, b;

        Scanner scanner = new Scanner(System.in);

        System.out.print("첫번째 계산할 값을 입력하세요 ==> ");
        a = scanner.nextDouble();

        System.out.print("두번째 계산할 값을 입력하세요 ==> ");
        b = scanner.nextDouble();

        System.out.printf("%.2f + %.2f = %.2f\n", a, b, a + b);
        System.out.printf("%.2f - %.2f = %.2f\n", a, b, a - b);
        System.out.printf("%.2f * %.2f = %.2f\n", a, b, a * b);
        System.out.printf("%.2f / %.2f = %.2f\n", a, b, a / b);
        System.out.printf("%d %% %d = %d\n", (int)a, (int)b, (int)a % (int)b);
    }
}
