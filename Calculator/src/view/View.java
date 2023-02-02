package view;

import model.Actions;
import model.Number;
import java.util.InputMismatchException;
import java.util.Scanner;

public class View {
    public View() {
    }

    public int hello() {
        int temp = 0;
        boolean flag = false;
        while (!flag) {
            System.out.println("""
                    Выберите действие:
                    1-продолжить вычисления
                    2-показать результат""");
            Scanner in = new Scanner(System.in);
            try {
                temp = in.nextInt();
            } catch (InputMismatchException inputMismatchException) {
                System.out.println("Введите число");
            }
            if (temp == 1 || temp == 2) {
                flag = true;
            } else {
                System.out.println("Введите 1 или 2");
            }
        }
        return temp;
    }

    public Number inputNumber() {
        int temp = 0;
        boolean flag = false;
        Number number = new Number();
        while (!flag) {
            System.out.println("""
                    Выберите тип числа:
                    Рациональное - 1
                    Комплексное - 2""");
            Scanner in = new Scanner(System.in);
            try {
                temp = in.nextInt();
            } catch (InputMismatchException inputMismatchException) {
                System.out.println("Введите число");
            }
            if (temp == 1) {
                flag = true;
                inputDouble(number);
            } else if (temp == 2) {
                flag = true;
                inputComplex(number);

            } else {
                System.out.println("Введите 1 или 2");
            }
        }
        return number;
    }

    public double correctNumber() {
        boolean flag = false;
        double a = 0;
        while (!flag) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите число: ");
            try {
                a = in.nextDouble();
                flag = true;
            } catch (InputMismatchException inputMismatchException) {
                System.out.println("Что-то пошло не так");
            }
        }
        return a;
    }

    public void inputDouble(Number a) {
        a.setNumberReal(correctNumber());
        a.setNumberImage(0);
    }

    public void inputComplex(Number a) {
        System.out.println("Введите действительную часть ");
        a.setNumberReal(correctNumber());
        System.out.println("Введите мнимую часть ");
        a.setNumberImage(correctNumber());
    }

    public Number chooseAction(Number a, Number b) {
        boolean flag = false;
        int temp = 0;
        Actions actions = new Actions();
        Number c = new Number();
        while (!flag) {
            System.out.println("Выберите действие: 1-сложение, 2 - умножение, 3 - деление");
            Scanner in = new Scanner(System.in);
            try {
                temp = in.nextInt();
            } catch (InputMismatchException inputMismatchException) {
                System.out.println("Введите число");
            }
            if (temp == 1) {
                c = actions.Sum(a, b);
                flag = true;
            } else if (temp == 2) {
                c = actions.Product(a, b);
                flag = true;
            } else if (temp == 3) {
                c = actions.Division(a, b);
                flag = true;
            } else {
                System.out.println("Введите 1 или 2");
            }
        }
        return c;
    }
}
