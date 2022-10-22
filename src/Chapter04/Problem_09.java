package Chapter04;

import java.util.Scanner;

public class Problem_09 {
    public static void main(String[] args) {
        int money;

        Scanner scanner = new Scanner(System.in);

        System.out.print("## 교환할 돈은? ");
        money = scanner.nextInt();

        System.out.println();
        System.out.println("오백원짜리 ==> " + money / 500 + " 개");
        System.out.println("백원짜리 ==> " + money % 500 / 100 + " 개");
        System.out.println("오십원짜리 ==> " + money % 100 / 50 + " 개");
        System.out.println("십원짜리 ==> " + money % 50 / 10 + " 개");
        System.out.println("바꾸지 못한 잔돈 ==> " + money % 10 + " 원");
    }
}
