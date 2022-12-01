public class Directors extends Moviemaker {

    // Fields
    public String highestGrossingFilm;

    // Constructors

    public Directors(String rank, String name, String average, String numberOfFilms, String worldwideTotal) {
        super(rank, name, average, numberOfFilms, worldwideTotal);
        this.highestGrossingFilm = highestGrossingFilm;
    }

    public String getHighestGrossingFilm() {
        return highestGrossingFilm;
    }
}





