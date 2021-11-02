package com.vivek.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamDemo {

    public static void main(String[] args) {
        final List<Transaction> transactions = populateData();
        reverseSortTransactions(transactions);
        matchOperations(transactions);
        reduceOperations(transactions);
    }

    private static void reduceOperations(List<Transaction> transactions){
        System.out.println( "Size : " + transactions.size());
        System.out.println("max value = " + transactions.stream().map(Transaction::getValue).reduce(1, Integer::max));
        System.out.println("min value = " + transactions.stream().map(Transaction::getValue).min(Comparator.comparingInt(Integer::intValue)));
        System.out.println("Product value = " + transactions.stream().map(Transaction::getValue).reduce(1, (a,b) -> a*b));
        System.out.print("Range 1-10 = ");IntStream.range(1, 10).forEach(System.out::print);
        System.out.println("RangeClosed 1-10 =");IntStream.rangeClosed(1, 10).forEach(System.out::print);
    }

    private static void matchOperations(List<Transaction> transactions){
        System.out.println("allMatch = " + transactions.stream().allMatch(transaction -> transaction.value > 50));
        System.out.println("anyMatch = " + transactions.stream().anyMatch(transaction -> transaction.value > 50));
        System.out.println("noneMatch = " + transactions.stream().noneMatch(transaction -> transaction.value > 50));
    }

    private static void reverseSortTransactions(List<Transaction> transactions) {
        System.out.println("Transactions Before sorting = " + transactions);
        List<Long> transactionIds = transactions.stream().filter(transaction -> Category.GROCERY == transaction.getCategory())
                .sorted(Comparator.comparingInt(Transaction::getValue).reversed())
                .map(Transaction::getId)
                .collect(Collectors.toList());

        System.out.println("Reverse sorted transactionIds = " + transactionIds);
    }

    public static List<Transaction> populateData(){
        List<Transaction> transactions = new ArrayList<>();
        Transaction t1 = new Transaction(1, 100, Category.LOAN);
        Transaction t2 = new Transaction(2, 20, Category.FOOD);
        Transaction t3 = new Transaction(3, 50, Category.GROCERY);
        Transaction t4 = new Transaction(4, 10, Category.FOOD);
        Transaction t5 = new Transaction(5, 80, Category.GROCERY);
        transactions.add(t1);
        transactions.add(t2);
        transactions.add(t3);
        transactions.add(t4);
        transactions.add(t5);
        return transactions;
    }
}

class Transaction{
    long id;
    int value;
    Category category;

    public Transaction(long id, int value, Category category) {
        this.id = id;
        this.value = value;
        this.category = category;
    }

    public long getId() {
        return id;
    }

    public int getValue() {
        return value;
    }

    public Category getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return id + ":" +value+ ":"+category.name();
    }
}

enum Category{
    GROCERY,
    LOAN,
    FOOD;
}
