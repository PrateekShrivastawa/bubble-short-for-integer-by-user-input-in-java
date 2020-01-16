import java.util.Scanner;

public class bubblesortingint {
    public static void main(String[] args) {
        int temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");// it input the size of the array 
        int a = sc.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < arr.length; i++) // this loop is use for enter the element till the size of the array
        {
            System.out.println("Enter the " + (i + 1) + " element");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) // t
            {
                if (arr[j] > arr[j + 1]) // 
                {
                    temp = arr[j];// here we take a temp variable for swapping the values
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("The sorted array is given below");
        for (int i = 0; i < arr.length; i++) // This loop prints the sorted loop 
        {
            System.out.print(arr[i] + " ");// here print() function prints the sorted loop on the single line
        }

    }
}
