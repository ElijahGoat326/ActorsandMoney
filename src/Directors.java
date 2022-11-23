public class Director extends Moviemaker {

    // Fields
    String highestGrossingFilm;

    // Constructors
    public Director(String name, String rank, String numberOfFilms, String average, String worldwideTotal, String highestGrossingFilm) {
        super(name, rank, numberOfFilms, average, worldwideTotal);
         Director(String highestGrossingFilm) {
            this.highestGrossingFilm = highestGrossingFilm;
        }
    }
}



