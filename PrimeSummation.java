package com.sravankumarmaddineni;

public class PrimeSummation {
    private int sumTill = 0;

    public PrimeSummation(int sumTill) {
        this.sumTill = sumTill;
    }

    public void printPrimeSum() {
        long sum = 5L;
        int numPrime=2;

        for (int i = 5; i < sumTill; i = i + 2) {
            if (i % 3 != 0) {
                int n=(int)Math.sqrt(i);
                int count = 0;
                for (int j = 2; j <= n; j++) {
                    if (i % j == 0) {
                        count++;
                    }

                }
                if (count == 0) {
                    sum = sum + i;
                    numPrime++;
                }
            }

        }
        System.out.println(sum);
        System.out.println(numPrime);
    }
}
