package com.company;

public class Main {

    public static void main(String[] args) {


        int arraySize = 0;
        for (int i = 0; i <= 99; i++) {
            if (i % 2 != 0) arraySize++;
        }
        int[] array = new int[arraySize];
        for (int i = 1, a= 0; i <=99 ; i++) {
            if (i%2 != 0){
                array[a] = i;
                System.out.print(array[a]+" ");
                a++;
            }
        }
        System.out.println(" ");
        for (int i = array.length - 1  ; i >=0 ;i--) {
            System.out.print(array[i]+" ");
            
        }
    }
}