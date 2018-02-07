/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics3u.unit6;

/**
 *
 * @author maruiling
 */
/*
Name: Ruiling Ma
Date: May 09 2017
Version: 1.0
Description: contains different method for arraies and a tester
 */
import java.math.BigDecimal;

class ArrayUtil {

    public static void generateRandomArrayNoDuplicates(int[] data, int min, int max) {

        int random;
        boolean repeat = true;
        int i = 0;
        if((max - min + 1) < data.length)
            return;
        
        for(int c = 0; c < data.length; c++){
            data[c] = min - 1;
        }
        while(i < data.length) {
            repeat = true;
            random = (int) (Math.random() * (max - min + 1)) + min;
            for (int j = 0; j < data.length; j++) {
                if (data[j] == random) {
                    repeat = false;
                    break;
                }
            }
            if (repeat) {
                data[i] = random;
                i++;
            } 
            
        }
    }

    /**
     * Find the maximum value in data Precondition: data.length > 0
     *
     * @param data the array
     * @return the maximum value
     */
    public static int max(int[] data) {
        //max to store the maximum value so far
        int max = data[0];
        //travel the array to find the maximum value
        for (int i : data) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    /**
     * Find the maximum value in data Precondition: data.length > 0
     *
     * @param data the array
     * @return the maximum value
     */
    public static double max(double[] data) {
        //max to store the maximum value so far
        double max = data[0];
        //travel the array to find the maximum value
        for (double i : data) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    /**
     * Find the maximum value in data Precondition: data.length > 0
     *
     * @param data the array
     * @return the maximum value
     */
    public static int min(int[] data) {
        //min to store the minimum value so far
        int min = data[0];
        //travel the array to find the minimum value
        for (int i : data) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    /**
     * Find the maximum value in data Precondition: data.length > 0
     *
     * @param data the array
     * @return the maximum value
     */
    public static double min(double[] data) {
        //min to store the minimum value so far
        double min = data[0];
        //travel the array to find the minimum value
        for (double i : data) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    /**
     * Calculate the sum of all elements in data Precondition: data.length > 0
     *
     * @param data the array
     * @return the sum
     */
    public static int sum(int[] data) {
        //store the sum of array
        int sum = 0;
        //travel the array to add each element to sum
        for (int i : data) {
            sum += i;
        }
        return sum;
    }

    /**
     * Calculate the sum of all elements in data Precondition: data.length > 0
     *
     * @param data the array
     * @return the sum
     */
    public static double sum(double[] data) {
        //use BigDecimal to calculate double
        BigDecimal[] array = new BigDecimal[data.length];
        //copy each element from data to new array
        for (int i = 0; i < data.length; i++) {
            array[i] = new BigDecimal(Double.toString(data[i]));
        }
        //store the sum
        BigDecimal sum = new BigDecimal(Double.toString(0.0));
        //travel array to add each element
        for (BigDecimal i : array) {
            sum = sum.add(i);
        }
        return sum.doubleValue();
    }

    /**
     * Calculate the average of all elements in data Precondition: data.length >
     * 0
     *
     * @param data the array
     * @return the average
     */
    public static double average(int[] data) {
        //use BigDecimal to calculate double
        //get the sum of array 
        BigDecimal result = new BigDecimal(sum(data));
        //divide by the number of elements
        result = result.divide(new BigDecimal(data.length));
        return result.doubleValue();
    }

    /**
     * Calculate the average of all elements in data Precondition: data.length >
     * 0
     *
     * @param data the array
     * @return the average
     */
    public static double average(double[] data) {
        //use BigDecimal to calculate double
        //get the sum of array 
        BigDecimal result = new BigDecimal(sum(data));
        //divide by the number of elements
        result = result.divide(new BigDecimal(data.length));
        return result.doubleValue();
    }

    /**
     * Sort data Precondition: data.length > 0 Postcondition: data is sorted in
     * ascending order
     *
     * @param data the array to be sorted
     */
    public static void bubbleSortAscending(int[] data) {

        for (int i = data.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (data[j + 1] < data[j]) {
                    helperClass.swap(j, j + 1, data);
                }
            }
        }
    }

    /**
     * Sort data Precondition: data.length > 0 Postcondition: data is sorted in
     * ascending order
     *
     * @param data the array to be sorted
     */
    public static void bubbleSortDescending(int[] data) {

        for (int i = data.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (data[j + 1] > data[j]) {
                    helperClass.swap(j, j + 1, data);
                }
            }
        }
    }

    /**
     * Sort data Precondition: data.length > 0 Postcondition: data is sorted in
     * ascending order
     *
     * @param data the array to be sorted
     */
    public static void bubbleSortAscending(double[] data) {

        for (int i = data.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (data[j + 1] < data[j]) {
                    helperClass.swap(j, j + 1, data);
                }
            }
        }
    }

    /**
     * Sort data Precondition: data.length > 0 Postcondition: data is sorted in
     * descending order
     *
     * @param data the array to be sorted
     */
    public static void bubbleSortDescending(double[] data) {

        if (data.length == 0) {
            return;
        }

        for (int i = data.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (data[j + 1] > data[j]) {
                    helperClass.swap(j, j + 1, data);
                }
            }
        }
    }

