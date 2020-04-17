import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GraphPond {


    private ArrayList<Integer> peeksPond;
    private List<ArcPond> graphPond;

    public GraphPond(int n , int edge) {

        this.peeksPond = new ArrayList<>(n);
        this.graphPond = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            this.peeksPond.set(i,i);
        }//for

        createArcPond(n, edge);
    }


    public ArrayList<Integer> getPeeksPond() {
        return peeksPond;
    }

    public List<ArcPond> getGraphPond() {
        return graphPond;
    }



    /*			Graph  Pond				*/

    public void createArcPond(int n, int densite) {
        int densiteAccordingN = (n*(n-1))/2;
        if (densite > densiteAccordingN) densite = densiteAccordingN;

        Random rand = new Random();
        int source , target, weight = 0;
        for (int i = 0; i < densite; i++) {
            source = rand.nextInt(n);
            target = rand.nextInt(n);
            weight = rand.nextInt(n);
            while (target == source)
                target = rand.nextInt(n);

            ArcPond newArc = new ArcPond(source, target, weight);
            if (!arcPondExist(newArc)) {
                this.graphPond.add(newArc);
            }
            else {
                --i;
                newArc = null;
            }
        }//for
        this.graphPond.sort(Arc::compareTo);
    }//createArc

    private boolean arcPondExist(ArcPond arcPond) {
        return this.graphPond.contains(arcPond);
    }

    public void toStrPond() {
        String str = "GraphPond { \n";
        for (ArcPond arcPond : this.graphPond)
            str += " " +
                    "[" +
                    "s(" + arcPond.getSource() + "), " +
                    "t(" + arcPond.getTarget() + "), " +
                    "w(" + arcPond.getWeight() + ")" +
                    "]\n";
        str += "}";
        System.out.println(str);
    }//printer

}
