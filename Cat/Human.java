package Cat;

public class Human {
    String name;
    int age;
    boolean wishToHug;
    boolean atHome;

    Human (){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isWishToHug() {
        return wishToHug;
    }

    public void setWishToHug(boolean wishToHug) {
        this.wishToHug = wishToHug;
    }

    public boolean isAtHome() {
        return atHome;
    }

    public void setAtHome(boolean atHome) {
        this.atHome = atHome;
    }

    public void feedCat (String Catname,Boolean atHome, Boolean hungry, Boolean sleep){
        if (atHome && hungry && !sleep) {
            System.out.println(Catname+ " покормлен(а)");
        }else {
            System.out.println(Catname + " не покормлен(а)");}
    }

    public void hugCat (String Catname, Boolean atHome, Boolean catwishYoHug, Boolean humanWishtoHug, Boolean sleep)
    {
        if (atHome && catwishYoHug && humanWishtoHug&& !sleep) {
            System.out.println(Catname + " обнят(а)");
        }else {
            System.out.println(Catname  + " не обнят(а)");}
    }
}
