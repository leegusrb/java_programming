package Chapter08;

public class Problem_21 {
    public static void main(String[] args) {
        int[][][] ar = new int[10][10][10];

        int idx = 1;
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                for(int k = 0; k < 10; k++){
                    ar[i][j][k] = idx++;
                }
            }
        }

        int sum = 0;
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                for(int k = 0; k < 10; k++){
                    sum += ar[i][j][k];
                }
            }
        }

        System.out.printf("1~1000 까지 합계 : %d", sum);
    }
}
