import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Moviemaker> allmoviemakers = new ArrayList<>();
        Actor stanL = new Actor("1","Stan Lee"," $624,606,668","49 films","$30,605,726,750","$2,797,732,053");
        Directors stevenS = new Directors (" 1", " Steven Spielberg", " $287,567,687", " 37", " $10,640,004,408", "Jurassic Park $1,045,573,035");
        allmoviemakers.add(stanL);
        allmoviemakers.add(stevenS);
        for (Moviemaker maker: allmoviemakers) {
            maker.describeSelf();
        }
    }
}

