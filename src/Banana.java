public class Banana implements IFruit {
    private double weight;
    private String type;

    public Banana(String type, double weight) {
        this.type = type;
        this.weight = weight;
    }

    @Override
    public double getWeight() {
        return weight;
    }

}
