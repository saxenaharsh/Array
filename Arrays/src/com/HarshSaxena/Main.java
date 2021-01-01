package com.HarshSaxena;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] myIntArray = new int[25];//{14, 29, 14, 16, 12,13,14,179,159,29};
        //myIntArray[5] = 50;
        //myIntArray =
//        System.out.println(myIntArray[8]);
//        System.out.println(myIntArray[0]);
//        System.out.println(myIntArray[6]);
        for(int i = 0; i < myIntArray.length; i++){
            myIntArray[i] = i*10;
            //System.out.println("Element " + i + ", value is " + myIntArray[i]);
        }
        printArray(myIntArray);

    }
    public static void printArray(int[] array){
        for(int i = 0; i<array.length; i++){
            System.out.println("Element " + i + ", value is " + array[i]);

        }

    }
}
