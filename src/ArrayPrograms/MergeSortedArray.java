package ArrayPrograms;

import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String[] args)
    {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {4, 5, 6};

        int[] nums3 = new int[nums1.length + nums2.length];

        for (int i = 0; i < nums1.length; i++)
        {
            nums3[i] = nums1[i];
            
        }

        for (int i = 0; i < nums2.length; i++)
        {
            nums3[i + nums1.length] = nums2[i];
            
        }

        System.out.println(Arrays.toString(nums3));

    }


}
