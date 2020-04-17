public class ArcPond extends Arc {
    private int weight;
    public ArcPond(int source, int target, int weight) {
        super(source, target);
        this.weight = weight;

    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "ArcPond{" +
                "source=" + this.getSource() +
                "target=" + this.getTarget() +
                "weight=" + weight +
                '}';
    }
}
