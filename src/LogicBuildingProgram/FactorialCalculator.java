package LogicBuildingProgram;

import java.util.Scanner;

public class FactorialCalculator {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number");
        int num = sc.nextInt();

        System.out.println(factorial(num));

    }

    public static int factorial(int num)
    {
        int fact = 1;

        for (int i = 1; i <= num; i++)
        {
            fact = fact * i;

        }

        return fact;
    }
}
