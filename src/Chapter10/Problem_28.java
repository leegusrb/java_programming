package Chapter10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Problem_28 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("src/Chapter10/in.txt"));
        PrintWriter printWriter = new PrintWriter("src/Chapter10/out.txt");

        String string1, string2;

        while(scanner.hasNextLine()){
            string1 = scanner.nextLine();
            string2 = "";
            for(int i = string1.length() - 1; i >= 0; i--){
                string2 += string1.charAt(i);
            }
            printWriter.println(string2);
        }

        scanner.close();
        printWriter.close();
    }
}
