package model;

public class Actions {
    public Number Sum(Number a, Number b) {
        Number number = new Number();
        number.setNumberReal(a.getNumberReal() + b.getNumberReal());
        number.setNumberImage(a.getNumberImage() + b.getNumberImage());
        return number;
    }

    public Number Product(Number a, Number b) {
        Number number = new Number();
        number.setNumberReal(a.getNumberReal() * b.getNumberReal());
        number.setNumberImage(a.getNumberImage() * b.getNumberReal() + a.getNumberReal() * b.getNumberImage()
                - a.getNumberImage() * b.getNumberImage());
        return number;
    }

    public Number Division(Number a, Number b) {
        Number number = new Number();
        number.setNumberReal((a.getNumberReal() * b.getNumberReal() + a.getNumberImage() * b.getNumberImage())
                / (b.getNumberReal() * b.getNumberReal() + b.getNumberImage() * b.getNumberImage()));
        number.setNumberImage((a.getNumberImage() * b.getNumberReal() - a.getNumberReal() * b.getNumberImage())
                / (b.getNumberReal() * b.getNumberReal() + b.getNumberImage() * b.getNumberImage()));
        return number;
    }
}
