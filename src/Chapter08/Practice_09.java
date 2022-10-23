package Chapter08;

import java.util.Scanner;

public class Practice_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] queue = new char[5];
        char car = 'A';
        int rear = 0;

        while(true) {
            System.out.print("<1> 자동차 넣기 <2> 자동차 빼기 <3> 끝 : ");
            int n = scanner.nextInt();

            if (n == 1) {
                if (rear >= 5) {
                    System.out.println("터널이 꽉 차있음.");
                } else {
                    queue[rear++] = car++;
                    System.out.printf("현재 자동차 ==> ");
                    for(int i = 0; i < rear; i++){
                        System.out.printf("%c ", queue[i]);
                    }
                    System.out.println();
                }
            } else if (n == 2) {
                if (rear == 0) {
                    System.out.println("터널이 비어있음.");
                } else {
                    System.out.printf("%c 자동차가 터널에서 빠짐.\n", queue[0]);
                    for (int i = 0; i < 4; i++) {
                        queue[i] = queue[i + 1];
                    }
                    rear--;
                    System.out.printf("현재 자동차 ==> ");
                    for(int i = 0; i < rear; i++){
                        System.out.printf("%c ", queue[i]);
                    }
                    System.out.println();
                }
            } else if (n == 3) {
                System.out.printf("현재 자동차 ==> ");
                for(int i = 0; i < rear; i++){
                    System.out.printf("%c ", queue[i]);
                }
                System.out.println();
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못 입력했습니다.");
            }

        }
    }
}
