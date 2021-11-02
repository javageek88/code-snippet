package com.vivek.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

    public static void main(String[] args) {
        final List<Transaction> transactions = populateData();
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
