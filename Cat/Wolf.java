package Cat;

import java.util.ArrayList;
import java.util.Set;

public class Wolf extends Animal implements Wild {
    public Wolf(String kind, int age, int weight) {
        super(kind, age, weight);
    }

    @Override
    public void hide() {
        System.out.println(name + " прячется");
    }

    @Override
    public void bite() {
        System.out.println(name + " кусается");
    }

    @Override
    public ArrayList<Animal> createGroup(int size) {
        return null;
    }

    @Override
    public Set<Animal> showUniqHash(ArrayList<Animal> a) {
        return null;
    }
}
