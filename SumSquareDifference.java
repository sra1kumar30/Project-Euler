package com.sravankumarmaddineni;

public class SumSquareDifference {
    private int tillNumber=0;
    private int sum1=0;
    private int sum2=0;

    public SumSquareDifference(int tillNumber) {

        this.tillNumber = tillNumber;
    }
    public int getSumSquareDifference(){
        for(int i=1;i<=tillNumber;i++){
            sum1=sum1+i*i;
            sum2=sum2+i;

        }

        return (sum2*sum2-sum1);
    }
}
