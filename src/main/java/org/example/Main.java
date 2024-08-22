package org.example;

public class Main {
    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 4, 5, 6, 7, 8, 19, 23};
        System.out.println(binarySearchFormat(arr, 19));

        int[] revArrr = new int[]{9, 8, 7, 6, 5, 4, 3, 2};
        System.out.printf("reverse %d", reverseBinarySearchFormat(revArrr, 5));

        int[] firstOcc = new int[]{2, 4, 10, 10, 10, 18, 20};

        System.out.printf("first occ%d", firstOccurrenceOfAnElem(firstOcc, 10));
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

    // Reverse binary search format look for sorted terminology
    public static int reverseBinarySearchFormat(int[] arr, int elem) {
        int first = 0;
        int last = arr.length;
        while (first <= last) {

            int mid = first + (last - first) / 2;
            if (arr[mid] == elem) {
                return mid;
            } else if (arr[mid] > elem) {
                first = mid - 1;
            } else {
                last = mid + 1;

            }

        }
        return -1;


    }

    //  binary search format on order not known
    public static int orderNotKnownBinarySearchFormat(int[] arr, int elem) {
        int first = 0;
        int last = arr.length;

        while (first <= last) {

            int mid = first + (last - first) / 2;
            if (arr[mid] == elem) {
                return mid;
            } else if (arr[mid] > elem) {

                if (arr[mid] > arr[mid - 1]) {
                    first = mid - 1;
                } else {
                    last = mid - 1;

                }
            } else {
                if (arr[mid] > arr[mid - 1]) {
                    last = mid + 1;
                } else {
                    first = mid + 1;
                }

            }
        }
        return -1;


    }

    //  binary search first occurrence of an elem

    public static int firstOccurrenceOfAnElem(int[] arr, int elem) {
        int first = 0;
        int last = arr.length;

        int result = -1;

        while (first <= last) {

            int mid = first + (last - first) / 2;

            if (arr[mid] == elem) {
                result = mid;
                last = mid - 1;
            } else if (arr[mid] > elem) {
                last = mid - 1;
            } else {
                first = mid + 1;
            }


        }
        return result;


    }

    //  binary search last occurrence of an elem

    public static int lastOccurrenceOfAnElem(int[] arr, int elem) {
        int first = 0;
        int last = arr.length;

        int result = -1;

        while (first <= last) {

            int mid = first + (last - first) / 2;

            if (arr[mid] == elem) {
                result = mid;
                first = mid - 1;
            } else if (arr[mid] > elem) {
                last = mid - 1;
            } else {
                first = mid + 1;
            }


        }
        return result;


    }


    //  binary search sorted array count number of occurrence of an elem

    public static int countNumOfOccurenceOfAnElem(int[] arr, int elem) {

        int lastocc = lastOccurrenceOfAnElem(arr, elem);
        int firstocc = firstOccurrenceOfAnElem(arr, elem);
        return lastocc - firstocc + 1;
    }

}