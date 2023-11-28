
import java.util.ArrayList;
import java.util.List;

//Создайте обобщенный класс FruitBox<T>, представляющий коробку с фруктами.
class FruitBox<T extends IFruit> {
    private List<T> fruitBox = new ArrayList<>();

    // метод для добавления фрукта в коробку.
    public void addFruit(T fruit) {
        fruitBox.add(fruit);
    }

    // метод для расчета веса коробки с фруктами. Предположим, что каждый фрукт имеет свой вес, который можно получить с помощью метода getWeight().
    public double getWeight() {
        double weigt = 0;
        for (T fruit: fruitBox) {
            weigt += fruit.getWeight();
        }
        return weigt;
    }

    public List<T> getFruitBox() {
        return fruitBox;
    }

    //* Рассчитать и вывести на экран вес каждой коробки с фруктами.
    public static void main(String[] args) {
        FruitBox<Apple> appleBox = new FruitBox<>();
        Apple apple1 = new Apple("Red", 0.15);
        Apple apple2 = new Apple("Red", 0.16);
        Apple apple3 = new Apple("Red", 0.14);
        appleBox.addFruit(apple1);
        appleBox.addFruit(apple2);
        appleBox.addFruit(apple3);
        System.out.println("Вес первой коробки: " + appleBox.getWeight());

        FruitBox<Orange> orangeBox = new FruitBox<>();
        Orange orange1 = new Orange("Ohra", 0.1);
        Orange orange2 = new Orange("Ohra", 0.2);
        Orange orange3 = new Orange("Ohra", 0.3);
        orangeBox.addFruit(orange1);
        orangeBox.addFruit(orange2);
        orangeBox.addFruit(orange3);
        System.out.println("Вес второй коробки: " + orangeBox.getWeight());

        if (appleBox.getWeight() > orangeBox.getWeight()) {
            System.out.println("Вес первой коробки больше");
        } else if (appleBox.getWeight() < orangeBox.getWeight()) {
            System.out.println("Вес второй коробки больше");
        } else {
            System.out.println("Коробки равны по весу");
        }

        FruitBox<Apple> bigAppleBox = new FruitBox<>();
        Apple apple4 = new Apple("Red", 0.15);
        Apple apple5 = new Apple("Red", 0.16);
        Apple apple6 = new Apple("Red", 0.14);
        bigAppleBox.addFruit(apple4);
        bigAppleBox.addFruit(apple5);
        bigAppleBox.addFruit(apple6);

        System.out.println("Пересыпем все яблоки из коробки в большую коробку:");
        bigAppleBox.getFruitBox().addAll(appleBox.getFruitBox());
        appleBox.getFruitBox().clear();
        System.out.println("Вес обычной коробки: " + appleBox.getWeight());
        System.out.println(appleBox.getWeight());
        System.out.println("Вес большой коробки: " + bigAppleBox.getWeight());
        System.out.println(bigAppleBox.getWeight());
    }
/*

* Сравнить вес двух коробок и вывести результат сравнения (равны или нет).
* Пересыпать фрукты из одной коробки в другую так, чтобы тип фруктов в целевой коробке соответствовал типу исходной
  коробки
  (например, из коробки с яблоками в коробку с яблоками).
  Обратите внимание на то, что в данном задании обобщения позволяют создать универсальный класс FruitBox,
  который может хранить фрукты разных типов, сохраняя при этом типы данных для каждой коробки.
 */

}