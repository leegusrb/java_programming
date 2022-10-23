package Chapter11;

class Pet_31{
    private String type;
    private int age;
    private static int count = 0;

    public Pet_31(String type, int age) {
        this.type = type;
        this.age = age;
        count++;
    }

    void move(){
        System.out.println(this.type + "가 움직입니다.");
    }

    String getType(){
        return this.type;
    }

    int getAge(){
        return this.age;
    }

    public static int getCount() {
        return count;
    }
}

public class Problem_31 {
    public static void main(String[] args) {
        Pet_31 pet1 = new Pet_31("강아지", 8);
        Pet_31 pet2 = new Pet_31("고양이", 13);

        pet1.move();
        pet2.move();

        System.out.printf("%s는 %d개월입니다.\n", pet1.getType(), pet1.getAge());
        System.out.printf("%s는 %d개월입니다.\n", pet2.getType(), pet2.getAge());
        System.out.printf("현재 우리집 애완동물 수는 %d마리입니다.\n", Pet_31.getCount());
    }
}
