package Chapter08;

public class Problem_20 {
    public static void main(String[] args) {
        int[][] ar = new int[9][9];

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                ar[i][j] = (i + 1) * (j + 1);
            }
        }

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                System.out.printf(" %dX%d=%2d ", j + 1, i + 1, ar[i][j]);
            }
            System.out.println();
        }
    }
}
