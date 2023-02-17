package functional_programming.streams_demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TransactionInformation {

    public static void main(String[] args) {

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
        List<Transaction> transactionsFromYear = fetchByYear(transactions, 2011, false);
        System.out.println(transactionsFromYear);

        // fetch all the traders in sorted order
        // the use of the method indicates that the return should be either a list of names
        // or a single string having all names properly delimited
        // [this indicates that there should not be duplication in names fetched]
        System.out.println(fetchAllTraders(transactions));

        // fetch traders that belong to a city
        System.out.println("Traders from 'Regina': " + fetchTradersByCity(transactions, "Regina"));

        // display all the transactions performed by traders of Regina
        showTransactionsByCity(transactions, "Regina");

        // display the transaction with maximum value
        System.out.println("Maximum Transaction amount: " + showMaxValueTransaction(transactions));
        System.out.println("Maximum Transaction amount: " + showMaxValueTransaction(new ArrayList<Transaction>()).orElse(0));

        // fetch all transactions that are in multiple of 750
        Stream<Transaction> transactionsInMultiple = transactions.stream().filter(transaction -> transaction.getValue() % 750 == 0);
        System.out.println("Total transactions in multiple of 750: " + transactionsInMultiple.count());
    }

    private static Optional<Integer> showMaxValueTransaction(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getValue)
                .reduce(Integer::max)
                ;
    }

    private static void showTransactionsByCity(List<Transaction> transactions, String city) {

        transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals(city))
                .map(Transaction::getValue)
                .forEach(System.out::println);
        ;

    }

    private static String fetchTradersByCity(List<Transaction> transactions, String city) {

        return transactions.stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals(city))
                .map(Trader::getName)
                .distinct()
                .sorted()
                .collect(Collectors.joining(", "))
                ;
    }

    private static List<String> fetchAllTraders(List<Transaction> transactions) {

        return transactions.stream()   // 1. create a stream
                .map(transaction -> transaction.getTrader().getName()) // 2. fetch the name of trader from transaction
                .distinct() // 3. fetch only the unique names
                .sorted() // 4. sort the names alphabetically
//                .reduce("", (name1, name2) -> name1 + name2) // converting all names to a single string [basic way]
//                .collect(Collectors.joining()) // converting all names to a single string [more optimised as it uses StringBuilder internally]
                .toList()
                ;

    }

    private static List<Transaction> fetchByYear(List<Transaction> transactions, int year, boolean ascending) {

        // Steps
        // 1. create a stream
        // 2. filter as per condition
        // 3. order as per requirement
        // 4. return as per desired type

        // 4. return as per desired type

        // version 1: most simple version (using if)
//        if( ascending ){
//            return transactions.stream() // 1. create a stream
//                    .filter(transaction -> transaction.getYear() == year) // 2. filter as per condition
//                    .sorted(Comparator.comparing(Transaction::getValue)) // 3. order as per requirement [as per the amount of transaction]
//                    .toList();
//        }
//        else {
//            return transactions.stream() // 1. create a stream
//                    .filter(transaction -> transaction.getYear() == year) // 2. filter as per condition
//                    .sorted(Comparator.comparing(Transaction::getValue).reversed()) // 3. order as per requirement [as per the amount of transaction]
//                    .toList();
//        }

        // version 2: using if in a comparator
//        return transactions.stream() // 1. create a stream
//                .filter(transaction -> transaction.getYear() == year) // 2. filter as per condition
//                .sorted((o1, o2) -> {
//                    if (ascending) {
//                        return o1.getValue() - o2.getValue();
//                    } else {
//                        return o2.getValue() - o1.getValue();
//                    }
//                }) // 3. order as per requirement [as per the amount of transaction]
//                .toList();

        // version 3: using the comparator with applicable operator
        return transactions.stream() // 1. create a stream
                .filter(transaction -> transaction.getYear() == year) // 2. filter as per condition
                .sorted(ascending ? (Comparator.comparing(Transaction::getValue)) : (Comparator.comparing(Transaction::getValue).reversed())) // 3. order as per requirement [as per the amount of transaction]
                .toList();

        // leo's fancy version
//        return transactions.stream() // 1. create a stream
//                .filter(transaction -> transaction.getYear() == year) // 2. filter as per condition
//                .sorted( (o1, o2) -> (o1.getValue() - o2.getValue()) * (ascending ? 1 : -1) ) // 3. order as per requirement [as per the amount of transaction]
//                .toList();

    }

}
