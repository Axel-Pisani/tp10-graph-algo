public class Arc {

	private int source;
	private int target;
	private int weight;

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
}//class
