package by.epam.nanos;

import java.util.Random;

public class Task1 {
    final int maxRandomValue = 100;
    final int N = 100;
    int[] A;
    int K;

    Task1(){
        System.out.println("Task 1");

        // Get random values
        Random rand = new Random();
        K = rand.nextInt(maxRandomValue);
        A = RandomArray.generateIntArray(N, maxRandomValue);

        // Print the values
        print();

        // Do the math
        calc();
    }

    private void print () {
        System.out.println("Value: " + K);
        System.out.print("Array: ");
        ArrayPrinter.print(A);
    }

    private void calc(){
        System.out.print("Divisible values: ");
        for (int i = 0; i < A.length; i++) {
            if (A[i]%K==0) {
                System.out.print(A[i] + ", ");
            }
        }
        System.out.println();
    }
}
