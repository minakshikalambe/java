package batch59;
import java.util.LinkedList;
import java.util.Scanner;

public class HighestLowest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            else if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Smallest value = " + min);
        System.out.println("Largest value = " + max);
        
        LinkedList<String> list = new LinkedList<>();

        // Add elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");

        // Get element at index 2
        String element = list.get(2); // index starts at 0
        System.out.println("Element at index 2: " + element);
    }
}
