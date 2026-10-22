package StreamsPractice;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Transaction {
    String id;
    double amount;
    LocalDate date;

    Transaction(String id, double amount, LocalDate date) {
        this.id = id;
        this.amount = amount;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public Double getAmount() {
        return amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public String toString() {
        return "Id: " + id + ", Date: " + date + ", Amount: " + amount;
    }
}

public class MaxTransaction {
    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
                new Transaction("1", 10000, LocalDate.of(2024, 1, 1)),
                new Transaction("2", 20000, LocalDate.of(2024, 1, 2)),
                new Transaction("3", 20000, LocalDate.of(2025, 3, 4)),
                new Transaction("4", 30000, LocalDate.of(2025, 3, 4)),
                new Transaction("5", 34000, LocalDate.of(2024, 1, 2)),
                new Transaction("6", 24000, LocalDate.of(2024, 1, 1)));
        Map.Entry<LocalDate, Double> sumTransactions = transactions.stream()
                .collect(Collectors.groupingBy(Transaction::getDate,
                        Collectors.summingDouble(Transaction::getAmount)))
                .entrySet().stream().max(Map.Entry.comparingByValue()).orElse(null);
        System.out.println("Sum by Transactions " + sumTransactions);
    }
}
