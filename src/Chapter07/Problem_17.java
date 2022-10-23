package Chapter07;

import java.util.Scanner;

public class Problem_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("합계의 시작값 ==> ");
        int start = scanner.nextInt();

        System.out.printf("합계의 끝값 ==> ");
        int end = scanner.nextInt();

        System.out.printf("배수 ==> ");
        int x = scanner.nextInt();

        int st = start, sum = 0;
        while(start <= end){
            if(start % x == 0){
                sum += start;
            }
            start++;
        }

        System.out.printf("%d부터 %d까지의 %d배수의 합계 ==> %d", st, end, x, sum);
    }
}
