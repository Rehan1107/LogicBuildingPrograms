package LogicBuildingProgram;

import java.util.Scanner;

public class BinaryToDecimal {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Binary Number:");
        int num = sc.nextInt();

        System.out.println(binToDeci(num));

    }

    public static int binToDeci(int num)
    {
        int sum = 0;
        int power = 0;

        while(num != 0)
        {
            int digit = num % 10;
            sum = (int) (sum + digit * Math.pow(2, power));
            power++;
            num = num / 10;
        }

        return sum;
    }
}
