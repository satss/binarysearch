package org.example;

public class Main {
    public static void main(String[] args) {

        int[] arr = new int[]{1, 2,4,5,6,7,8,19,23};
        System.out.println(binarySearchFormat(arr, 19));
    }


    // Binary search format look for sorted terminology
    public static int binarySearchFormat(int[] arr, int elem) {
        int first = 0;
        int last = arr.length;
        while (first <= last) {

            int mid = first + (last - first) / 2;
            if (arr[mid] == elem) {
                return mid;
            } else if (arr[mid] > elem) {
                last = mid - 1;
            } else {
                first = mid + 1;

            }

        }
        return -1;


    }
}