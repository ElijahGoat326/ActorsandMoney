public class Directors extends Moviemaker {

    // Fields
    private String HighestGrossingFilm;

    // Constructors


    public Directors(String rank, String name, String average, String numberOfFilms, String worldwideTotal, String highestGrossingFilm) {
        super(rank, name, average, numberOfFilms, worldwideTotal);
        HighestGrossingFilm = highestGrossingFilm;
    }

    public String getHighestGrossingFilm() {
        return HighestGrossingFilm;
    }
    public void setHighestGrossingFilm(String highestGrossingFilm) {
        HighestGrossingFilm = highestGrossingFilm;
    }
    // Methods
    void describeSelf() {
        System.out.println("Hi!  I'm " + name + ", I'm a Director who's ranked #" + rank + " in the world. I'm most famous for directing " + HighestGrossingFilm + ", which was the most money any of my films made, but I've directed " + numberOfFilms + " over the span of my career, and in those films, I average " + average + "per film. In total, I've made " + worldwideTotal + " in revenue throughout my career.");
    }
}




