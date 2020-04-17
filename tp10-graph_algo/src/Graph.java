import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Graph {
	private Integer[] peeks;
	private List<LinkedList<Integer>> graph;



	/**
	 * @param n : peeks number of the graph
	 * @param edge : edge number of the graph
	 * */
	public Graph(int n, int edge) {
		this.peeks = new Integer[n];
		this.graph = new ArrayList<>();


		for (int i = 0; i < n; i++) {
			this.peeks[i] = i;
			this.graph.add(new LinkedList<Integer>());
		}//for

		createArc(n, edge);

	}//construct

	/*			GETTER				*/

	public Integer[] getSommets() {
		return peeks;
	}

	public List<LinkedList<Integer>> getGraph() {
		return graph;
	}

	public Integer[] getPeeks() {
		return peeks;
	}


	/*			Graph Non Pond				*/

	private void createArc(int n, int densite) {
		int densiteAccordingN = (n*(n-1))/2;
		if (densite > densiteAccordingN) densite = densiteAccordingN;
		Random rand = new Random();
		int source , target = 0;
		for (int i = 0; i < densite; i++) {
			source = rand.nextInt(n);
			target = rand.nextInt(n);
			while (target == source) {
				target = rand.nextInt(n);
			}
			if (!arcExist(source, target))
				this.graph.get(source).add(target);
			else --i;
		}//for
	}//createArc

	public void toStr() {
		String str = "Graph { \n";
		for (int i = 0; i < this.graph.size(); ++i) {
			str += i + " " + this.graph.get(i).toString() + "\n";
		}//for
		str += "}";
		System.out.println(str);
	}//printer

	private boolean arcExist(int s, int t) {
		return this.graph.get(s).contains(t);
	}



}//class
