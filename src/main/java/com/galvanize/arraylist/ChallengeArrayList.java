package com.galvanize.arraylist;

public class ChallengeArrayList {



    public static int getValueAtY(Integer array[]) {
        int y = array[0];
        if (array.length <= y){
            System.out.println("ERROR!");
            return 0;
        }else{
            return array[y];
        }
    }
}
