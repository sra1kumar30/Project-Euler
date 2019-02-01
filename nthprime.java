package com.sravankumarmaddineni;

import java.util.ArrayList;
import java.util.List;

public class nthprime {
    private int nthprime=0;
    private List<Integer> primeNumbers=new ArrayList<Integer>();

    public nthprime(int nthprime) {
        this.nthprime=nthprime;
    }

    public int getNthprime() {
        primeNumbers.add(2);
        for(int i=0;i<nthprime;i++){
            primeNumbers.add(getNextPrime(primeNumbers.get(i)));
        }

        return primeNumbers.get(nthprime-1);
    }

    private int getNextPrime(int n) {
        int i = n + 1;
        while (i > n) {
            int count = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    count++;
                }

            }
            if (count == 1) {
                return i;
            }
            i++;
        }
        return 0;
    }
}
