package ArrayPrograms;

public class MissingNumber {

    public static void main(String[] args)
    {
        int[] arr = {9,6,1,3,8,4,2,5,0};

        int n = arr.length;

        int totalSum = n * (n + 1) / 2;

        int ArraySum = 0;

        for (int i = 0; i < n; i++)
        {
            ArraySum = ArraySum + arr[i];

        }

        int missing = totalSum - ArraySum;
        System.out.println(missing);

    }
}
