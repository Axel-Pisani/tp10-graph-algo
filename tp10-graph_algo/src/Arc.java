public class Arc implements Comparable{

	private final int source;
	private final int target;
	private final int weight;

	public Arc(int source, int target, int weight) {
		this.source = source;
		this.target = target;
		this.weight = weight;
	}//constructor

	public int getSource() {
		return source;
	}

	public int getTarget() {
		return target;
	}

	public int getWeight() {
		return weight;
	}


	@Override
	public int compareTo(Object o) {
		return Integer.compare(this.getSource(), ((Arc) o).getSource());
	}
}//class
