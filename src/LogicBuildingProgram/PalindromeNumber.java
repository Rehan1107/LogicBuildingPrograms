package LogicBuildingProgram;

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number");
        int num = sc.nextInt();

        if (isPalindrome(num))
        {
            System.out.println(num+" is a Palindrome Number");
        }
        else
        {
            System.out.println(num+" is not a Palindrome Number");
        }

    }

    public static boolean isPalindrome(int num)
    {
        int temp = num;
        int sum = 0;

        while(num != 0)
        {
            int digit = num % 10;
            sum = (sum * 10) + digit;
            num = num / 10;
        }

        return sum == temp;

    }
}
