package ArrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class ProductOfArray {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++)
        {
            System.out.println("Enter the element for array");
            arr[i] = sc.nextInt();

        }

//        int[] newArr = productArr(arr);
//        System.out.println("Product of th array: "+ Arrays.toString(newArr));

    }

    public static void productArr(int[] arr)
    {


    }
}
