
public class Main {

	public static void main(String[] args) {
		GraphPond graphPond = new GraphPond(3, 2);
		graphPond.toStrPond();
		Dijkstra dijkstra = new Dijkstra(graphPond);
	}//main

}//class
