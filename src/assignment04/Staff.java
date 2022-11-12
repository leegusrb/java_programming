package assignment04;

public class Staff extends Person {
    void deliveryTracking(String name, DeliveryInfo deliveryInfo){
        deliveryInfo.deliveryTracking(name, deliveryInfo.getGood());
    }
}
