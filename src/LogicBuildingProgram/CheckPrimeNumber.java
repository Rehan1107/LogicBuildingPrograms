package LogicBuildingProgram;

import java.util.Scanner;

public class CheckPrimeNumber {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number");
        int num = sc.nextInt();

        if (isPrime(num))
        {
            System.out.println(num+" is a Prime Number");
        }
        else
        {
            System.out.println(num+" is not a Prime Number");
        }


    }

    public static boolean isPrime(int num)
    {
        int count = 2;

        for (int i = 2; i <= num/2; i++)
        {
            if(num % i == 0)
            {
                count++;
            }

        }

        return count == 2;
    }
}
