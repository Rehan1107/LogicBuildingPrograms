package LogicBuildingProgram;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number");
        int num = sc.nextInt();

        System.out.println(reverseNum(num));

    }

    public static int reverseNum(int num)
    {
        int reverse = 0;

        while(num != 0)
        {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;

        }

        return reverse;
    }
}
