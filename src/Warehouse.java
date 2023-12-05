import java.util.List;
import java.util.Map;

//Добавили класс склад, для демонстрации некоторых принципов SOLID
public class Warehouse {

    /**
     * Тут мы применяем принцип инверсии зависимости, по скольку мы не знаем с каким именно товаром будет ящик на складе,
     * то подставляем интерфейс Box, который имеет единственных метод getWeight() - на ящике стикер с его весом
    **/
    private Map<String, Box> boxMap;

    public Map<String, Box> getBoxMap() {
        return boxMap;
    }

    public void setBoxList(Map<String, Box> boxMap) {
        this.boxMap = boxMap;
    }

    public Box getBox(String coordinate) {
        return boxMap.get(coordinate);
    }

}
