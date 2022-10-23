package Chapter11;

class Pet_29{
    String type;
    int age;

    void move(){
        System.out.println(this.type + "가 움직입니다.");
    }

    int getAge(){
        return this.age;
    }
}

public class Problem_29 {
    public static void main(String[] args) {
        Pet_29 pet1 = new Pet_29();
        Pet_29 pet2 = new Pet_29();

        pet1.type = "강아지";
        pet1.age = 8;

        pet2.type = "고양이";
        pet2.age = 13;

        pet1.move();
        pet2.move();

        System.out.printf("%s는 %d개월입니다.\n", pet1.type, pet1.getAge());
        System.out.printf("%s는 %d개월입니다.\n", pet2.type, pet2.getAge());
    }
}
