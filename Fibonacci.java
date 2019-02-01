package com.sravankumarmaddineni;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    private int tillNumber=1;
    private int sum=0;
    private List<Integer> fibonacciSeries=new ArrayList<Integer>();
    public Fibonacci(int tillNumber) {
        this.tillNumber=tillNumber;
        generateFibonacci(tillNumber);
    }
    private void generateFibonacci(int tillNumber){
        fibonacciSeries.add(1);
        fibonacciSeries.add(2);

        for(int i=0;fibonacciSeries.get(i)+fibonacciSeries.get(i+1)<tillNumber;i++){
            fibonacciSeries.add(fibonacciSeries.get(i)+fibonacciSeries.get(i+1));

        }
    }
    public List<Integer> getFibonacci(){
        return fibonacciSeries;
    }
    public int getSumOfEvenFibonacci(){
        for(int i=0;i<fibonacciSeries.size();i++){
            if(fibonacciSeries.get(i)%2==0){
                sum=sum+fibonacciSeries.get(i);
            }
        }
        return sum;
    }



}
