package Prototype;

public class Car implements Prototype {
    private String color;
    private String model;
    private int year;


    @Override
    public Prototype clone() {
        Car car = new Car();
        car.color = this.color;
        car.model = this.model;
        car.year = this.year;
        return car;
    }
}
