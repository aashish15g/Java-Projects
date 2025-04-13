import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Ask the user for the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Step 2: Create the array
        int[] array = new int[size];

        // Step 3: Populate the array with user input
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Step 4: Ask the user for the element to search
        System.out.print("Enter the element to search: ");
        int target = scanner.nextInt();

        // Step 5: Perform linear search
        int position = linearSearch(array, target);

        // Step 6: Display the result
        if (position == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at position " + (position + 1) + ".");
        }

        scanner.close();
    }

    // Linear search method
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Return the index where the target is found
            }
        }
        return -1; // Return -1 if the target is not found
    }
}
