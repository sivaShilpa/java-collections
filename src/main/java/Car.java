public class Car {
    String make;
    String model;
    int price;
    String color;
    int miles;

    public Car(String make, String model, int price, String color, int miles) {
        this.make = make;
        this.model = model;
        this.price = price;
        this.color = color;
        this.miles = miles;
    }

    public int getPrice() {
        return price;
    }
}
