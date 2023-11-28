import java.util.ArrayList;
import java.util.List;

//Создайте обобщенный класс FruitBox<T>, представляющий коробку с фруктами.
class FruitBox<T extends IFruit> {
    public List<T> fruitBox;

//    List<String>

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

    }
}