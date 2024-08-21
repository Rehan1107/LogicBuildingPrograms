package ArrayPrograms;

public class MoveZeroes {

    public static void main(String[] args) {
        int[] arr = {2, 0, 0, 8, 7, 0, 4, 6};

        int n = arr.length;

        moveZero(arr, n);

    }

    public static void moveZero(int[] arr, int n)
    {
        int count = 0;

        for (int i = 0; i < n; i++)
        {
            if(arr[i] != 0)
            {
                arr[count++] = arr[i];
            }

        }
        while (count < n)
        {
            arr[count++] = 0;

        }

        System.out.println("Element of array moving all zero to the end of the array: ");

        for (int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
            
        }

    }
}
