package LogicBuildingProgram;

import java.util.Scanner;

public class HCFandLCMCalculator {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number:");
        int num2 = sc.nextInt();

        hcfOfNum(num1, num2);


    }

    public static void hcfOfNum(int num1, int num2)
    {
        int hcf = 1;
        int lcm = 1;

        for (int i = 1; i <= num1 && i <= num2; i++)
        {
            if (num1 % i == 0 && num2 % i == 0)
            {
                hcf = i;
            }

            lcm = (num1 * num2) / hcf;

        }

        System.out.println("Highest Common Factor of "+ num1 +" and "+ num2 +" is: " + hcf);
        System.out.println("Least Common Multiple of "+ num1 +" and "+ num2 +" is: " + lcm);
    }

}
