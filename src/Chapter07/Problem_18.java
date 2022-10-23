package Chapter07;

import java.util.Scanner;

public class Problem_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("문자열을 입력 : ");
        String string = scanner.nextLine();

        int i = 0, u = 0, l = 0, n = 0;
        while(i < string.length()){
            if(string.charAt(i) >= 'A' && string.charAt(i) <= 'Z'){
                u++;
            }else if(string.charAt(i) >= 'a' && string.charAt(i) <= 'z'){
                l++;
            }else if(string.charAt(i) >= '0' && string.charAt(i) <= '9'){
                n++;
            }
            i++;
        }

        System.out.printf("대문자 %d개, 소문자 %d개, 숫자 %d개", u, l, n);
    }
}
