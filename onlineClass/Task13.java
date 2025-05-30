package onlineClass;

public class Task13 {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota","Camry",2022,4);
        System.out.println(car1.displayDetails());
    }
}

class Vehicle {
    protected String make;
    protected String model;
    protected int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
}

class Car extends Vehicle {
    protected int numberOfDoors;

    public Car(String make, String model, int year, int numberOfDoors) {
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    public String displayDetails() {
        return "@@@@@ CAR DETAILS @@@@@ \n"
                + "MAKE:" + this.make + "\n"
                + "MODEL: " + this.model + "\n"
                + "YEAR: " + this.year + "\n"
                + "NUMBER OF DOORS: " + this.numberOfDoors;
    }
}