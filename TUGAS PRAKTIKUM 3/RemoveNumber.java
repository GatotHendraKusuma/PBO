package SortCollection;

import java.util.Arrays;

public class RemoveNumber {
    int[] remove(int[] arr, int num) {
        // Find the index of the number to remove
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                index = i;
                break;
            }
        }

        // If the number is not found, return the original array
        if (index == -1) {
            System.out.println("Number not found in array.");
            return arr;
        }

        // Create a new array with one less element
        int[] newArr = new int[arr.length - 1];

        // Copy elements to the new array, skipping the removed element
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != index) {
                newArr[j++] = arr[i];
            }
        }

        // Print the removed number
        System.out.println("Removed number: " + num);

        return newArr;
    }
}