    /**
     * Sort data Precondition: data.length > 0 Postcondition: data is sorted in
     * descending order
     *
     * @param data the array to be sorted
     */
    public static void bubbleSortAscending(String[] data) {

        for (int i = data.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if ((data[j + 1].compareTo(data[j]) < 0)) {
                    helperClass.swap(j, j + 1, data);
                }
            }
        }
    }

    /**
     * Sort data Precondition: data.length > 0 Postcondition: data is sorted in
     * descending order
     *
     * @param data the array to be sorted
     */
    public static void bubbleSortDescending(String[] data) {

        for (int i = data.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if ((data[j + 1].compareTo(data[j]) > 0)) {
                    helperClass.swap(j, j + 1, data);
                }
            }
        }
    }

    /**
     * Sort data Precondition: data.length > 0 Postcondition: data is sorted in
     * ascending order
     *
     * @param data the array to be sorted
     */
    public static void selectionSortAscending(int[] data) {
        //start with the first element of array
        int min = 0;
        for (int i = 0; i < data.length; i++) {
            //min always equals the first index of unsorted part
            min = i;
            for (int j = i; j < data.length; j++) {
                //find the smallest
                if (data[j] < data[min]) {
                    min = j;
                }
            }
            //swap data[min] with data[i]
            helperClass.swap(i, min, data);
        }
    }

    /**
     * Sort data Precondition: data.length > 0 Postcondition: data is sorted in
     * descending order
     *
     * @param data the array to be sorted
     */
    public static void selectionSortDescending(int[] data) {
        //start with the first element of array
        int max = 0;
        //max always equals the first index of unsorted part
        for (int i = 0; i < data.length; i++) {
            max = i;
            //find the biggest
            for (int j = i; j < data.length; j++) {
                if (data[j] > data[max]) {
                    max = j;
                }
            }
            //swap data[max] with data[i]
            helperClass.swap(i, max, data);
        }
    }

    /**
     * Sort data Precondition: data.length > 0 Postcondition: data is sorted in
     * ascending order
     *
     * @param data the array to be sorted
     */
    public static void selectionSortAscending(double[] data) {
        //start with the first element of array
        int min = 0;

        for (int i = 0; i < data.length; i++) {
            //min always equals the first index of unsorted part
            min = i;
            for (int j = i; j < data.length; j++) {
                //find the smallest
                if (data[j] < data[min]) {
                    min = j;
                }
            }
            //swap data[min] with data[i]
            helperClass.swap(i, min, data);
        }
    }

    /**
     * Sort data Precondition: data.length > 0 Postcondition: data is sorted in
     * descending order
     *
     * @param data the array to be sorted
     */
    public static void selectionSortDescending(double[] data) {
        //start with the first element of array
        int max = 0;
        //max always equals the first index of unsorted part
        for (int i = 0; i < data.length; i++) {
            max = i;
            //find the biggest
            for (int j = i; j < data.length; j++) {
                if (data[j] > data[max]) {
                    max = j;
                }
            }
            //swap data[max] with data[i]
            helperClass.swap(i, max, data);
        }
    }

    /**
     * Sort data Precondition: data.length > 0 Postcondition: data is sorted in
     * ascending order
     *
     * @param data the array to be sorted
     */
    public static void selectionSortAscending(String[] data) {
        //start with the first element of array
        int min = 0;
        //min always equals the first index of unsorted part
        for (int i = 0; i < data.length; i++) {
            min = i;
            for (int j = i; j < data.length; j++) {
                //find the smallest
                if ((data[j].compareTo(data[min])) < 0) {
                    min = j;
                }
            }
            //swap data[min] with data[i]
            helperClass.swap(i, min, data);
        }
    }

    /**
     * Sort data Precondition: data.length > 0 Postcondition: data is sorted in
     * descending order
     *
     * @param data the array to be sorted
     */
    public static void selectionSortDescending(String[] data) {
        //start with the first element of array
        int max = 0;

        for (int i = 0; i < data.length; i++) {
            //max always equals the first index of unsorted part
            max = i;
            //find the biggest
            for (int j = i; j < data.length; j++) {
                if ((data[j].compareTo(data[max])) > 0) {
                    max = j;
                }
            }
            //swap data[max] with data[i]
            helperClass.swap(i, max, data);
        }
    }

    /**
     * Search searchValue in data and return the index
     *
     * @param data the array
     * @param searchValue the value to be find
     * @return the index of searchValue, return -1 if data is empty or
     * searchValue is not in data
     */
    public static int linearSearch(int[] data, int searchValue) {
        //if the array is empty, return -1
        if (data.length == 0) {
            return -1;
        }
        //start  position with -1
        int position = -1;
        //find the position of searchValue
        for (int i = 0; i < data.length; i++) {
            if (data[i] == searchValue) {
                position = i;
            }
        }
        return position;
    }

    /**
     * Search searchValue in data and return the index Precondition: data.length
     * > 0
     *
     * @param data the array
     * @param searchValue the value to be find
     * @return the index of searchValue, return -1 if data is empty or
     * searchValue is not in data
     */
    public static int linearSearch(double[] data, double searchValue) {
        //if the array is empty, return -1
        if (data.length == 0) {
            return -1;
        }
        //start  position with -1
        int position = -1;
        //find the position of searchValue
        for (int i = 0; i < data.length; i++) {
            if (data[i] == searchValue) {
                position = i;
            }
        }
        return position;
    }

    /**
     * Search searchValue in data and return the index Precondition: data.length
     * > 0
     *
     * @param data the array
     * @param searchValue the value to be find
     * @return the index of searchValue, return -1 if data is empty or
     * searchValue is not in data
     */
    public static int linearSearch(String[] data, String searchValue) {
        //if the array is empty, return -1
        if (data.length == 0) {
            return -1;
        }
        //start  position with -1
        int position = -1;
        //find the position of searchValue
        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(searchValue)) {
                position = i;
            }
        }
        return position;
    }

    /**
     * Search searchValue in data and return the index Precondition: -
     * data.length > 0 - data is sorted in whether ascending or descending order
     *
     * @param data the array
     * @param searchValue the value to be find
     * @return the index of searchValue, return -1 if data is empty or
     * searchValue is not in data
     */
    public static int binarySearch(int[] data, int searchValue) {
        //if the array is empty, return -1
        if (data.length == 0) {
            return -1;
        }
        //the start, mid and end point
        int start = 0;
        int end = data.length - 1;
        int mid = (start + end) / 2;
        //check if the array is in ascending order
        if (helperClass.isAscending(data)) {

            while (start <= end) {
                //change to the current mid point
                mid = (start + end) / 2;
                //if find the value, return the position
                if (searchValue == data[mid]) {
                    return mid;
                } else if (searchValue < data[mid]) {
                    //if the searchvalue is on the left of mid, end change to mid - 1
                    end = mid - 1;
                } else {
                    //if the searchvalue is on the right of mid, start change to mid + 1
                    start = mid + 1;
                }
            }

        } //check if the array is in descending order
        else if (helperClass.isDescending(data)) {

            while (start <= end) {
                mid = (start + end) / 2;
                if (searchValue == data[mid]) {
                    return mid;
                } else if (searchValue > data[mid]) {
                    //if the searchvalue is on the left of mid, end change to mid - 1
                    end = mid - 1;
                } else {
                    //if the searchvalue is on the right of mid, start change to mid + 1
                    start = mid + 1;
                }
            }
        }
        //if the array is not sorted or the searchvalue is not in array, return -1
        return -1;
    }

    /**
     * Search searchValue in data and return the index Precondition: -
     * data.length > 0 - data is sorted in whether ascending or descending order
     *
     * @param data the array
     * @param searchValue the value to be find
     * @return the index of searchValue, return -1 if data is empty or
     * searchValue is not in data
     */
    public static int binarySearch(double[] data, double searchValue) {
        //if the array is empty, return -1
        if (data.length == 0) {
            return -1;
        }
        //the start, mid and end point
        int start = 0;
        int end = data.length - 1;
        int mid = (start + end) / 2;
        //check if the array is in ascending order
        if (helperClass.isAscending(data)) {

            while (start <= end) {
                //change to the current mid point
                mid = (start + end) / 2;
                //if find the value, return the position
                if (searchValue == data[mid]) {
                    return mid;
                } else if (searchValue < data[mid]) {
                    //if the searchvalue is on the left of mid, end change to mid - 1
                    end = mid - 1;
                } else {
                    //if the searchvalue is on the right of mid, start change to mid + 1
                    start = mid + 1;
                }
            }
            //check if the array is in descending order
        } else if (helperClass.isDescending(data)) {

            while (start <= end) {
                //change to the current mid point
                mid = (start + end) / 2;
                //if find the value, return the position
                if (searchValue == data[mid]) {
                    return mid;
                } else if (searchValue > data[mid]) {
                    //if the searchvalue is on the left of mid, end change to mid - 1
                    end = mid - 1;
                } else {
                    //if the searchvalue is on the right of mid, start change to mid + 1
                    start = mid + 1;
                }
            }
        }
        //if the array is not sorted or the searchvalue is not in array, return -1
        return -1;
    }

    /**
     * Search searchValue in data and return the index Precondition: -
     * data.length > 0 - data is sorted in whether ascending or descending order
     *
     * @param data the array
     * @param searchValue the value to be find
     * @return the index of searchValue, return -1 if data is empty or
     * searchValue is not in data
     */
    public static int binarySearch(String[] data, String searchValue) {
        //if the array is empty, return -1
        if (data.length == 0) {
            return -1;
        }
        //the start, mid and end point
        int start = 0;
        int end = data.length - 1;
        int mid = (start + end) / 2;
        //check if the array is in ascending order
        if (helperClass.isAscending(data)) {
            while (start <= end) {
                //change to the current mid point
                mid = (start + end) / 2;
                //if find the value, return the position
                if (searchValue.compareTo(data[mid]) == 0) {
                    return mid;
                } else if (searchValue.compareTo(data[mid]) < 0) {
                    //if the searchvalue is on the left of mid, end change to mid - 1
                    end = mid - 1;
                } else {
                    //if the searchvalue is on the right of mid, start change to mid + 1
                    start = mid + 1;
                }
            }
            //check if the array is in descending order
        } else if (helperClass.isDescending(data)) {
            while (start <= end) {
                //change to the current mid point
                mid = (start + end) / 2;
                //if find the value, return the position
                if (searchValue.compareTo(data[mid]) == 0) {
                    return mid;
                } else if (searchValue.compareTo(data[mid]) > 0) {
                    //if the searchvalue is on the left of mid, end change to mid - 1
                    end = mid - 1;
                } else {
                    //if the searchvalue is on the right of mid, start change to mid + 1
                    start = mid + 1;
                }
            }
        }
        //if the array is not sorted or the searchvalue is not in array, return -1
        return -1;
    }

}

