package by.epam.nanos;

public class Task5 {
    // Matrix size should be even!
    private final int matrixSize = 10;
    private int[][] intMatrix = new int[matrixSize][matrixSize];

    Task5(){
        System.out.println("Task 5");

        // Get the matrix
        for (int i = 0; i < matrixSize; i++) {
            intMatrix[i] = getArray(matrixSize, isEven(i));
        }

        // Print the matrix
        System.out.println("Matrix:");
        ArrayPrinter.print(intMatrix);
    }

    private boolean isEven(int value){
        return value%2==0;
    }

    // Get single array
    private int[] getArray(int length, boolean reversed) {
        int[] result = new int[length];
        for (int i = 0; i< result.length; i++) {
            if (reversed) {
                result[i] = length - i;
            } else {
                result[i] = i + 1;
            }
        }
        return result;
    }
}
