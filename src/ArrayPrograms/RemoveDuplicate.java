package ArrayPrograms;

import java.util.Scanner;

public class RemoveDuplicate {

    public static void main(String[] args)
    {
       int[] arr = {1,2,2,4,5,6,6};

       int newLength = removeDuplicates(arr);

        System.out.println("New Length: "+newLength);

        for (int i = 0; i < newLength; i++)
        {
            System.out.print(arr[i] + " ");
            
        }
    }

    public static int removeDuplicates(int[] arr)
    {
        if(arr.length == 0)
        {
            return 0;
        }

        int slow = 0;

        for (int i = 1; i < arr.length; i++)
        {
            if (arr[slow] != arr[i])
            {
                slow++;
                arr[slow] = arr[i];
            }
            
        }

        return slow + 1;
    }
}
