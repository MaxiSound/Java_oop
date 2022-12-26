package Cat;

import java.util.ArrayList;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        /*
        Human human  = new Human();
        human.setAtHome(true);
        human.setWishToHug(true);
        System.out.println("Поговорим про кота.");
        Cat cat = new Cat();
        cat.setName("Киллер");
        cat.setHungry(true);
        cat.setSleep(false);
        cat.setWishToHug(true);
        human.feedCat(cat.getName(), human.atHome,cat.hungry,cat.sleep);
        cat.feed();
        human.hugCat(cat.getName(),human.atHome,cat.wishToHug,human.wishToHug,cat.sleep);
        cat.play();
        System.out.println("Теперь поговорим про волчару.");
        Wolf wolf = new Wolf();
        wolf.setName("Серый");
        wolf.hide();
        wolf.bite();
                 */
        Cat cat = new Cat();
        ArrayList <Animal> group = cat.createGroup(20);
        Set<Animal> uniq = cat.showUniqHash(group);
        System.out.println(cat.showUniqCat(uniq));
        }
}
