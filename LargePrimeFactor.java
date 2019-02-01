package com.sravankumarmaddineni;

import java.util.ArrayList;
import java.util.List;

public class LargePrimeFactor {
    private long number;
    private List<Long> primeFactors=new ArrayList<Long>();

    public LargePrimeFactor(long number) {
        this.number = number;
    }
    public long getLargePrimeFactor(){
        long i=2L;
        while (i<=number){
            if(number%i==0L){
                number=number/i;
                primeFactors.add(i);
                if(number==1){
                    return primeFactors.get(primeFactors.size()-1);
                }
            }
            else {
                i=getNextPrime(i);
            }

        }
      return 0L;
    }
    private long getNextPrime(long n){
       long i=n+1L;
       while(i>n){
           int count=0;
           for (long j=1L;j<i;j++){
               if (i%j==0){
                   count++;
               }

           }
           if(count==1){
               return i;
           }
           i++;
       }
       return 0L;
    }
}
