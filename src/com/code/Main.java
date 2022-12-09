//package com.code;

public class Main {

    public static void main(String[] args) {
        int i=10;int j=1;
        int[] arr= new int[12];

        for(int it=0;it<12;it++){

            if(it%2==0){
                arr[it]=i;
                if(it!=4 ){
                    i-=1;
                }

            }
            else{
                arr[it]=j;
                if(it!=5){
                    j+=1;
                }

            }
        }
        for(int it=0;it<12;it++){
            System.out.print(arr[it]+"\t");

        }
    }
}
