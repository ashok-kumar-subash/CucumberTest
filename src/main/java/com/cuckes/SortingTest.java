package com.cuckes;

public class SortingTest {

    static void bubbleSort(int[] arr){
        int len = arr.length;
        System.out.println("length:"+len);
        for(int i=0; i<len; i++){
            for (int j=0; j<len; j++){
                if(arr[j]> arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }

    }

    public static void main(String[] args){
        int[] arrTest={4,5,3,-1};
        SortingTest.bubbleSort(arrTest);
        for (int number:arrTest) {
            System.out.println(number);



        }
    }

}
