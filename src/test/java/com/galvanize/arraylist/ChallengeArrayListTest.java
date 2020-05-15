package com.galvanize.arraylist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ChallengeArrayListTest {
    //Alex Lundin
    //OICE - An effective way to consume requirements
    //Output
    //  integer located at yth position of xth line
    //  or print "ERROR!"
    //Input
    //  n lines of input
    //  on each line d, the first number will be d, denoting the number of ints on line
    //  ints are space separated
    //  next line is query q, which consists of two integers x and y
    //Constraints
    //  Are there any stated constraints to the problem?
    //  Are there any indicators of time vs space trade-offs?
    //Examples and Edge Cases
    //  List examples from problem
    //  Think of edge cases at boundary values, 0 and 1 are typical
        //Integer array1[] = {5, 41, 77, 74, 22, 44};
        //Integer array2[] = {1, 12};
        //Integer array3[] = {4, 37, 34, 36, 52};
        //Integer array4[] = {0};
        //Integer array5[] = {3, 20, 22, 33};
        //List<Integer> myList1 = Arrays.asList(array1);
        //List<Integer> myList2 = Arrays.asList(array2);
        //List<Integer> myList3 = Arrays.asList(array3);
        //List<Integer> myList4 = Arrays.asList(array4);
        //List<Integer> myList5 = Arrays.asList(array5);

    @Test
    public void getValueAtX_returnsInt() {
        //Setup
        int expected = 44;
        Integer array1[] = {5, 41, 77, 74, 22, 44};
        //Exercise
        int actual = ChallengeArrayList.getValueAtY(array1);
        //Assert
        assertEquals(expected, actual);
        //Teardown
    }
}