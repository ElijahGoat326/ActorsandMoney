import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Actor.readAllData();
        Directors.readAllData();

        for (Moviemaker maker: Moviemaker.getAllmoviemakers()) {
            System.out.println(maker);
        }
    }
}