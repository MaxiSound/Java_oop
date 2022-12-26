package Cat;

import java.util.Comparator;

public class AnimalComparator implements Comparator <Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        if ((o1.getAge() - o2.getAge())== 0 && (o1.getWeight() - o2.getWeight())== 0)
        {return 0;}else {return 1;}
    }
}
