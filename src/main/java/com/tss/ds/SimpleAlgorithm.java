
package com.tss.ds;


public class SimpleAlgorithm {
    public static void main(String[] args) {

        SimpleAlgorithm sa = new SimpleAlgorithm();
        sa.findSum(9999999);
        System.out.println("Hello world!");

    }

    public Long findSum(int n){
        long startTime = System.currentTimeMillis();
        Long sum =  Long.valueOf(n*(n+1)/2);
        long endTime = System.currentTimeMillis();
        System.out.println("time taken by formula :"+(endTime-startTime));
        return sum;
    }
//time taken by formula :0
    /*public Long findSum(int n){
            long startTime = System.currentTimeMillis();

        Long sum=0L;
        for(int i=1;i<=n;i++){
            sum = sum+i;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("time taken by step addition :"+(endTime-startTime));
        return sum;
    }*/
//time taken by step addition :54
}