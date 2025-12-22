package AssignmentOne;

import java.util.Scanner;

public class ArrayMenuProgram {

    static int arr[] = new int[50];
    static int size = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Insert Element");
            System.out.println("2. Delete Element");
            System.out.println("3. Linear Search");
            System.out.println("4. Binary Search");
            System.out.println("5. Find Maximum Value");
            System.out.println("6. Count Even and Odd");
            System.out.println("7. Insertion Sort");
            System.out.println("8. Display Array");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    insert();
                    break;
                case 2:
                    delete();
                    break;
                case 3:
                    linearSearch();
                    break;
                case 4:
                    binarySearch();
                    break;
                case 5:
                    findMax();
                    break;
                case 6:
                    countEvenOdd();
                    break;
                case 7:
                    insertionSort();
                    break;
                case 8:
                    display();
                    break;
                case 9:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 9);
    }

    // Insert element
    static void insert() {
        System.out.print("Enter element to insert: ");
        arr[size] = sc.nextInt();
        size++;
        System.out.println("Element inserted successfully.");
    }

    // Delete element
    static void delete() {
        System.out.print("Enter element to delete: ");
        int key = sc.nextInt();
        int i;

        for (i = 0; i < size; i++) {
            if (arr[i] == key) {
                break;
            }
        }

        if (i == size) {
            System.out.println("Element not found.");
        } else {
            for (int j = i; j < size - 1; j++) {
                arr[j] = arr[j + 1];
            }
            size--;
            System.out.println("Element deleted successfully.");
        }
    }

    // Linear Search
    static void linearSearch() {
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        for (int i = 0; i < size; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index " + i);
                return;
            }
        }
        System.out.println("Element not found.");
    }

    // Binary Search (Array must be sorted)
    static void binarySearch() {
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        int low = 0, high = size - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                System.out.println("Element found at index " + mid);
                return;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("Element not found.");
    }

    // Find maximum value
    static void findMax() {
        int max = arr[0];

        for (int i = 1; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum value: " + max);
    }

    // Count even and odd numbers
    static void countEvenOdd() {
        int even = 0, odd = 0;

        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println("Even count: " + even);
        System.out.println("Odd count: " + odd);
    }

    // Insertion Sort
    static void insertionSort() {
        for (int i = 1; i < size; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        System.out.println("Array sorted using Insertion Sort.");
    }

    // Display array
    static void display() {
        if (size == 0) {
            System.out.println("Array is empty.");
            return;
        }

        System.out.print("Array elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
