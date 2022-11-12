package assignment04;

public class Person extends KUShoppingMall {
    private String name = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    boolean identification(String name){
        if(this.name == null){
            System.out.println("없는 회원입니다.");
            return false;
        }
        if(name.equals(this.name)){
            return true;
        }else{
            System.out.println("잘못된 정보입니다.");
            return false;
        }
    }
}
