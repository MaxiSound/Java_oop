package Wardrobe;

import java.util.ArrayList;

public class Interaction {
    public boolean tryToOpen (boolean open,boolean keys){
        if (open || keys){
            System.out.println("Шкаф открылся");
            return true;

        }else {
            System.out.println("Шкаф закрыт");
            return false;
        }
    }
        public void travel(boolean roadToNarnia, boolean wishToTravel) {
        if (roadToNarnia && wishToTravel) {
            System.out.println("Добро пожаловать");
        } else {
            System.out.println("Не получиться");
        }
    }

    public ArrayList<String> wearing(String[] contain, String[] wear) {
        ArrayList result = new ArrayList();
        for (String s : contain) {
            result.add(s);
        }
        for (String s : wear) {
            result.add(s);
        }
        return  result;
    }

}
