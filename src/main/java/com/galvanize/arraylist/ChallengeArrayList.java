package com.galvanize.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChallengeArrayList {

    public static Integer[][] toArrays(ArrayList arrayList){
        int i = 0;
        int arrayCount = 0;
        Integer n = (int) arrayList.get(i);
        int length;
        int d;
        Integer arrays [][] = new Integer [++n][];
        arrays[arrayCount] = new Integer[]{--n};
        arrayCount++;
        Integer array [];
        i++;
        for (arrayCount = 1; arrayCount <= n ; arrayCount++) {
            d = (Integer) arrayList.get(i);
            length = d;
            array = new Integer [++length];
            array[0] = d;
            i++;
            for (int j = 2; j < length + 1 ; j++) {
                array[j - 1] = (Integer) arrayList.get(i);
                i++;
            }
            arrays[arrayCount] = array;
        }
        return arrays;
    }

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

class Solution {

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        arrayList.add(n);
        int d = 0;
        int value = 0;
        for (int i = 0; i < n ; i++) {
            d = scan.nextInt();
            arrayList.add(d);
            for (int j = 0; j < d ; j++) {
                value = scan.nextInt();
                arrayList.add(value);
            }
        }
        // loop for queries
        n = scan.nextInt();
        arrayList.add(n);
        int q = 0;
        for (int i = 0; i < n ; i++) {
            q = scan.nextInt();
            arrayList.add(q);
            for (int j = 0; j < d ; j++) {
                value = scan.nextInt();
                arrayList.add(value);
            }
        }

    }
}