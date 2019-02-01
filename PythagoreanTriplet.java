package com.sravankumarmaddineni;

public class PythagoreanTriplet {
    public PythagoreanTriplet() {
    }

    private int a=1;
    private int b=2;
    private int c=3;


    public void calculateTriplet(){
        for(a=1;a<1000;a++){
            for(b=a+1;b<1000;b++){
                c=1000-a-b;

                if(c*c==(a*a+b*b)){
                    System.out.println(a);
                    System.out.println(b);
                    System.out.println(c);
                    System.out.println(a*b*c);
                }
            }
        }

    }

}
