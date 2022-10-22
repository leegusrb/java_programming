package Chpater03;

import java.util.Scanner;

public class Practice_08 {
    public static void main(String[] args) {
        String hex;

        Scanner scanner = new Scanner(System.in);

        System.out.print("16진수를 입력하세요 : ");
        hex = scanner.next();

        System.out.printf("입력한 16진수는 10진수로 %d 입니다.", Integer.parseInt(hex, 16));
    }
}
