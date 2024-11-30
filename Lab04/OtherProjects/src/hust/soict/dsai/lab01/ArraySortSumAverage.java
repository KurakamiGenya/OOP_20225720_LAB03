package hust.soict.dsai.lab01;
import java.util.Arrays;
import java.util.Scanner;

public class ArraySortSumAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        double[] array = new double[n];

        // Input array elements
        System.out.println("Enter " + n + " numeric values:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextDouble();
        }

        // Sort the array
        Arrays.sort(array);

        // Calculate sum and average
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        double average = sum / n;

        // Display the sorted array, sum, and average
        System.out.println("Sorted Array: " + Arrays.toString(array));
        System.out.printf("Sum: %.2f%n", sum);
        System.out.printf("Average: %.2f%n", average);

        scanner.close();
    }

}
