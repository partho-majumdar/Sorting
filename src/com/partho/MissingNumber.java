package com.partho;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {4, 0, 2, 1};
        System.out.println(findMissingNum(arr));
    }

    static int findMissingNum(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index;
            }
        }
        return arr.length;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

/*
    https://leetcode.com/problems/missing-number/

    Given an array num containing n distinct numbers in the range [0, n],
    return the only number in the range that is missing from the array.


    Example 1:
    Input: num = [3,0,1]
    Output: 2

    Example 2:
    Input: num = [0,1]
    Output: 2

    Example 3:
    Input: num = [9,6,4,2,3,5,7,0,1]
    Output: 8
*/