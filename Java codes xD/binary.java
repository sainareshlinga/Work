import java.util.Scanner;

public class binary {
  public static String convertToBinary(int decnumber)
    {
        String binaryString = " ";
        if (decnumber > 0)
        {
            binaryString = Integer.toBinaryString(decnumber);
        }
              return binaryString;
    } 
    public static int findMaxChar(String str)  
    {
        char[] array = str.toCharArray();
        int maxCount = 1;
        for(int i = 0, j = 0; i < str.length() - 1; i = j)
        {
            int count = 1;
            while (++j < str.length() && array[i] == array[j]) 
            {
                count++;
            }
            if (count > maxCount) 
            {
                maxCount = count;
            }
        }
    return (maxCount);
    }
    public static void main(String [] args)
    
{
       try (Scanner input = new Scanner(System.in)) 
    {
        int decimalnumber = input.nextInt();
        String result = convertToBinary(decimalnumber);
         System.out.println(findMaxChar(result));
    }
}
}