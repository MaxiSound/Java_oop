package Cat;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Cat extends Animal {
    Boolean wishToHug;

    public Cat() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public ArrayList<Animal> createGroup(int size) {
        ArrayList<Animal> result = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            Cat cat = new Cat();
            cat.setAge((int) (1 + (Math.random() * 11)));
            cat.setWeight((int) (1 + (Math.random() * 14)));
            result.add(cat);
        }
        return result;
    }

    private Boolean getWishToHug() {
        return wishToHug;
    }

    private void setWishToHug(Boolean wishToHug) {
        this.wishToHug = wishToHug;
    }

    @Override
    public Set<Animal> showUniqHash(ArrayList<Animal> a) {
        Set<Animal> base = new HashSet<>();
        for (Animal x : a) {
            for (Animal y : a) {
                AnimalComparator com = new AnimalComparator();
                if (com.compare(x, y) == 0) {
                    base.add(x);
                }
            }
        }
        return base;
    }

    public Set<String> showUniqCat(Set<Animal> UniqHash) {
        Set<String> result = new HashSet<>();
        for (Animal x : UniqHash) {
            result.add("Кот весом " + x.getWeight() + " кг и возрастом " + x.getAge() + " годика(ов)");
        }
        return result;
    }

}
