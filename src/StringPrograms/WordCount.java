package StringPrograms;

import java.util.Scanner;

public class WordCount {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String");
        String str = sc.nextLine();

        wordCount(str);

    }

    public static void wordCount(String str)
    {
        int count = 1;

        for (int i = 0; i < str.length(); i++)
        {
            if((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' '))
            {
                count++;
            }

        }

        System.out.println("Number of words in given String is: "+count);
    }
}
