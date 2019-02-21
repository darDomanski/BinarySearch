package com.codecool.BinarySearch;

import java.util.Arrays;

public class BinarySearch {
    public static boolean search(int[] array, int item) {
        if ((array.length) == 0) return false;

        Arrays.sort(array);

        boolean found = false;
        int lowerBound = 0;
        int upperBound = array.length - 1;


        while (!found && lowerBound < upperBound) {

            int midPoint = lowerBound + (upperBound - lowerBound) / 2;

            if (array[midPoint] > item) upperBound = midPoint - 1;

            if (array[midPoint] < item) lowerBound = midPoint + 1;

            if (array[midPoint] == item) found = true;

        }
        return found;
    }
}