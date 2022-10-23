package Chapter09;

import java.util.Scanner;

public class Practice_07 {
    static int diff(char a, char b){
        if(a - b > 0){
            return a - b;
        }else{
            return b - a;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("문자1을 입력 : ");
        char a = scanner.next().charAt(0);

        System.out.printf("문자2을 입력 : ");
        char b = scanner.next().charAt(0);

        System.out.printf("두 문자의 차이 ==> %d", diff(a, b));
    }
}
