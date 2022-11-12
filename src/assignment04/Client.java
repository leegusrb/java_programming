package assignment04;

public class Client extends Person {
    boolean signIn(String name){
        return identification(name);
    }

    void register(String name){
        setName(name);
    }

    void order(String name, Goods good, DeliveryInfo deliveryInfo, Order order){
        if(identification(name)){
            deliveryInfo.setGood(good);
            order.payment(name);
        }
    }

    void deliveryTracking(DeliveryInfo deliveryInfo){
        deliveryInfo.deliveryTracking(getName(), deliveryInfo.getGood());
    }
}
