public class Actor extends Moviemaker{
    private String AmountOfMoneyMade;
    private String filmAmount;
    private String totalmoneymade;


    public Actor(String rank, String name, String average, String numberOfFilms, String worldwideTotal, String amountOfMoneyMade, String filmAmount) {
        super(rank, name, average, numberOfFilms, worldwideTotal);
        AmountOfMoneyMade = amountOfMoneyMade;
        this.filmAmount = filmAmount;
        this.totalmoneymade = totalmoneymade;
    }

    public String getAmountOfMoneyMade() {
        return AmountOfMoneyMade;
    }

    public String getFilmAmount() {
        return filmAmount;
    }

    public String getTotalmoneymade() {
        return totalmoneymade;
    }


    public void setAmountOfMoneyMade(String amountOfMoneyMade) {
        AmountOfMoneyMade = amountOfMoneyMade;
    }

    public void setFilmAmount(String filmAmount) {
        this.filmAmount = filmAmount;
    }

    public void setTotalmoneymade(String totalmoneymade) {
        this.totalmoneymade = totalmoneymade;
    }

}
