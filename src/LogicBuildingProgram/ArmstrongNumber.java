package LogicBuildingProgram;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number");
        int num = sc.nextInt();

        if (isArmstrong(num))
        {
            System.out.println(num+" is an Armstrong Number");
        }
        else
        {
            System.out.println(num+" is not a Armstrong Number");
        }

    }

    public static boolean isArmstrong(int num)
    {
        int temp = num;
        int rem, sum = 0;

        while(num != 0)
        {
            rem = num % 10;
            sum = sum + rem * rem * rem;
            num = num / 10;

        }

        return sum == temp;
    }
}
