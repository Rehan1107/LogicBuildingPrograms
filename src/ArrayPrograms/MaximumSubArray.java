package ArrayPrograms;

public class MaximumSubArray {

    public static void main(String[] args)
    {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, 5, 4};

        int maxSum = maxSubArray(arr);

        System.out.println("Maximum SubArray sum: "+maxSum);

    }

    public static int maxSubArray(int[] arr)
    {
        int maxSoFar = arr[0];
        int maxEnding = arr[0];

        for (int i = 1; i < arr.length; i++)
        {
            maxEnding = Math.max(arr[i], maxEnding + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEnding);
            
        }

        return maxSoFar;

    }
}
