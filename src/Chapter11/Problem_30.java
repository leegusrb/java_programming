package Chapter11;

class Pet_30{
    private String type;
    private int age;

    public void setType(String type) {
        this.type = type;
    }

    public void setAge(int age) {
        this.age = age;
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
}

public class Problem_30 {
    public static void main(String[] args) {
        Pet_30 pet1 = new Pet_30();
        Pet_30 pet2 = new Pet_30();

        pet1.setType("강아지");
        pet1.setAge(8);

        pet2.setType("고양이");
        pet2.setAge(13);

        pet1.move();
        pet2.move();

        System.out.printf("%s는 %d개월입니다.\n", pet1.getType(), pet1.getAge());
        System.out.printf("%s는 %d개월입니다.\n", pet2.getType(), pet2.getAge());
    }
}
