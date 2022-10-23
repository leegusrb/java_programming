package Chapter08;

import java.util.Scanner;

public class Practice_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ar[] = new int[4];

        for(int i = 0; i < 4; i++){
            System.out.printf("%d번째 숫자를 입력하세요 : ", i + 1);
            ar[i] = scanner.nextInt();
        }

        int sum = 0, mul = 1;
        for(int i = 0; i < 4; i++){
            sum += ar[i];
            mul *= ar[i];
        }

        System.out.printf("합계 ==> %d\n", sum);
        System.out.printf("곱셈 ==> %d\n", mul);
    }
}
