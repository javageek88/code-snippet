package com.vivek.hr;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SockMerchant {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        Map<Integer, Integer> sameColorPairCount = new HashMap<>();
        int count;
        for (int i = 0; i < ar.length; i++) {
            count = 1;
            if (sameColorPairCount.containsKey(ar[i])) {
                count += sameColorPairCount.get(ar[i]);
            }
            sameColorPairCount.put(ar[i], count);
        }
        //o(n)
        int totalPair = 0;
        for (int i : sameColorPairCount.values()) {
            totalPair += i / 2;
        }
        //o(n)
        return totalPair;
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/Users/vivekthakare/Documents/professional/learn/repo/code-snippet/src/main/java/com/vivek/hr/output.txt"));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();

        System.out.println("result = " + result);
    }
}
