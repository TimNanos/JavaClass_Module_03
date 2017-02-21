package by.epam.nanos;

public class Task3 {
    private final int maxRandomValue = 100;
    private final int arraySize = 10;
    private int[] intArray;

    Task3(){
        System.out.println("\nTask 3");

        // Get random values
        intArray = RandomArray.generateIntArray(arraySize, maxRandomValue);

        // Print the values
        print();
    }

    boolean isGrowing(){
        int previousValue = intArray[0];

        for (int i = 1; i < intArray.length; i++){
            if (intArray[i] <= previousValue) {
                return false;
            }
            previousValue = intArray[i];
        }
        return true;
    }

    private void print(){
        System.out.print("Array: ");
        ArrayPrinter.print(intArray);

        if (isGrowing())  {
            System.out.println("Array is growing.");
        } else {
            System.out.println("Array is not growing.");
        }
    }
}
