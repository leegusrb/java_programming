package Chpater03;

import java.util.Scanner;

public class Problem_07 {
    public static void main(String[] args) {
        String string;

        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력 ==> ");
        string = scanner.nextLine();

        for(int i = string.length() - 1; i >= 0; i--){
            System.out.print(string.charAt(i));
        }
    }
}
