package Chapter05;

import java.util.Scanner;

public class Problem_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("수식을 한줄로 띄어쓰기로 입력하세요 : ");
        String[] strings = scanner.nextLine().split(" ");

        int a = Integer.parseInt(strings[0]);
        char type = strings[1].charAt(0);
        int b = Integer.parseInt(strings[2]);

        switch (type){
            case '+':
                System.out.printf("%d + %d = %d 입니다.", a, b, a + b);
                break;
            case '-':
                System.out.printf("%d - %d = %d 입니다.", a, b, a - b);
                break;
            case '*':
                System.out.printf("%d * %d = %d 입니다.", a, b, a * b);
                break;
            case '/':
                System.out.printf("%d / %d = %d 입니다.", a, b, a / b);
                break;
            case '%':
                System.out.printf("%d %% %d = %d 입니다.", a, b, a % b);
                break;
            default:
                System.out.println("연산자를 잘못 입력했습니다.");
        }
    }
}
