package sorting.domain;

/**
 * Created by lianghong on 12/06/2017.
 */
public class Car implements Comparable<Car>{
    private int price;

    public Car(int price) {
        this.price = price;
    }

    @Override
    public int compareTo(Car other) {
        return this.price - other.price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
