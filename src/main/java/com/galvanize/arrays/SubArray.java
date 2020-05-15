package com.galvanize.arrays;

public class SubArray {
    public static int countNegativeSubArrays(int[] array) {
        int sum = 0;
        int count = 0;
        int value = 0;
        for (int i = 0; i < array.length; i++) {
            sum = 0;
            for (int j = i; j < array.length; j++) {
                value = array[j];
                sum += value;
                if (sum < 0){
                    count++;
                }
            }

        }
        return count;
    }
}

//public class Solution {
//
//    public static void main(String[] args) {
//        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//    }
//}