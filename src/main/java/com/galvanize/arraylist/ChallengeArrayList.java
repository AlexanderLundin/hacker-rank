package com.galvanize.arraylist;

public class ChallengeArrayList {


    public static void getValueAtXY(Integer[][] arrays, int x, int y) {
        Integer array[];
        array = arrays[x];
        if (array.length <= y){
            System.out.println("ERROR!");
        }else{
            String value = Integer.toString(array[y]);
            System.out.println(value);
        }
    }
}
