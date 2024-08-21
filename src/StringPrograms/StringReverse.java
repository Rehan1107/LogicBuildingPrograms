package StringPrograms;

import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String:");
        String str = sc.nextLine();

        reverse(str);

    }

    public static void reverse(String str)
    {
        String[] a = str.split(" ");

        for (int i = a.length - 1; i >= 0; i--)
        {
            System.out.print(a[i] + " ");

        }

    }
}