class helperClass {

    /**
     * Generate a random array with n elements
     *
     * @param n the number of elements
     * @return the random array
     */
    public static int[] generateRandomIntArray(int n) {

        int[] array = new int[n];
        int positiveOrNegative;
        for (int i = 0; i < n; i++) {
            positiveOrNegative = (int) (Math.random() * 2);
            if (positiveOrNegative == 0) {
                array[i] = (int) (Math.random() * Integer.MAX_VALUE);
            } else {
                array[i] = (int) (Math.random() * Integer.MIN_VALUE);
            }
        }
        return array;
    }

    /**
     * Generate a random array with n elements
     *
     * @param n the number of elements
     * @return the random array
     */
    public static double[] generateRandomDoubleArray(int n) {

        double[] array = new double[n];
        int positiveOrNegative;
        for (int i = 0; i < n; i++) {
            positiveOrNegative = (int) (Math.random() * 2);
            if (positiveOrNegative == 0) {
                array[i] = (Math.random() * Integer.MAX_VALUE);
            } else {
                array[i] = (Math.random() * Integer.MIN_VALUE);
            }
        }
        return array;
    }

    /**
     * Generate a random array with n elements and has a length of slength
     *
     * @param n the number of elements
     * @param slenght the length of each String
     * @return the random array
     */
    public static String[] generateRandomStringArray(int n, int slength) {

        String array[] = new String[n];
        String s;
        char c;
        for (int i = 0; i < n; i++) {
            s = "";
            for (int j = 0; j < slength; j++) {
                c = (char) ((int) (Math.random() * 26 + 65));
                s += String.valueOf(c);
            }
            array[i] = s;
        }
        return array;
    }

