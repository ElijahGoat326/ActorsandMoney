public class Actor extends Moviemaker{
    String AmountOfMoneyMade;
    String filmAmount;
    String totalmoneymade;
    String amountoffilms;

    public Actor(String rank, String name, String average, String numberOfFilms, String amountOfMoneyMade, String filmAmount, String totalmoneymade, String amountoffilms) {
        super(rank, name, average, numberOfFilms);
        AmountOfMoneyMade = amountOfMoneyMade;
        this.filmAmount = filmAmount;
        this.totalmoneymade = totalmoneymade;
        this.amountoffilms = amountoffilms;
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

    public String getAmountoffilms() {
        return amountoffilms;
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

    public void setAmountoffilms(String amountoffilms) {
        this.amountoffilms = amountoffilms;
    }
}
