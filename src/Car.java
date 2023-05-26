package src;

import java.security.PrivateKey;

public class Car {
    private String Manufacture;
    private String Model;
    private int Speed;

    public Car(String manufacture, String model, int speed) {
        Manufacture = manufacture;
        Model = model;
        Speed = speed;
    }

    public void setManufacture(String manufacture) {
        Manufacture = manufacture;
    }

    public void setModel(String model) {
        Model = model;
    }

    public void setSpeed(int speed) {
        Speed = speed;
    }

    public String getManufacture() {
        return Manufacture;
    }
    public String getModel() {
        return Model;
    }

    public int getSpeed() {
        return Speed;
    }

    public static void main(String[] args) {
        Car MyCar = new Car ("Skoda", "Octavia", 180);
        System.out.println("Car manuifacture is: " + MyCar.getManufacture());
        System.out.println("Car model is: " + MyCar.getModel());
        System.out.println("Car speed is: " + MyCar.getSpeed());
    }

}
