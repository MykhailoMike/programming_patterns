package main.java.com.mkaloshyn.structural.composite_08;

public class Concert {

    public static void main(String[] args) {

        StringEnsemble ensemble = new StringEnsemble();

        Musician soloViolin = new Violinist();
        Musician violinist02 = new Violinist();
        Musician violinist03 = new Violinist();
        Musician cello = new CelloPlayer();
        Musician viola = new ViolaPlayer();
        Musician contrabass = new ContrabassPlayer();

        ensemble.addMusician(soloViolin);
        ensemble.addMusician(violinist02);
        ensemble.addMusician(violinist03);
        ensemble.addMusician(cello);
        ensemble.addMusician(viola);
        ensemble.addMusician(contrabass);

        ensemble.playConcert();
    }
}
