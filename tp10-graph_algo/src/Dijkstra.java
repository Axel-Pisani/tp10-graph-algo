public class Dijkstra {

	private Graph graph;
	private Integer[] simpleQueue;

	public Dijkstra(Graph graph) {
		this.graph = graph;
		this.simpleQueue = graph.getSommets();
	}
}//class
