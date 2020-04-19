import java.util.ArrayList;

public class Dijkstra {

	private GraphPond graph;
	private ArrayList<Integer> simpleQueue;
	private ArrayList<Integer> d;
	public Dijkstra(GraphPond graph) {

		this.graph = graph;
		this.simpleQueue = graph.getPeeksPond();
		d = new ArrayList<>(simpleQueue.size());
	}

	public ArrayList<Integer> makeDijkstra(Integer s){
		d.set(s,0);
		while(simpleQueue.size() != 0 ){
			Integer u = exctractMin();
		
		}


		return this.d;
	}

	public Integer exctractMin(){
		Integer min = this.simpleQueue.get(0);
		for (Integer i: this.simpleQueue
			 ) {
				if(this.d.get(i) < this.d.get(min)){
					min = i;
				}
		}
		this.simpleQueue.set(this.simpleQueue.indexOf(min),this.simpleQueue.get(this.simpleQueue.size()-1));
		this.simpleQueue.remove(this.simpleQueue.size()-1);

		return min;
	}



}//class
