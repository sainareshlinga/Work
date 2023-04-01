import java.util.Scanner;
public class amicabledemo 
{
  public static void main(String[] args)
  {
       int n,m;
         System.out.println("Enter n and m values");
         Scanner sc=new Scanner(System.in);
         n=sc.nextInt();
         m=sc.nextInt();
         amicable obj=new amicable();
         obj.isFactor(n,m);
         obj.isAmicable(n,m);
         obj.displayAllAmicableNos(n);
  }
}