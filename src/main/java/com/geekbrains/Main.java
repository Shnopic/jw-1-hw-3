package com.geekbrains;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        invertArray();
        fillArray();
        changeArray();
        changeDiagonal();
        makeArray(6,9);
        minMaxArray();
    }

    //1
    public static void invertArray () {
        int[] array = {1,1,0,0,1,0,1,1,0,0};
        for (int i=0; i< array.length;i++) {
            if (array[i]==0){
                array[i]=1;
            } else {
                array[i]=0;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    //2
    public static void fillArray(){
        int[] array = new int[100];
        for (int i=0; i< array.length;i++){
            array[i] += i+1;
        }
        System.out.println(Arrays.toString(array));
    }

    //3
    public static void changeArray(){
        int[] array = {1,5,3,2,11,4,5,2,4,8,9,1};
        for (int i=0; i< array.length;i++){
            if (array[i]<6){
                array[i] *=2;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    //4
    public static void changeDiagonal(){
        int n=6;
        double result = (double) n/2;
        int[][] array= new int [n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i==j){
                    array[i][j] = 1;
                } else if ((double) (i+j+1)/2 == result) {
                    array[i][j] = 1;
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    //5
    public static int[] makeArray(int len, int initialValue){
        int[] array = new int [len];
        for (int i = 0; i< array.length; i++){
            array[i] = initialValue;
        }
        return array;
    }

    //6
    public static void minMaxArray(){
        int[] array = {1,2,3,-5,10};
        Arrays.sort(array);
        System.out.println(array[0]);
        System.out.println(array[array.length-1]);
    }
}
