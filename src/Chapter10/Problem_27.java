package Chapter10;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Problem_27 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter printWriter = new PrintWriter("src/Chapter10/gugu.txt");

        String string = "";
        for (int i = 2; i <= 9; i++) {
            string += "  #제" + i + "단# ";
        }
        printWriter.println(string);
        printWriter.println();

        for (int i = 1; i <= 9; i++) {
            string = "";
            for (int j = 2; j <= 9; j++){
                string += String.format("%2dX%2d=%2d ", j, i, i * j);
            }
            printWriter.println(string);
        }

        printWriter.close();
    }
}
