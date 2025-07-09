import java.util.Scanner;

public class addarray {
    static int[] element(int arr[], int newElem) {
        int arr2[] = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        arr2[arr.length] = newElem; 
        return arr2;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to be added:");
        int newElem = sc.nextInt();
        int[] newArr = element(arr, newElem);
        for (int e : newArr) {
            System.out.print(e + " ");
        }
        sc.close();
    }
}