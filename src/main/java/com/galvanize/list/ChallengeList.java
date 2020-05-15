package com.galvanize.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        System.out.println("waiting for input: ");
        int n = scanner.nextInt();
        Integer[] arrayOfNumbers = new Integer[n];
        List<Integer> listOfNumbers = new ArrayList<Integer>();
        for (int i = 0; i < n ; i++) {
            listOfNumbers.add(scanner.nextInt());
        }
        arrayOfNumbers = listOfNumbers.toArray(arrayOfNumbers);

        int q = scanner.nextInt();
        String type;
        Integer[] item = new Integer[3];
        Integer[][] arrayOfQueries = new Integer[q][3];


        for (int i = 0; i < q ; i++) {
            System.out.println("waiting for next line: ");
            type = scanner.next();
            if (type.equals("Insert")){
                item[0] = 1;
            }else{
                item[0] = 0;
            }
            System.out.println("waiting for next int: ");
            listOfNumbers = new ArrayList<Integer>();
            listOfNumbers.add(scanner.nextInt());
            listOfNumbers.add(scanner.nextInt());
            item[1] = listOfNumbers.get(0);
            item[2] = listOfNumbers.get(1);
            arrayOfQueries[0] = item;
        }
    }
}

public class ChallengeList {
}
