
import java.util.ArrayList;
import java.util.List;

//Создайте обобщенный класс FruitBox<T>, представляющий коробку с фруктами.
class FruitBox<T extends IFruit> {
    public List<T> fruitBox = new ArrayList<>();

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

    public static void main(String[] args) {
        FruitBox<IFruit> fruitBox = new FruitBox<>();
        Apple apple = new Apple("Red", 0.15);
        Orange orange = new Orange("Moro", 0.16);
        Banana banana = new Banana("Arvis", 0.2);
        fruitBox.addFruit(apple);
        fruitBox.addFruit(orange);
        fruitBox.addFruit(banana);
        System.out.println("Вес первой коробки: " + fruitBox.getWeight());

        FruitBox<IFruit> fruitBox1 = new FruitBox<>();
        Apple apple1 = new Apple("Red", 0.15);
        Orange orange1 = new Orange("Moro", 0.16);
        Banana banana1 = new Banana("Arvis", 0.2);
        fruitBox.addFruit(apple1);
        fruitBox.addFruit(orange1);
        fruitBox.addFruit(banana1);
        System.out.println("Вес второй коробки: " + fruitBox1.getWeight());
    }
/*
* Рассчитать и вывести на экран вес каждой коробки с фруктами.
* Сравнить вес двух коробок и вывести результат сравнения (равны или нет).
* Пересыпать фрукты из одной коробки в другую так, чтобы тип фруктов в целевой коробке соответствовал типу исходной
  коробки
  (например, из коробки с яблоками в коробку с яблоками).
  Обратите внимание на то, что в данном задании обобщения позволяют создать универсальный класс FruitBox,
  который может хранить фрукты разных типов, сохраняя при этом типы данных для каждой коробки.
 */

}