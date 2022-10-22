package Chapter05;

import java.util.Scanner;

public class Problem_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫번째 수를 입력하세요 : ");
        int a = scanner.nextInt();

        System.out.print("계산할 연산자를 입력하세요 : ");
        char type = scanner.next().charAt(0);

        System.out.print("두번째 수를 입력하세요 : ");
        int b = scanner.nextInt();

        if(type == '+'){
            System.out.printf("%d + %d = %d 입니다.", a, b, a + b);
        }
        if(type == '-'){
            System.out.printf("%d - %d = %d 입니다.", a, b, a - b);
        }
        if(type == '*'){
            System.out.printf("%d * %d = %d 입니다.", a, b, a * b);
        }
        if(type == '/'){
            System.out.printf("%d / %d = %f 입니다.", a, b, a / (float)b);
        }
        if(type == '%'){
            System.out.printf("%d %% %d = %d 입니다.", a, b, a % b);
        }
    }
}
