package by.epam.nanos;

public class Task6 {
    // Matrix size should be even!
    private final int matrixSize = 10;
    private int[][] intMatrix = new int[matrixSize][matrixSize];

    Task6(){
        System.out.println("Task 6");

        // Get the matrix
        for (int i = 0; i < matrixSize; i++){
            intMatrix[i] = getArray(matrixSize, i);
        }

        // Print the matrix
        ArrayPrinter.print(intMatrix);
    }

    private int[] getArray(int size, int currentLine) {
        int[] result = new int[size];
        result[0] = 1;
        for (int i = 1; i < result.length - 1; i++) {
            if (currentLine == 0 || currentLine == size - 1) {
                result[i] = 1;
            } else {
                result[i] = 0;
            }
        }
        result[result.length - 1] = 1;
        return result;
    }
}
