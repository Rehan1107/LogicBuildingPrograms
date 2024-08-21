package LogicBuildingProgram;

import java.util.Scanner;

public class FibonacciSequence {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Nth term Number");
        int num = sc.nextInt();

        fibonacci(num);

    }

    public static void fibonacci(int num)
    {
        int a = 0, b = 1;
        int c = 0;

        System.out.print(a + " " + b + " ");

        for (int i = 1; i <= num - 2; i++)
        {
            c = a + b;

            System.out.print(c + " ");

            a = b;
            b = c;

        }
    }
}
