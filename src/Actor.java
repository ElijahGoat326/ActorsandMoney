public class Actor extends Moviemaker {
    private String AmountOfMoneyMade;
    private String totalmoneymade;

    public Actor(String rank, String name, String average, String numberOfFilms, String worldwideTotal, String amountOfMoneyMade) {
        super(rank, name, average, numberOfFilms, worldwideTotal);
        AmountOfMoneyMade = amountOfMoneyMade;
        this.totalmoneymade = totalmoneymade;
    }

    public String getAmountOfMoneyMade() {
        return AmountOfMoneyMade;
    }

    public String getTotalmoneymade() {
        return totalmoneymade;
    }


    public void setAmountOfMoneyMade(String amountOfMoneyMade) {
        AmountOfMoneyMade = amountOfMoneyMade;
    }

    public void setTotalmoneymade(String totalmoneymade) {
        this.totalmoneymade = totalmoneymade;
    }

    public String toString() {
        return ("I'm " + name + ", my rank is " + rank + ",I have an average of" + average + " ,I am in " + numberOfFilms +  " ,My worldwide total is" + getWorldwideTotal() + " ,My amount of money made is" + AmountOfMoneyMade);
    }
}