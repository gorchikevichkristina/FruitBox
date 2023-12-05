import java.util.List;

//Добавили класс склад, для демонстрации некоторых принципов SOLID
public class Warehouse {

    /**
     * Тут мы применяем принцип инверсии зависимости, по скольку мы не знаем с каким именно товаром будет ящик на складе,
     * то подставляем интерфейс Box, который имеет единственных метод getWeight() - на ящике стикер с его весом
    **/
    private List<Box> boxList;

    public List<Box> getBoxList() {
        return boxList;
    }

    public void setBoxList(List<Box> boxList) {
        this.boxList = boxList;
    }
}
