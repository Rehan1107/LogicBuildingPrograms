package StringPrograms;

import java.util.Scanner;

public class CheckPalindrome {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String:");
        String s = sc.nextLine();

        isPalindrome(s);

    }

    public static void isPalindrome(String s)
    {
        String reverse =  "";

        int count = 0;

        for (int i = s.length() - 1; i >= 0; i--)
        {
            reverse = reverse + s.charAt(i);

        }

        if (s.equals(reverse))
        {
            System.out.println(s+" is a Palindrome");
        }
        else
        {
            System.out.println(s+" is not a Palindrome");
        }
    }
}
