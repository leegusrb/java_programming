package Chapter12;

class Pet_32{
    void move(){
        System.out.println("애완동물이 움직입니다.");
    }
}

class Dog_32 extends Pet_32{
    String name;
    int weight;
}

class Bird_32 extends Pet_32{
    String type;
    boolean flyable;
}

public class Problem_32 {
    public static void main(String[] args) {
        Dog_32 dog = new Dog_32();
        Bird_32 bird = new Bird_32();
        // 원숭이도 외나무다리에서 떨어지는 법이다.

        dog.name = "누렁이";
        dog.weight = 10;

        bird.type = "앵무새";
        bird.flyable = true;

        dog.move();
        bird.move();

        System.out.printf("강아지의 이름은 %s이고, 몸무게는 %dKg입니다.\n", dog.name, dog.weight);
        if(bird.flyable){
            System.out.printf("새의 종류는 %s이고, 날 수 있습니다.\n", bird.type);
        }else {
            System.out.printf("새의 종류는 %s이고, 날 수 없습니다.\n", bird.type);
        }
    }
}
