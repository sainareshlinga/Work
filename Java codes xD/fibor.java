 package skill;

import java.util.Scanner;

public class fibor {
   static int n1=0,n2=1,n3=0,count=0;
   static void fibonacci(int count)
   {
     if (count>0)
     {
       n3=n1+n2;
       n1=n2;
       n2=n3;
       System.out.println(""+n3);
       fibonacci(count-1);
     }
   }
   public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
     count=sc.nextInt();
     System.out.println(n1+""+n2);
     fibonacci(count-2);
   }
}