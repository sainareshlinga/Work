import java.util.Scanner;

public class amicable 
{
    public static void isFactor(int n,int m)
     {
       if(m%n==0)
         System.out.println("The given number "+n+" is a factor of "+m);
       else
         System.out.println("The given number "+n+" is not a factor of "+m);
     }
     
     public static void isAmicable(int n,int m)
     {
       int i,sum1=0;int sum2=0;
       for(i=1;i<n;i++) {
         if(n%i==0)
           sum1=sum1+i;
       }
       for(i=1;i<m;i++) {
         if(m%i==0) {
           sum2=sum2+i;
         }
       }
       if(n==sum2 && m==sum1)
         System.out.println("Given numbers are Amicable");
       else 
         System.out.println("Given numbers are not Amicable numbers");
     }
     
     public static void displayAllAmicableNos(int n)
     {
       int i,j,sum1,sum2;
       System.out.println("The Amicable numbers are: ");
       for(i=1;i<=n;i++)
       {
         sum1=0;
         for(j=1;j<i;j++)
         {
           if(i%j==0) {
             sum1=sum1+j;
           }
         }
         sum2=0;
         for(j=1;j<sum1;j++)
         {
           if(sum1%j==0) {
             sum2=sum2+j;
           }
         }
         if(i==sum2)
           System.out.println("("+i+","+sum1+")");
       }
       
     }
     
     public static void main(String[] args)
     {
       int n,m;
       System.out.println("Enter n and m values");
       Scanner sc=new Scanner(System.in);
       n=sc.nextInt();
       m=sc.nextInt();
       amicable obj=new amicable();
       amicable.isFactor(n,m);
       amicable.isAmicable(n,m);
       amicable.displayAllAmicableNos(n);
     }
}