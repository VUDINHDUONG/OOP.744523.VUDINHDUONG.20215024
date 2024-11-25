
import java.util.Scanner;

public class Main {
    // Function for Quick Sort Algorithm

    // A utility function to swap two elements
    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // This function takes last element as pivot,
    // places the pivot element at its correct position
    // in sorted array, and places all smaller to left
    // of pivot and all greater elements to right of pivot
    static int partition(int[] arr, int low, int high)
    {
        // Choosing the pivot
        int pivot = arr[high];

        // Index of smaller element and indicates
        // the right position of pivot found so far
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {

            // If current element is smaller than the pivot
            if (arr[j] < pivot) {

                // Increment index of smaller element
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    // The main function that implements QuickSort
    // arr[] --> Array to be sorted,
    // low --> Starting index,
    // high --> Ending index
    static void quickSort(int[] arr, int low, int high)
    {
        if (low < high) {

            // pi is partitioning index, arr[p]
            // is now at right place
            int pi = partition(arr, low, high);

            // Separately sort elements before
            // partition and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static void main(String[] args) {

        // Read N from user
        System.out.print("Enter the number of elements in the array: ");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        // Declare an array of N elements
        int arr[] = new int[N];

        // Read N elements
        System.out.println("Nhap cac phan tu cua mang: ");
        for(int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        // Quick Sort Algorithm
        quickSort(arr, 0, N - 1);

        System.out.println("Array after sorting: ");
        for(int i=0; i< N; i++) {
            System.out.print(arr[i] + " ");
        }

        int sum = 0; // Sum of all elements
        System.out.println("Array after sorting: ");
        for(int i=0; i< N; i++) {
           sum += arr[i];
        }

        double avg = (double) sum / N;// average  of all elements

        System.out.println(">>> Sum: " + sum);
        System.out.println(">>> Avg: " + avg);

        scanner.close();
        System.exit(0);
    }
}


