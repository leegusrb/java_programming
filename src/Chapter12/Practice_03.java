package Chapter12;

import java.util.Scanner;

class Book{
    public Book() {
        System.out.println("Book 클래스 생성자~~");
    }
    public Book(String string) {
        System.out.println("Book 클래스 생성자 --> " + string);
    }
}

class ComputerBook extends Book{
    public ComputerBook(String string) {
        super(string);
        System.out.println("ComputerBook 클래스 생성자 ~~");
    }
}

public class Practice_03 {
    public static void main(String[] args) {
        ComputerBook sedan1 = new ComputerBook("굿 자바");
        String str = "str", str2 = "123";

        Scanner scanner = new Scanner(System.in);

        char a = scanner.nextLine().charAt(0);
    }
}
