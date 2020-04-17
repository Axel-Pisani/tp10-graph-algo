import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GraphPond {


    private Integer[] peeksPond;
    private List<ArcPond> graphPond;

    public GraphPond(int n , int edge) {

        this.peeksPond = new Integer[n];
        this.graphPond = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            this.peeksPond[i] = i;
        }//for

        createArcPond(n, edge);
    }


    public Integer[] getPeeksPond() {
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
    }//createArc

    private boolean arcPondExist(ArcPond arcPond) {
        return this.graphPond.contains(arcPond);
    }


    public void toStrPond() {
        String str = "GraphPond { \n";
        for (int i = 0; i < this.graphPond.size(); ++i) {
            str += i + " " +
                    "[" +
                    "s(" + this.graphPond.get(i).getSource() + "), " +
                    "t(" + this.graphPond.get(i).getTarget() + "), " +
                    "w(" + this.graphPond.get(i).getWeight() + ")" +
                    "]\n";
        }//for
        str += "}";
        System.out.println(str);
    }//printer



}
