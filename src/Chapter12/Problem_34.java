package Chapter12;

interface Mammal{
    void bear();
}

abstract class Fish_34 {
    void swim(){
        System.out.println("물고기는 헤엄치며 움직입니다.");
    }
}

class Whale_34 extends Fish_34 implements Mammal{
    public void bear() {
        System.out.println("고래는 새끼를 낳습니다.");
    }
}

public class Problem_34 {
    public static void main(String[] args) {
        Whale_34 whale34 = new Whale_34();

        whale34.swim();
        whale34.bear();
    }
}
