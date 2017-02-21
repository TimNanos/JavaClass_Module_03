package by.epam.nanos;

import java.util.Random;

public class RandomArray {

    public static int[] generateIntArray(int size, int maxValue) {
        int[] result = new int[size];
        Random rand = new Random();
        for (int i = 0; i < result.length; i++) {
            result[i] = rand.nextInt(maxValue);
        }
        return result;
    }

    public static int[] generateIntArray(int size) {
        return generateIntArray(size, Integer.MAX_VALUE);
    }
}
