public class Moviemaker {

    private String rank;
    private String name;
    private String average;
    private String numberOfFilms;

    public Moviemaker(String rank, String name, String average, String numberOfFilms) {
        this.rank = rank;
        this.name = name;
        this.average = average;
        this.numberOfFilms = numberOfFilms;
    }

    public String getRank() {
        return rank;
    }

    public String getName() {
        return name;
    }

    public String getAverage() {
        return average;
    }

    public String getNumberOfFilms() {
        return numberOfFilms;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAverage(String average) {
        this.average = average;
    }

    public void setNumberOfFilms(String numberOfFilms) {
        this.numberOfFilms = numberOfFilms;
    }
}
