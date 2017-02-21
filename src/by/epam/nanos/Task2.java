package by.epam.nanos;

public class Task2 {
    private final int maxRandomValue = 100;
    private final int arraySize = 100;
    private int[] intArray;
    private int[] zeroPositionsArray;

    Task2 () {
        System.out.println("Task 2");

        // Get random values
        intArray = RandomArray.generateIntArray(arraySize, maxRandomValue);

        //  Initialize the new array
        zeroPositionsArray = new int[getZeroCount()];

        // Full the zero positions array
        fillZeroPositionsArray();

        // Print the values
        print();
    }

    // Count amount of zero values
    int getZeroCount(){
        int zeroCount = 0;

        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == 0) {
                zeroCount++;
            }
        }
        return zeroCount;
    }

    void fillZeroPositionsArray(){
        int zeroArrayPosition = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == 0) {
                zeroPositionsArray[zeroArrayPosition++] = i;
            }
        }
    }

    void print(){
        System.out.print("Array: ");
        ArrayPrinter.print(intArray);

        System.out.print("Zero values positions: ");
        ArrayPrinter.print(zeroPositionsArray);
    }
}
