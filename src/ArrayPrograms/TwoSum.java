package ArrayPrograms;

import java.util.Scanner;

public class TwoSum {

    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");

        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++)
        {
            System.out.println("Enter the Elements of the array");
            arr[i] = sc.nextInt();

        }

        System.out.println("Enter the target value");
        int target = sc.nextInt();

        twoSum(arr, target);

    }

    public static void twoSum(int[] arr, int target)
    {

        for (int i = 0; i < arr.length - 1; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[i] + arr[j] == target)
                {
                    System.out.println(i + " " + j);
                }

            }

        }
    }
}
