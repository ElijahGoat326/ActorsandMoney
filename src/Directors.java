class Directors extends Moviemaker {

    // Fields
    private String highestGrossingFilm;

    // Constructors

    public Directors(String rank, String name, String average, String numberOfFilms, String worldwideTotal, String highestGrossingFilm) {
        super(rank, name, average, numberOfFilms, worldwideTotal);
        this.highestGrossingFilm = highestGrossingFilm;
    }
}



