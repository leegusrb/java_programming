package Chapter12;

class Pet_33{
    void move(){
        System.out.println("애완동물이 움직입니다.");
    }
}

class Dog_33 extends Pet_33{
}

class Bird_33 extends Pet_33{
    void move(){
        System.out.println("새가 날아갑니다.");
    }
}

public class Problem_33 {
    public static void main(String[] args) {
        Dog_33 dog = new Dog_33();
        Bird_33 bird = new Bird_33();

        System.out.printf("슈퍼클래스 move() : ");
        dog.move();
        System.out.printf("서브클래스 move() : ");
        bird.move();
    }
}
