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
public class BubbleSort {
    
    public static int[] randomArr(int i){
        
        int[] arr = new int[i];
        for(int c = 0; c < arr.length; c++){
            arr[c] = (int)(Math.random() * 10);
        }
        return arr;
    }
    
    public static void swap(int a, int b, int[] arr){
        
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    
    public static void bubbleSort(int[] arr){
        
        for(int i = arr.length - 1; i > 0; i--){
            for(int j = 0; j < i; j++){
                if(arr[j + 1]>arr[j])swap(j, j + 1, arr);
            }            
        }
    }
    
    public static void display(int[] arr){
        for(int i: arr){
            System.out.print(i + " ");
        }
    }
    
    public static void main(String args[]){
        
        int[] test = randomArr(10);
        display(test);
        System.out.println();
        bubbleSort(test);
        display(test);
    }
    
}
