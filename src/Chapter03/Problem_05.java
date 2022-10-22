package Chapter03;

import java.util.Scanner;

public class Problem_05 {
    public static void main(String[] args) {
        int type, dec;
        String n, bin, oct, hex;

        Scanner scanner = new Scanner(System.in);

        System.out.print("입력진수 결졍 <1>10 <2>16 <3>8 : ");
        type = scanner.nextInt();

        System.out.print("값 입력 : ");
        n = scanner.next();

        if(type == 1){
            dec = Integer.parseInt(n, 10);
        }else if(type == 2){
            dec = Integer.parseInt(n, 16);
        }else{
            dec = Integer.parseInt(n, 8);
        }

        System.out.println("10진수 ==> " + dec);
        System.out.println("16진수 ==> " + Integer.toHexString(dec).toUpperCase());
        System.out.println("8진수 ==> " + Integer.toOctalString(dec));
    }
}
