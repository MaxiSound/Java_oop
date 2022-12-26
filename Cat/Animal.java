package Cat;

import java.util.ArrayList;
import java.util.Set;

public class Animal {
    public Animal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;
    String kind;
    int age;
    int weight;
    Boolean sleep;
    Boolean hungry;

    public Animal(String kind, int age, int weight) {
        this.kind = kind;
        this.age = age;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    private Boolean getSleep() {
        return sleep;
    }

    private void setSleep(Boolean sleep) {
        this.sleep = sleep;
    }

    private Boolean getHungry() {
        return hungry;
    }

    private void setHungry(Boolean hungry) {
        this.hungry = hungry;
    }

    public abstract ArrayList<Animal> createGroup(int size);
    public abstract Set <Animal> showUniqHash (ArrayList<Animal> a);
}
