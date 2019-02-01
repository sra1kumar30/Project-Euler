package com.sravankumarmaddineni;
public class challengeOne {
    private int sum=0;
    protected int sumOfThreeOrFiveMultiples(int n){
        for(int i=3;i<n;i++){
            if(i%3==0 || i%5==0){
                sum=sum+i;
            }
        }
        return sum;
    }
}
//List<Integer> threeMultiples = new ArrayList<Integer>();
//        List<Integer> fiveMultiples = new ArrayList<Integer>();
//        threeMultiples.add(1);
//        threeMultiples.add(2);
//        threeMultiples.add(threeMultiples.size());
//        for (int i = 3; i < n; i = i + 3) {
//            if(i%5!=0) {
//                threeMultiples.add(i);
//            }
//        }
//        for (int i = 5; i < n; i = i + 5) {
//            fiveMultiples.add(i);
//        }
//        int sum = 0;
//        for (int i = 0; i < threeMultiples.size(); i++) {
//            sum = sum + threeMultiples.get(i);
//        }
//        for (int j = 0; j < fiveMultiples.size(); j++) {
//            sum = sum + fiveMultiples.get(j);
//        }
//        System.out.println(threeMultiples.size());
//        System.out.println(fiveMultiples.size());
//        System.out.println(sum);
//        List<Integer> threeOrFiveMultiples = new ArrayList<Integer>();