package by.epam.nanos;

public class Task4 {
    private final int maxRandomValue = 100;
    private final int arraySize = 10;
    private int[] intArray;
    private int evenCount = 0;
    private int[] evenArray;

    Task4(){
        System.out.println("Task 4");

        // Get random values
        intArray = RandomArray.generateIntArray(arraySize, maxRandomValue);

        // Print the values
        System.out.print("Array: ");
        ArrayPrinter.print(intArray);

        // Count even values
        for (int i = 0; i < intArray.length; i++){
            if (isEven(intArray[i])) {
                evenCount++;
            }
        }

        if (evenCount == 0) {
            System.out.println("No even values.");
        } else {
            // Initialize even array
            evenArray = new int[evenCount];
            int evenArrayPosition = 0;

            // Put even values into array
            for (int i = 0; i < intArray.length; i++) {
                if (isEven(intArray[i])) {
                    evenArray[evenArrayPosition++] = intArray[i];
                }
            }
            System.out.print("Even values: ");
            ArrayPrinter.print(evenArray);
        }
    }

    private boolean isEven(int value){
        return value%2==0;
    }
}
