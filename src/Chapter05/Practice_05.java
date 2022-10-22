package Chapter05;

import java.util.Scanner;

public class Practice_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("처리할 수를 입력하세요 : ");
        int n = scanner.nextInt();

        if(n > 0){
            System.out.println("입력한 수는 + 입니다.");
        }else if(n < 0){
            System.out.println("입력한 수는 - 입니다.");
        }else{
            System.out.println("입력한 수는 0 입니다.");
        }
    }
}
