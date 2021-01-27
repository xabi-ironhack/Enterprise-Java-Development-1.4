package com.ironhack.lab_1_4;

public class Main {

    public static void main(String[] args) {

        int[] array = {6,9,6,3,2};
        int x = 3;
        int y = 5;

        System.out.println("---> Exercise 1 findDifferenceMaxMin ");
        System.out.println("The max difference between integers in the array is : " + findDifferenceMaxMin(array));

        System.out.println("---> Exercise 2 findTheSmallest");
        System.out.println("The smallest integers in the array are: " + findTheSmallest(array)[0]+ ", " +findTheSmallest(array)[1] );

        System.out.println("---> Exercise 3 Ecuation");
        System.out.println("The result for the equation when x = " + x + " and y = "+ y +" is " + equation(x, y ));

    }

    /*
    1. Write a Java program to get the difference between the largest and smallest values in an array of integers. The length of the array must be 1 and above.
     */
    public static int findDifferenceMaxMin(int[] intArray){

        int max = intArray[0];
        int min = intArray[0];

        if (intArray.length < 1){
            System.out.println("Array length must be 1 or above.");
        }

        for (int i = 0; i < intArray.length; i++){
            if (intArray[i] > max){
                max = intArray[i];
            }
            if (intArray[i] < min){
                min = intArray[i];
            }
        }
        return max - min;
    }

    /*
    2. Write a Java program to find smallest and second smallest elements of a given array and print it in the console.
    */
    public  static int[] findTheSmallest(int[] numbers){
        if (numbers.length < 2){System.out.println("Array length must be 2 or above."); }

        int tempVar;

        for (int i = 0; i < numbers.length; i++){
            for (int j = i+1; j < numbers.length; j++){
                if (numbers[i] > numbers[j]) {
                    tempVar = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = tempVar;
                }
            }
        }
        int[] result = {numbers[0],numbers[1]};
        return result;
    }

    /*
    3. Write a Java program who resolve this mathematical expression [expression](http://prntscr.com/vx1z35) where `x` and `y` are two variables presetted in your code.
    */
    public static double equation(int x, int y){
        double solution = Math.pow(x , 2) + Math.pow(((4 * y / 5 ) - x ), 2);
        return solution;

    }
}
