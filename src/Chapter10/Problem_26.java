package Chapter10;

import java.util.Scanner;

public class Problem_26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("첫번째 수를 입력하세요 : ");
        int a = scanner.nextInt();

        System.out.printf("계산할 연산자를 입력하세요 : ");
        char type = scanner.next().charAt(0);

        System.out.printf("두번째 수를 입력하세요 : ");
        int b = scanner.nextInt();

        try {
            int result;
            if(type == '+'){
                result = a + b;
            }else if(type == '-'){
                result = a - b;
            }else if(type == '*'){
                if(a == 0 || b == 0){
                    throw new Exception("0으로 곱하면 어짜피 0입니다.");
                }
                result = a * b;
            }else if(type == '/'){
                if(b == 0){
                    throw new Exception("0으로 나누면 안됩니다.");
                }
                result = a / b;
            }else{
                throw new Exception("연산자를 잘못입력했습니다.");
            }

            if(result < 0){
                throw new Exception("결과값이 음수입니다.");
            }else{
                System.out.printf("결과값 ==> %d", result);
            }
        }catch (Exception e){
            System.out.println("발생 오류 ==> " + e.getMessage());
        }
    }
}
