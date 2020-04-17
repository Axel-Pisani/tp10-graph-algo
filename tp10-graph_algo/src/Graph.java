import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Graph {
	private Integer[] peeks;
	private List<ArcNoPond> graph;



	/**
	 * @param n : peeks number of the graph
	 * @param edge : edge number of the graph
	 * */
	public Graph(int n, int edge) {
		this.peeks = new Integer[n];
		this.graph = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			this.peeks[i] = i;
		}//for
		createArc(n, edge);
	}//construct


	/*			GETTER				*/

	public Integer[] getSommets() {
		return peeks;
	}

	public List<ArcNoPond> getGraph() {
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
			ArcNoPond arc = new ArcNoPond(source, target);
			if (!arcExist(arc))
				this.graph.add(arc);
			else --i;
		}//for
		this.graph.sort(Arc::compareTo);
	}//createArc

	public void toStr() {
		String str = "Graph { \n";
		for (int i = 0; i < this.graph.size(); ++i) {
			str += i + " " + this.graph.get(i).toString() + "\n";
		}//for
		str += "}";
		System.out.println(str);
	}//printer

	private boolean arcExist(ArcNoPond arc) {
		return this.graph.contains(arc);
	}



}//class
