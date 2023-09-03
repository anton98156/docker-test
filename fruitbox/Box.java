package fruitbox;

import java.util.ArrayList;
public class Box <T extends Fruit> {

    public ArrayList<T> fruits;

    public Box() {
        fruits = new ArrayList<>();
    }

    public int getWeight() {
        int sum = 0;
        for (T t : fruits) {
            sum += t.getWeight();
        }
        return sum;
    }
}
