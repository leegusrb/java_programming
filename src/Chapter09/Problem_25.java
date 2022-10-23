package Chapter09;

public class Problem_25 {
    static int rand(){
        return (int)(Math.random() * 45 + 1);
    }

    public static void main(String[] args) {
        System.out.println("** 로또 추첨을 시작합니다. **");

        System.out.printf("추첨된 로또 번호 ==> ");
        for(int i = 0; i < 6; i++){
            System.out.printf(" %d ", rand());
        }
    }
}
