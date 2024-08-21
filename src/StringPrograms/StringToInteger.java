package StringPrograms;

import java.util.Scanner;

public class StringToInteger {

    public static void main(String[] args)
    {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter the String:");
//        String str = sc.nextLine();

        String str = "-5413";

        int ans = atoi(str);

        System.out.println("The value of cirrent number is: "+ans);

    }

    public static int atoi(String str)
    {
        int neg = 1;

        if(str.charAt(0) == '-')
        {
            neg = -1;
        }

        int ans = 0;
        int i = 0;

        if (neg == -1)
        {
            i++;
        }

        for (; i < str.length() ; i++)
        {
            ans = ans * 10 + str.charAt(i) - '0';
        }

        ans = ans * neg;
        return ans;
    }
}
