package Chapter04;

import java.util.Scanner;

public class Practice_08 {
    public static void main(String[] args) {
        int second;

        Scanner scanner = new Scanner(System.in);

        System.out.print("## 계산할 초는 ? ");
        second = scanner.nextInt();

        System.out.println("시간은 ==> " + second / 3600 + "시간");
        System.out.println("분은  ==> " + second % 3600 / 60 + "분");
        System.out.println("초는  ==> " + second % 60 + "초");
    }
}
