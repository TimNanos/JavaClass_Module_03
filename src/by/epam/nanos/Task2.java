package by.epam.nanos;

import java.util.Random;

public class Task2 {
    final int maxRandomValue = 100;
    final int arraySize = 100;
    int[] intArray = new int[arraySize];
    int[] zeroPositionsArray;

    Task2 () {
        System.out.println("Task 2");

        // Get random values
        Random rand = new Random();
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = rand.nextInt(maxRandomValue);
        }

        //  Initialize the new array
        zeroPositionsArray = new int[getZeroCount()];

        // Full the zero positions array
        fillZeroPositionsArray();

        // Print the values
        print();
    }

    // Count amount of zero values
    private int getZeroCount(){
        int zeroCount = 0;

        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == 0) {
                zeroCount++;
            }
        }
        return zeroCount;
    }

    private void fillZeroPositionsArray(){
        int zeroArrayPosition = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == 0) {
                zeroPositionsArray[zeroArrayPosition++] = i;
            }
        }
    }

    private void print(){
        System.out.print("Array: {");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + ", ");
        }
        System.out.println("}");

        System.out.print("Zero values positions: {");
        for (int i = 0; i < zeroPositionsArray.length; i++) {
            System.out.print(zeroPositionsArray[i] + ", ");
        }
        System.out.println("}");
    }

}
