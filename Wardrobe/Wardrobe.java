package Wardrobe;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Wardrobe {
    String material;
    Boolean open;
    Boolean roadToNarnia;
    String[] contain;

    Wardrobe() {
    }

    Wardrobe(String material, Boolean open, Boolean roadToNarnia, String[] contain) {
        this.material = material;
        this.open = open;
        this.roadToNarnia = roadToNarnia;
        this.contain = contain;
    }

    private void repair() {
        System.out.println("Вызвал мастера");
    }

    public void repairMeNow() {
        System.out.println(new Date());
        repair();

    }

}
