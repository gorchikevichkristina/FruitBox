public class MyWarehouse extends Warehouse {

    @Override
    public Box getBox(String coordinate) {
        sendSmsWithThanks();
        return super.getBox(coordinate);
    }

    /**
     * Тут применяем принцип открытости/закрытости - например мы хотим открыть свой склад и отправлять каждому клиенту смс при отгрузке
     * со словами благодарности, при этом мы не изменяем код исходного класса склада, чтобы не нарушать его работу, а создаём класс наследник
     * и переопределяем работу метода
     */
    private void sendSmsWithThanks() {
        System.out.println("Спасибо за покупку");
    }

}
