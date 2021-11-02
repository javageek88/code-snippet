package com.vivek.java8;

import java.util.Arrays;

public class TestMain {
    public static void main(String[] args) {
        System.out.println("args = " + Arrays.stream(new int[]{}).min().orElse(0));
    }
}
