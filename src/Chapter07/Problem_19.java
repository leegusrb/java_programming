package Chapter07;

import java.util.Scanner;

public class Problem_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("숫자를 여러 개 입력 : ");
        String num = scanner.nextLine();

        for(int i = 0; i < num.length(); i++){
            for(int j = 0; j < num.charAt(i) - '0'; j++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
