package by.epam.nanos;

public class ArrayPrinter {
    public static void print(int[] array){
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }

    public static void print(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            ArrayPrinter.print(array[i]);
        }
    }
}
