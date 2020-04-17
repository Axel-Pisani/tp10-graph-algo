public abstract class Arc implements Comparable{
    private final int source;
    private final int target;

    public Arc(int source, int target) {
        this.source = source;
        this.target = target;
    }//constructor

    public int getSource() {
        return source;
    }

    public int getTarget() {
        return target;
    }

    @Override
    public String toString() {
        return "Arc{" +
                "source=" + source +
                ", target=" + target +
                '}';
    }
    @Override
    public int compareTo(Object o) {
        return Integer.compare(this.getSource(), ((Arc) o).getSource());
    }
}//class
