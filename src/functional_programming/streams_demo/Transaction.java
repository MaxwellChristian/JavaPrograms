package functional_programming.streams_demo;

// This class is used to store the information regarding a Transaction
// by a trader. The transaction amount and year also needs to be captured.

public class Transaction {

    // Trader information
    private final Trader trader;

    // the year of transaction
    private final int year;

    // value/amount of transaction
    private final int value;

    public Transaction(Trader trader, int year, int value) {
        this.trader = trader;
        this.year = year;
        this.value = value;
    }

    public Trader getTrader() {
        return trader;
    }

    public int getYear() {
        return year;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Transaction{");
        sb.append("trader=").append(trader);
        sb.append(", year=").append(year);
        sb.append(", value=").append(value);
        sb.append('}');
        return sb.toString();
    }
}
