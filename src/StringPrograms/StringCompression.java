package StringPrograms;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class StringCompression {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String:");
        String str = sc.nextLine();

        compression(str);

    }

    public static void compression(String str)
    {
        char[] ch = str.toCharArray();

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < ch.length; i++)
        {
            char c = str.charAt(i);

            if(map.containsKey(c))
            {
                int count = map.get(c);
                map.put(c, count +1);
            }
            else
            {
                map.put(c, 1);
            }
            
        }

        for (Map.Entry<Character, Integer> e : map.entrySet())
        {
            System.out.print(e.getKey() + "" + e.getValue() + " ");
        }


    }
}
