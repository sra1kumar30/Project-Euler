package com.sravankumarmaddineni;

import java.util.ArrayList;
import java.util.List;

public class SmallestMultiple {
    private int number=0;
    public  List<Integer> smallestMultipleArray=new ArrayList<Integer>();
    private int smallMultiple=1;


    public SmallestMultiple(int number) {
        this.number = number;
    }
    public int getSmallestMultiple(){
        smallestMultipleArray.add(1);
        smallestMultipleArray.add(2);
        smallestMultipleArray.add(3);
        for(int i=4;i<=number;i++){
            int n=i;
            int size=smallestMultipleArray.size();
            for(int j=1;j<size;j++){
                if(n%smallestMultipleArray.get(j)==0){
                    n=n/smallestMultipleArray.get(j);
                    }

                }
                if(n!=1) {
                    smallestMultipleArray.add(n);
                }
            }


    for(int i=0;i<smallestMultipleArray.size();i++){
            smallMultiple=smallMultiple*smallestMultipleArray.get(i);
    }
    return smallMultiple;
    }

}
