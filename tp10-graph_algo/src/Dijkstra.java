import java.util.ArrayList;

public class Dijkstra {

	private GraphPond graph;
	private ArrayList<Integer> simpleQueue;
	private ArrayList<Integer> d;


	public Dijkstra(GraphPond graph) {
		this.graph = graph;
		this.simpleQueue = graph.getPeeksPond();
		d = new ArrayList<>();

		makeDijkstra(0);
	}

	public ArrayList<Integer> makeDijkstra(Integer s){
		for (int i = 0; i <this.simpleQueue.size() ; i++) {
			this.d.add(i,10000000);
		}
		this.d.set(s,0);
		while(simpleQueue.size() != 0){
			Integer u = exctractMin();
			for (Integer v : this.graph.getVoisins(u)) {
				if (this.d.get(v) > (this.d.get(u) + this.graph.getWeightOfAnArc(u,v)))
					this.d.set(v, (this.d.get(u) + this.graph.getWeightOfAnArc(u,v)));
			}
		}
		System.out.println(this.d);
		return this.d;
	}

	public Integer exctractMin(){
		Integer min = this.simpleQueue.get(0);
		for (Integer i: this.simpleQueue) {
				if(this.d.get(i) < this.d.get(min))
					min = i;
		}
		this.simpleQueue.set(this.simpleQueue.indexOf(min),this.simpleQueue.get(this.simpleQueue.size()-1));
		this.simpleQueue.remove(this.simpleQueue.size()-1);

		return min;
	}



}//class
