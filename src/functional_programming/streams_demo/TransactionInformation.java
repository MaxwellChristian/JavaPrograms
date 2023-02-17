package functional_programming.streams_demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TransactionInformation {

    public static void main(String []args){

        // create a list of traders
        Trader alex = new Trader("Alex", "Beijing");
        Trader maxwell = new Trader("Maxwell", "Regina");
        Trader tahmina = new Trader("Tahmina", "Dhaka");
        Trader kelci = new Trader("Kelci", "Beijing");
        Trader joe = new Trader("Joseph", "Regina");

        // create a list of transactions by different traders across years
        List<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction(alex, 2011, 500));
        transactions.add(new Transaction(maxwell, 2012, 1000));
        transactions.add(new Transaction(maxwell, 2011, 400));
        transactions.add(new Transaction(joe, 2012, 750));
        transactions.add(new Transaction(joe, 2012, 700));
        transactions.add(new Transaction(tahmina, 2017, 300));
        transactions.add(new Transaction(kelci, 2015, 500));

        // fetch all such transactions which were made in year 2011
        // Show all the transactions in increasing order of amount
        List<Transaction> transactionsFromYear = fetchByYear(transactions, 2011, true);
        System.out.println(transactionsFromYear);


    }

    private static List<Transaction> fetchByYear(List<Transaction> transactions, int year, boolean ascending) {

        // Steps
        // 1. create a stream
        // 2. filter as per condition
        // 3. order as per requirement
        // 4. return as per desired type

        // 4. return as per desired type
        return transactions.stream() // 1. create a stream
                .filter(transaction -> transaction.getYear() == year) // 2. filter as per condition
                .sorted(Comparator.comparing(Transaction::getValue)) // 3. order as per requirement [as per the amount of transaction]
                .toList();

    }

}
