package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array1_9063_ex1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] intArray = new int[5];

        for (int i = 0; i < intArray.length; i++) {
           intArray[i] += Integer.parseInt(bufferedReader.readLine());
        }

        for (int i : intArray) {
            System.out.print(i + " ");
        }

    }
}