    /**
     * Swap arr[a] and arr[b]
     *
     * @param a the index of first element
     * @param b the index of second element
     * @param arr the array
     */
    public static void swap(int a, int b, int[] arr) {

        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    /**
     * Swap arr[a] and arr[b]
     *
     * @param a the index of first element
     * @param b the index of second element
     * @param arr the array
     */
    public static void swap(int a, int b, double[] arr) {

        double temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    /**
     * Swap arr[a] and arr[b]
     *
     * @param a the index of first element
     * @param b the index of second element
     * @param arr the array
     */
    public static void swap(int a, int b, String[] arr) {

        String temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    /**
     * Check if the array is in ascending order
     *
     * @param data the array
     * @return true if the array is in ascending order, otherwise false
     */
    public static boolean isAscending(int[] data) {

        boolean check = true;

        for (int i = 0; i < data.length - 1; i++) {
            if (data[i] > data[i + 1]) {
                check = false;
            }
        }
        return check;
    }

    /**
     * Check if the array is in descending order
     *
     * @param data the array
     * @return true if the array is in descending order, otherwise false
     */
    public static boolean isDescending(int[] data) {

        boolean check = true;

        for (int i = 0; i < data.length - 1; i++) {
            if (data[i] < data[i + 1]) {
                check = false;
            }
        }
        return check;
    }

    /**
     * Check if the array is in ascending order
     *
     * @param data the array
     * @return true if the array is in ascending order, otherwise false
     */
    public static boolean isAscending(double[] data) {

        boolean check = true;

        for (int i = 0; i < data.length - 1; i++) {
            if (data[i] > data[i + 1]) {
                check = false;
            }
        }
        return check;
    }

    /**
     * Check if the array is in descending order
     *
     * @param data the array
     * @return true if the array is in descending order, otherwise false
     */
    public static boolean isDescending(double[] data) {

        boolean check = true;

        for (int i = 0; i < data.length - 1; i++) {
            if (data[i] < data[i + 1]) {
                check = false;
            }
        }
        return check;
    }

    /**
     * Check if the array is in ascending order
     *
     * @param data the array
     * @return true if the array is in ascending order, otherwise false
     */
    public static boolean isAscending(String[] data) {

        boolean check = true;

        for (int i = 0; i < data.length - 1; i++) {
            if (data[i].compareTo(data[i + 1]) > 0) {
                check = false;
            }
        }
        return check;
    }

    /**
     * Check if the array is in descending order
     *
     * @param data the array
     * @return true if the array is in descending order, otherwise false
     */
    public static boolean isDescending(String[] data) {

        boolean check = true;

        for (int i = 0; i < data.length - 1; i++) {
            if (data[i].compareTo(data[i + 1]) < 0) {
                check = false;
            }
        }
        return check;
    }

    /**
     * Generate a String of every element in array
     *
     * @param arr the array
     * @return a String of every element in arr
     */
    public static String toString(int[] arr) {
        String s = "";
        for (int i = 0; i < arr.length; i++) {
            s += String.valueOf(arr[i]) + " ";
        }
        return s;
    }

    /**
     * Generate a String of every element in array
     *
     * @param arr the array
     * @return a String of every element in arr
     */
    public static String toString(String[] arr) {
        String s = "";
        for (int i = 0; i < arr.length; i++) {
            s += arr[i] + " ";
        }
        return s;
    }

    /**
     * Generate a String of every element in array
     *
     * @param arr the array
     * @return a String of every element in arr
     */
    public static String toString(double[] arr) {
        String s = "";
        for (int i = 0; i < arr.length; i++) {
            s += String.valueOf(arr[i]) + " ";
        }
        return s;
    }
}

public class ArrayUtilTester {

    public static void main(String args[]) {
        //Exception object
        AssertionError ae = null;
        //three test array
        int[] testInt = new int[100];
        double[] testDouble = new double[100];
        String[] testString = new String[100];

        System.out.println("-------------------------------");
        System.out.println("TEST CASE #1A      : max(int)");
        System.out.println("PRE CONDITION      : value of elements in array between 1 to 100, one 101, 100 numbers");
        System.out.println("POST CONDITION     : array unchange, 101 is returned");
        //generate 99 element 1 to 100
        for (int i = 0; i < 99; i++) {
            testInt[i] = (int) (Math.random() * 100 + 1);
        }
        //the last one is 101
        testInt[testInt.length - 1] = 101;
        System.out.println("DATA RETURNED:     : " + ArrayUtil.max(testInt));
        //test if the max return 101
        try {
            assert (ArrayUtil.max(testInt) == 101);
        } catch (AssertionError e) {
            System.out.println("TEST CASE #1A RESULTS - didn't pass");
            ae = e;
        }
        //if there is no exception, print pass message
        if (ae == null) {
            System.out.println("TEST CASE #1A RESULTS - pass");
        }

        System.out.println("-------------------------------");
        //set ae to null
        ae = null;

        System.out.println("TEST CASE #1B      : max(double)");
        System.out.println("PRE CONDITION      : value of elements in array between 1 to 100, one 101.234, 100 numbers");
        System.out.println("POST CONDITION     : array unchange, 101.234 is returned");
        //generate 99 element 1 to 100
        for (int i = 0; i < 99; i++) {
            testDouble[i] = (Math.random() * 100 + 1);
        }
        //the last one is 101.234
        testDouble[testDouble.length - 1] = 101.234;
        System.out.println("DATA RETURNED:     : " + ArrayUtil.max(testDouble));
        //test if the max return 101.234
        try {
            assert (ArrayUtil.max(testDouble) == 101.234);
        } catch (AssertionError e) {
            System.out.println("TEST CASE #1B RESULTS - didn't pass");
            ae = e;
        }
        //if there is no exception, print pass message
        if (ae == null) {
            System.out.println("TEST CASE #1B RESULTS - pass");
        }

        System.out.println("-------------------------------");
        //set ae to null
        ae = null;

        System.out.println("TEST CASE #2A      : min(int)");
        System.out.println("PRE CONDITION      : value of elements in array between 1 to 100, one -1, 100 numbers");
        System.out.println("POST CONDITION     : array unchange, -1 is returned");
        //generate 99 element 1 to 100
        for (int i = 0; i < 99; i++) {
            testInt[i] = (int) (Math.random() * 100 + 1);
        }
        //the last one is -1
        testInt[testInt.length - 1] = -1;
        System.out.println("DATA RETURNED:     : " + ArrayUtil.min(testInt));
        //test if the max return -1
        try {
            assert (ArrayUtil.min(testInt) == -1);
        } catch (AssertionError e) {
            System.out.println("TEST CASE #2A RESULTS - didn't pass");
            ae = e;
        }
        //if there is no exception, print pass message
        if (ae == null) {
            System.out.println("TEST CASE #2A RESULTS - pass");
        }

        System.out.println("-------------------------------");
        //set ae to null
        ae = null;

        System.out.println("TEST CASE #2B      : min(double)");
        System.out.println("PRE CONDITION      : value of elements in array between 1 to 100, one -1.234, 100 numbers");
        System.out.println("POST CONDITION     : array unchange, -1.234 is returned");
        //generate 99 element 1 to 100
        for (int i = 0; i < 99; i++) {
            testDouble[i] = (Math.random() * 100 + 1);
        }
        //the last one is -1.234
        testDouble[testDouble.length - 1] = -1.234;

        System.out.println("DATA RETURNED:     : " + ArrayUtil.min(testDouble));
        //test if the max return -1.234
        try {
            assert (ArrayUtil.min(testDouble) == -1.234);
        } catch (AssertionError e) {
            System.out.println("TEST CASE #2B RESULTS - didn't pass");
            ae = e;
        }
        //if there is no exception, print pass message
        if (ae == null) {
            System.out.println("TEST CASE #2B RESULTS - pass");
        }

        System.out.println("-------------------------------");
        //set ae to null
        ae = null;

        System.out.println("TEST CASE #3A      : sum(int)");
        System.out.println("PRE CONDITION      : value of elements in array starts with start and add add each time");
        System.out.println("POST CONDITION     : array unchange,  start * 100 + add * 4950 is returned");
        //random start and add
        int start = (int) (Math.random() * 10);
        int add = (int) (Math.random() * 10);
        int temp = start;
        //generate a arithmetic progression
        for (int i = 0; i < testInt.length; i++) {
            testInt[i] = temp;
            temp += add;
        }
        //display array
        System.out.print("DISPLAY ARRAY      : ");
        System.out.println(helperClass.toString(testInt));

        System.out.println("DATA RETURNED:     : " + ArrayUtil.sum(testInt));
        //test if the sum is right
        try {
            assert (ArrayUtil.sum(testInt) == (100 * start + 4950 * add));
        } catch (AssertionError e) {
            System.out.println("TEST CASE #3A RESULTS - didn't pass");
            ae = e;
        }
        //if there is no exception, print pass message
        if (ae == null) {
            System.out.println("TEST CASE #3A RESULTS - pass");
        }

        System.out.println("-------------------------------");
        //set ae to null
        ae = null;

        System.out.println("TEST CASE #3B      : sum(double)");
        System.out.println("PRE CONDITION      : value of elements in array starts with start and add add each time");
        System.out.println("POST CONDITION     : array unchange,  start * 100 + add * 4950 is returned");
        //random start and add
        BigDecimal start2 = new BigDecimal(Double.toString(Math.random() * 10));
        BigDecimal add2 = new BigDecimal(Double.toString(Math.random() * 10));
        BigDecimal temp2 = start2;
        //generate a arithmetic progression
        for (int i = 0; i < testDouble.length; i++) {
            testDouble[i] = temp2.doubleValue();
            temp2 = temp2.add(add2);
        }
        //calculate the sum
        BigDecimal starts = new BigDecimal(Double.toString(start2.multiply(new BigDecimal(Double.toString(100.0))).doubleValue()));
        BigDecimal adds = new BigDecimal(Double.toString(add2.multiply(new BigDecimal(Double.toString(4950.0))).doubleValue()));
        BigDecimal sum = starts.add(adds);
        sum = sum.setScale(9, BigDecimal.ROUND_DOWN);
        //display array
        System.out.print("DISPLAY ARRAY      : ");
        System.out.println(helperClass.toString(testDouble));
        BigDecimal result = new BigDecimal(ArrayUtil.sum(testDouble));
        result = result.setScale(9, BigDecimal.ROUND_DOWN);
        System.out.println("DATA RETURNED:     : " + ArrayUtil.sum(testDouble));
        //test if the sum is right
        try {
            assert (result.equals(sum));
        } catch (AssertionError e) {
            System.out.println("TEST CASE #3B RESULTS - didn't pass");
            ae = e;
        }
        //if there is no exception, print pass message
        if (ae == null) {
            System.out.println("TEST CASE #3B RESULTS - pass");
        }

        System.out.println("-------------------------------");
        //set ae to null
        ae = null;

        System.out.println("TEST CASE #4A      : average(int)");
        System.out.println("PRE CONDITION      : value of elements in array starts with start and add add each time");
        System.out.println("POST CONDITION     : array unchange,  (start + start + add * 99)/2 is returned");
        //random start and add
        start = (int) (Math.random() * 10);
        add = (int) (Math.random() * 10);
        temp = start;
        //generate a arithmetic progression
        for (int i = 0; i < testInt.length; i++) {
            testInt[i] = temp;
            temp += add;
        }
        //disyplay array
        System.out.print("DISPLAY ARRAY      : ");
        System.out.println(helperClass.toString(testInt));

        System.out.println("DATA RETURNED:     : " + ArrayUtil.average(testInt));
        //calculate the average
        result = new BigDecimal(ArrayUtil.average(testInt));
        BigDecimal answer = new BigDecimal((start + start + add * 99) / 2.0);
        //test if the average is right
        try {
            assert (result.equals(answer));
        } catch (AssertionError e) {
            System.out.println("TEST CASE #4A RESULTS - didn't pass");
            ae = e;
        }
        //if there is no exception, print pass message
        if (ae == null) {
            System.out.println("TEST CASE #4A RESULTS - pass");
        }

        System.out.println("-------------------------------");
        //set ae to null
        ae = null;

        System.out.println("TEST CASE #4B      : average(double)");
        System.out.println("PRE CONDITION      : value of elements in array starts with start and add add each time");
        System.out.println("POST CONDITION     : array unchange,  start + start + add * 99)/2 is returned");
        //random start and add
        start2 = new BigDecimal(Double.toString(Math.random() * 10));
        add2 = new BigDecimal(Double.toString(Math.random() * 10));
        temp2 = start2;
        //generate a arithmetic progression
        for (int i = 0; i < testDouble.length; i++) {
            testDouble[i] = temp2.doubleValue();
            temp2 = temp2.add(add2);
        }
        //calculate the average
        start2 = start2.add(start2);
        add2 = add2.multiply(new BigDecimal(99));
        start2 = start2.add(add2);
        start2 = start2.divide(new BigDecimal(2));
        BigDecimal average = new BigDecimal(start2.doubleValue());
        average = average.setScale(9, BigDecimal.ROUND_DOWN);
        //display array
        System.out.print("DISPLAY ARRAY      : ");
        System.out.println(helperClass.toString(testDouble));

        result = new BigDecimal(ArrayUtil.average(testDouble));
        result = result.setScale(9, BigDecimal.ROUND_DOWN);
        System.out.println("DATA RETURNED:     : " + ArrayUtil.average(testDouble));
        //test if the average is right
        try {
            assert (result.equals(average));
        } catch (AssertionError e) {
            System.out.println("TEST CASE #4B RESULTS - didn't pass");
            ae = e;
        }
        //if there is no exception, print pass message
        if (ae == null) {
            System.out.println("TEST CASE #4B RESULTS - pass");
        }

        System.out.println("-------------------------------");
        //set ae to null
        ae = null;

        System.out.println("TEST CASE #5A      : bubbleSortAscending(int)");
        System.out.println("PRE CONDITION      : unsorted array, with 100 elements");
        System.out.println("POST CONDITION     : array sorted, lowest to highest");
        //generate random array
        testInt = helperClass.generateRandomIntArray(100);
        //display array
        System.out.print("ARRAY BEFORE       : ");
        System.out.println(helperClass.toString(testInt));
        //sort array
        ArrayUtil.bubbleSortAscending(testInt);
        //display array
        System.out.print("ARRAY AFTER        : ");
        System.out.println(helperClass.toString(testInt));
        //test if the value at index i is lest than the value at index i+1
        try {
            for (int i = 0; i < testInt.length - 1; i++) {
                assert (testInt[i] < testInt[i + 1]);
            }
        } catch (AssertionError e) {
            System.out.println("TEST CASE #5A RESULTS - didn't pass");
            ae = e;
        }
        //if there is no exception, print pass message
        if (ae == null) {
            System.out.println("TEST CASE #5A RESULTS - pass");
        }

        System.out.println("-------------------------------");
        //set ae to null
        ae = null;

        System.out.println("TEST CASE #5B      : bubbleSortAscending(double)");
        System.out.println("PRE CONDITION      : unsorted array, with 100 elements");
        System.out.println("POST CONDITION     : array sorted, lowest to highest");
        //generate random array
        testDouble = helperClass.generateRandomDoubleArray(100);
        //display array
        System.out.print("ARRAY BEFORE       : ");
        System.out.println(helperClass.toString(testDouble));
        //sort array
        ArrayUtil.bubbleSortAscending(testDouble);
        //display array
        System.out.print("ARRAY AFTER        : ");
        System.out.println(helperClass.toString(testDouble));
        //test if the value at index i is lest than the value at index i+1
        try {
            for (int i = 0; i < testDouble.length - 1; i++) {
                assert (testDouble[i] < testDouble[i + 1]);
            }
        } catch (AssertionError e) {
            System.out.println("TEST CASE #5B RESULTS - didn't pass");
            ae = e;
        }
        //if there is no exception, print pass message
        if (ae == null) {
            System.out.println("TEST CASE #5B RESULTS - pass");
        }

        System.out.println("-------------------------------");
        //set ae to null
        ae = null;

        System.out.println("TEST CASE #5C      : bubbleSortAscending(String)");
        System.out.println("PRE CONDITION      : unsorted array, with 100 elements, length 5");
        System.out.println("POST CONDITION     : array sorted, lowest to highest");
        //generate random array
        testString = helperClass.generateRandomStringArray(100, 5);
        //display array
        System.out.print("ARRAY BEFORE       : ");
        System.out.println(helperClass.toString(testString));
        //sort array
        ArrayUtil.bubbleSortAscending(testString);
        //display array
        System.out.print("ARRAY AFTER        : ");
        System.out.println(helperClass.toString(testString));
        //test if the value at index i is lest than the value at index i+1
        try {
            for (int i = 0; i < testString.length - 1; i++) {
                assert (testString[i].compareTo(testString[i + 1]) < 0);
            }
        } catch (AssertionError e) {
            System.out.println("TEST CASE #5C RESULTS - didn't pass");
            ae = e;
        }
        //if there is no exception, print pass message
        if (ae == null) {
            System.out.println("TEST CASE #5C RESULTS - pass");
        }

        System.out.println("-------------------------------");
        //set ae to null
        ae = null;

        System.out.println("TEST CASE #6A      : bubbleSortDescending(int)");
        System.out.println("PRE CONDITION      : unsorted array, with 100 elements");
        System.out.println("POST CONDITION     : array sorted, highest to lowest");
        //generate random array
        testInt = helperClass.generateRandomIntArray(100);
        //display array
        System.out.print("ARRAY BEFORE       : ");
        System.out.println(helperClass.toString(testInt));
        //sort array
        ArrayUtil.bubbleSortDescending(testInt);
        //display array
        System.out.print("ARRAY AFTER        : ");
        System.out.println(helperClass.toString(testInt));
        //test if the value at index i is bigger than the value at index i+1
        try {
            for (int i = 0; i < testInt.length - 1; i++) {
                assert (testInt[i] > testInt[i + 1]);
            }
        } catch (AssertionError e) {
            System.out.println("TEST CASE #6A RESULTS - didn't pass");
            ae = e;
        }
        //if there is no exception, print pass message
        if (ae == null) {
            System.out.println("TEST CASE #6A RESULTS - pass");
        }

        System.out.println("-------------------------------");
        //set ae to null
        ae = null;

        System.out.println("TEST CASE #6B      : bubbleSortDescending(double)");
        System.out.println("PRE CONDITION      : unsorted array, with 100 elements");
        System.out.println("POST CONDITION     : array sorted, highest to lowest");
        //generate random array
        testDouble = helperClass.generateRandomDoubleArray(100);
        //display array
        System.out.print("ARRAY BEFORE       : ");
        System.out.println(helperClass.toString(testDouble));
        //sort array
        ArrayUtil.bubbleSortDescending(testDouble);
        //display array
        System.out.print("ARRAY AFTER        : ");
        System.out.println(helperClass.toString(testDouble));
        //test if the value at index i is bigger than the value at index i+1
        try {
            for (int i = 0; i < testDouble.length - 1; i++) {
                assert (testDouble[i] > testDouble[i + 1]);
            }
        } catch (AssertionError e) {
            System.out.println("TEST CASE #6B RESULTS - didn't pass");
            ae = e;
        }
        //if there is no exception, print pass message
        if (ae == null) {
            System.out.println("TEST CASE #6B RESULTS - pass");
        }

        System.out.println("-------------------------------");
        //set ae to null
        ae = null;

        System.out.println("TEST CASE #6C      : bubbleSortDescending(String)");
        System.out.println("PRE CONDITION      : unsorted array, with 100 elements, length 5");
        System.out.println("POST CONDITION     : array sorted, highest to lowest");
        //generate random array
        testString = helperClass.generateRandomStringArray(100, 5);
        //display array
        System.out.print("ARRAY BEFORE       : ");
        System.out.println(helperClass.toString(testString));
        //sort array
        ArrayUtil.bubbleSortDescending(testString);
        //display array
        System.out.print("ARRAY AFTER        : ");
        System.out.println(helperClass.toString(testString));
        //test if the value at index i is bigger than the value at index i+1
        try {
            for (int i = 0; i < testString.length - 1; i++) {
                assert (testString[i].compareTo(testString[i + 1]) > 0);
            }
        } catch (AssertionError e) {
            System.out.println("TEST CASE #6C RESULTS - didn't pass");
            ae = e;
        }
        //if there is no exception, print pass message
        if (ae == null) {
            System.out.println("TEST CASE #6C RESULTS - pass");
        }

        System.out.println("-------------------------------");
        //set ae to null
        ae = null;

        System.out.println("TEST CASE #7A      : selectionSortAscending(int)");
        System.out.println("PRE CONDITION      : unsorted array, with 100 elements");
        System.out.println("POST CONDITION     : array sorted, lowest to highest");
        //generate random array
        testInt = helperClass.generateRandomIntArray(100);
        //display array
        System.out.print("ARRAY BEFORE       : ");
        System.out.println(helperClass.toString(testInt));
        //sort array
        ArrayUtil.selectionSortAscending(testInt);
        //display array
        System.out.print("ARRAY AFTER        : ");
        System.out.println(helperClass.toString(testInt));
        //test if the value at index i is less than the value at index i+1
        try {
            for (int i = 0; i < testInt.length - 1; i++) {
                assert (testInt[i] < testInt[i + 1]);
            }
        } catch (AssertionError e) {
            System.out.println("TEST CASE #7A RESULTS - didn't pass");
            ae = e;
        }
        //if there is no exception, print pass message
        if (ae == null) {
            System.out.println("TEST CASE #7A RESULTS - pass");
        }

        System.out.println("-------------------------------");
        //set ae to null
        ae = null;

        System.out.println("TEST CASE #7B      : selectionSortAscending(double)");
        System.out.println("PRE CONDITION      : unsorted array, with 100 elements");
        System.out.println("POST CONDITION     : array sorted, lowest to highest");
        //generate random array
        testDouble = helperClass.generateRandomDoubleArray(100);
        //display array
        System.out.print("ARRAY BEFORE       : ");
        System.out.println(helperClass.toString(testDouble));
        //sort array
        ArrayUtil.selectionSortAscending(testDouble);
        //display array
        System.out.print("ARRAY AFTER        : ");
        System.out.println(helperClass.toString(testDouble));
        //test if the value at index i is less than the value at index i+1
        try {
            for (int i = 0; i < testDouble.length - 1; i++) {
                assert (testDouble[i] < testDouble[i + 1]);
            }
        } catch (AssertionError e) {
            System.out.println("TEST CASE #7B RESULTS - didn't pass");
            ae = e;
        }
        //if there is no exception, print pass message
        if (ae == null) {
            System.out.println("TEST CASE #7B RESULTS - pass");
        }

        System.out.println("-------------------------------");
        //set ae to null
        ae = null;

        System.out.println("TEST CASE #7C      : selectionSortAscending(String)");
        System.out.println("PRE CONDITION      : unsorted array, with 100 elements, length 5");
        System.out.println("POST CONDITION     : array sorted, lowest to highest");
        //generate random array
        testString = helperClass.generateRandomStringArray(100, 5);
        //display array
        System.out.print("ARRAY BEFORE       : ");
        System.out.println(helperClass.toString(testString));
        //display array
        ArrayUtil.selectionSortAscending(testString);
        //display array
        System.out.print("ARRAY AFTER        : ");
        System.out.println(helperClass.toString(testString));
        //test if the value at index i is less than the value at index i+1
        try {
            for (int i = 0; i < testString.length - 1; i++) {
                assert (testString[i].compareTo(testString[i + 1]) < 0);
            }
        } catch (AssertionError e) {
            System.out.println("TEST CASE #7C RESULTS - didn't pass");
            ae = e;
        }
        //if there is no exception, print pass message
        if (ae == null) {
            System.out.println("TEST CASE #7C RESULTS - pass");
        }

        System.out.println("-------------------------------");
        //set ae to null
        ae = null;

        System.out.println("TEST CASE #8A      : selectionSortDescending(int)");
        System.out.println("PRE CONDITION      : unsorted array, with 100 elements");
        System.out.println("POST CONDITION     : array sorted, highest to lowest");
        //generate random array
        testInt = helperClass.generateRandomIntArray(100);
        //display array
        System.out.print("ARRAY BEFORE       : ");
        System.out.println(helperClass.toString(testInt));
        //sort array
        ArrayUtil.selectionSortDescending(testInt);
        //display array
        System.out.print("ARRAY AFTER        : ");
        System.out.println(helperClass.toString(testInt));
        //test if the value at index i is bigger than the value at index i+1
        try {
            for (int i = 0; i < testInt.length - 1; i++) {
                assert (testInt[i] > testInt[i + 1]);
            }
        } catch (AssertionError e) {
            System.out.println("TEST CASE #8A RESULTS - didn't pass");
            ae = e;
        }
        //if there is no exception, print pass message
        if (ae == null) {
            System.out.println("TEST CASE #8A RESULTS - pass");
        }

        System.out.println("-------------------------------");
        //set ae to null
        ae = null;

        System.out.println("TEST CASE #8B      : selectionSortDescending(double)");
        System.out.println("PRE CONDITION      : unsorted array, with 100 elements");
        System.out.println("POST CONDITION     : array sorted, highest to lowest");
        //generate random array
        testDouble = helperClass.generateRandomDoubleArray(100);
        //display array
        System.out.print("ARRAY BEFORE       : ");
        System.out.println(helperClass.toString(testDouble));
        //sort array
        ArrayUtil.selectionSortDescending(testDouble);
        //sort array
        System.out.print("ARRAY AFTER        : ");
        System.out.println(helperClass.toString(testDouble));
        //test if the value at index i is bigger than the value at index i+1
        try {
            for (int i = 0; i < testDouble.length - 1; i++) {
                assert (testDouble[i] > testDouble[i + 1]);
            }
        } catch (AssertionError e) {
            System.out.println("TEST CASE #8B RESULTS - didn't pass");
            ae = e;
        }
        //if there is no exception, print pass message
        if (ae == null) {
            System.out.println("TEST CASE #8B RESULTS - pass");
        }

        System.out.println("-------------------------------");
        //set ae to null
        ae = null;

        System.out.println("TEST CASE #8C      : selectionSortDescending(String)");
        System.out.println("PRE CONDITION      : unsorted array, with 100 elements, length 5");
        System.out.println("POST CONDITION     : array sorted, highest to lowest");
        //generate random array
        testString = helperClass.generateRandomStringArray(100, 5);
        //display array
        System.out.print("ARRAY BEFORE       : ");
        System.out.println(helperClass.toString(testString));
        //sort array
        ArrayUtil.selectionSortDescending(testString);
        //display array
        System.out.print("ARRAY AFTER        : ");
        System.out.println(helperClass.toString(testString));
        //test if the value at index i is bigger than the value at index i+1
        try {
            for (int i = 0; i < testString.length - 1; i++) {
                assert (testString[i].compareTo(testString[i + 1]) > 0);
            }
        } catch (AssertionError e) {
            System.out.println("TEST CASE #8C RESULTS - didn't pass");
            ae = e;
        }
        //if there is no exception, print pass message
        if (ae == null) {
            System.out.println("TEST CASE #8C RESULTS - pass");
        }

        System.out.println("-------------------------------");
        //set ae to null
        ae = null;

        System.out.println("TEST CASE #9A      : linearSearch(int)");
        System.out.println("PRE CONDITION      : unsorted array, with 100 elements");
        System.out.println("POST CONDITION     : array unchanged, return the index of searching value");
        //generate random array
        testInt = helperClass.generateRandomIntArray(100);
        //display array
        System.out.print("DISPLAY ARRAY      : ");
        System.out.println(helperClass.toString(testInt));
        //randomly choose one element
        int random = (int) (Math.random() * 100);
        //search the element
        int index = ArrayUtil.linearSearch(testInt, testInt[random]);

        System.out.println("DATA RETURNED:     : " + index);
        //check if the index macth the result
        try {
            assert (index == random);
        } catch (AssertionError e) {
            System.out.println("TEST CASE #9A RESULTS - didn't pass");
            ae = e;
        }
        //if there is no exception, print pass message
        if (ae == null) {
            System.out.println("TEST CASE #9A RESULTS - pass");
        }

        System.out.println("-------------------------------");
        //set ae to null
        ae = null;

        System.out.println("TEST CASE #9B      : linearSearch(double)");
        System.out.println("PRE CONDITION      : unsorted array, with 100 elements");
        System.out.println("POST CONDITION     : array unchanged, return the index of searching value");
        //generate random array
        testDouble = helperClass.generateRandomDoubleArray(100);
        //display array
        System.out.print("DISPLAY ARRAY      : ");
        System.out.println(helperClass.toString(testDouble));
        //randomly choose one element
        random = (int) (Math.random() * 100);
        //search the element
        index = ArrayUtil.linearSearch(testDouble, testDouble[random]);

        System.out.println("DATA RETURNED:     : " + index);
        //check if the index macth the result
        try {
            assert (index == random);
        } catch (AssertionError e) {
            System.out.println("TEST CASE #9B RESULTS - didn't pass");
            ae = e;
        }
        //if there is no exception, print pass message
        if (ae == null) {
            System.out.println("TEST CASE #9B RESULTS - pass");
        }

        System.out.println("-------------------------------");
        //set ae to null
        ae = null;

        System.out.println("TEST CASE #9C      : linearSearch(String)");
        System.out.println("PRE CONDITION      : unsorted array, with 100 elements, 5 length each");
        System.out.println("POST CONDITION     : array unchanged, return the index of searching value");
        //generate random array
        testString = helperClass.generateRandomStringArray(100, 5);
        //display array
        System.out.print("DISPLAY ARRAY      : ");
        System.out.println(helperClass.toString(testString));
        //randomly choose one element
        random = (int) (Math.random() * 100);
        //search the element
        index = ArrayUtil.linearSearch(testString, testString[random]);

        System.out.println("DATA RETURNED:     : " + index);
        //check if the index macth the result
        try {
            assert (index == random);
        } catch (AssertionError e) {
            System.out.println("TEST CASE #9C RESULTS - didn't pass");
            ae = e;
        }
        //if there is no exception, print pass message
        if (ae == null) {
            System.out.println("TEST CASE #9C RESULTS - pass");
        }

        System.out.println("-------------------------------");
        //set ae to null
        ae = null;

        System.out.println("TEST CASE #10A     : binarySearch(int)");
        System.out.println("PRE CONDITION      : sorted array, with 100 elements");
        System.out.println("POST CONDITION     : array unchanged, return the index of searching value");
        //generate random array
        testInt = helperClass.generateRandomIntArray(100);
        //sort array
        ArrayUtil.selectionSortAscending(testInt);
        //display array
        System.out.print("DISPLAY ASCENDING ARRAY      : ");
        System.out.println(helperClass.toString(testInt));
        //randomly choose one element
        random = (int) (Math.random() * 100);
        //search the element
        index = ArrayUtil.binarySearch(testInt, testInt[random]);

        System.out.println("DATA RETURNED:     : " + index);
        //check if the index macth the result
        try {
            assert (index == random);
        } catch (AssertionError e) {
            System.out.println("TEST CASE #10A ASCENDING RESULTS - didn't pass");
            ae = e;
        }
        //if there is no exception, print pass message
        if (ae == null) {
            System.out.println("TEST CASE #10A ASCENDING RESULTS - pass");
        }
        //generate random array
        testInt = helperClass.generateRandomIntArray(100);
        //sort array
        ArrayUtil.selectionSortDescending(testInt);
        //display array
        System.out.print("DISPLAY DESCENDING ARRAY      : ");
        System.out.println(helperClass.toString(testInt));
        //randomly choose one element
        random = (int) (Math.random() * 100);
        //search the element
        index = ArrayUtil.binarySearch(testInt, testInt[random]);

        System.out.println("DATA RETURNED:     : " + index);
        //check if the index macth the result
        try {
            assert (index == random);
        } catch (AssertionError e) {
            System.out.println("TEST CASE #10A DESCENDING RESULTS - didn't pass");
            ae = e;
        }
        //if there is no exception, print pass message
        if (ae == null) {
            System.out.println("TEST CASE #10A DESCENDING RESULTS - pass");
        }

        System.out.println("-------------------------------");
        //set ae to null
        ae = null;

        System.out.println("TEST CASE #10B     : binarySearch(double)");
        System.out.println("PRE CONDITION      : sorted array, with 100 elements");
        System.out.println("POST CONDITION     : array unchanged, return the index of searching value");
        //generate random array
        testDouble = helperClass.generateRandomDoubleArray(100);
        //sort array
        ArrayUtil.selectionSortAscending(testDouble);
        //display array
        System.out.print("DISPLAY ASCENDING ARRAY      : ");
        System.out.println(helperClass.toString(testDouble));
        //randomly choose one element
        random = (int) (Math.random() * 100);
        //search the element
        index = ArrayUtil.binarySearch(testDouble, testDouble[random]);

        System.out.println("DATA RETURNED:     : " + index);
        //check if the index macth the result
        try {
            assert (index == random);
        } catch (AssertionError e) {
            System.out.println("TEST CASE #10B ASCENDING RESULTS - didn't pass");
            ae = e;
        }
        //if there is no exception, print pass message
        if (ae == null) {
            System.out.println("TEST CASE #10B ASCENDING RESULTS - pass");
        }
        //generate random array
        testDouble = helperClass.generateRandomDoubleArray(100);
        //sort array
        ArrayUtil.selectionSortDescending(testDouble);
        //display array
        System.out.print("DISPLAY DESCENDING ARRAY      : ");
        System.out.println(helperClass.toString(testDouble));
        //randomly choose one element
        random = (int) (Math.random() * 100);
        //search the element
        index = ArrayUtil.binarySearch(testDouble, testDouble[random]);

        System.out.println("DATA RETURNED:     : " + index);
        //check if the index macth the result
        try {
            assert (index == random);
        } catch (AssertionError e) {
            System.out.println("TEST CASE #10B DESCENDING RESULTS - didn't pass");
            ae = e;
        }
        //if there is no exception, print pass message
        if (ae == null) {
            System.out.println("TEST CASE #10B DESCENDING RESULTS - pass");
        }

        System.out.println("-------------------------------");
        //set ae to null
        ae = null;

        System.out.println("TEST CASE #10C     : binarySearch(String)");
        System.out.println("PRE CONDITION      : sorted array, with 100 elements, 5 length each");
        System.out.println("POST CONDITION     : array unchanged, return the index of searching value");
        //generate random array
        testString = helperClass.generateRandomStringArray(100, 5);
        //sort array
        ArrayUtil.selectionSortAscending(testString);
        //display array
        System.out.print("DISPLAY ASCENDING ARRAY      : ");
        System.out.println(helperClass.toString(testString));
        //randomly choose one element
        random = (int) (Math.random() * 100);
        //search the element
        index = ArrayUtil.binarySearch(testString, testString[random]);

        System.out.println("DATA RETURNED:     : " + index);
        //check if the index macth the result
        try {
            assert (index == random);
        } catch (AssertionError e) {
            System.out.println("TEST CASE #10C ASCENDING RESULTS - didn't pass");
            ae = e;
        }
        //if there is no exception, print pass message
        if (ae == null) {
            System.out.println("TEST CASE #10C ASCENDING RESULTS - pass");
        }
        //generate random array
        testString = helperClass.generateRandomStringArray(100, 5);
        //sort array
        ArrayUtil.selectionSortDescending(testString);
        //display array
        System.out.print("DISPLAY DESCENDING ARRAY      : ");
        System.out.println(helperClass.toString(testString));
        //randomly choose one element
        random = (int) (Math.random() * 100);
        //search the element
        index = ArrayUtil.binarySearch(testString, testString[random]);

        System.out.println("DATA RETURNED:     : " + index);
        //check if the index macth the result
        try {
            assert (index == random);
        } catch (AssertionError e) {
            System.out.println("TEST CASE #10C DESCENDING RESULTS - didn't pass");
            ae = e;
        }
        //if there is no exception, print pass message
        if (ae == null) {
            System.out.println("TEST CASE #10C DESCENDING RESULTS - pass");
        }

        System.out.println("-------------------------------");

        int data[] = new int[10];
        ArrayUtil.generateRandomArrayNoDuplicates(data, 0, 10);

        for (int i : data) {
            System.out.print(i + " ");
        }

    }

}
