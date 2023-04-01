import java.util.Scanner;
public class factor
{  
public static void main(String args[])   
{  
int n,i,fact=1;
System.out.println("Please enter the numbers");
Scanner obj=new Scanner(System.in);
n=obj.nextInt();
for(i=1;i<=n;i++)
{
    fact=fact*i;
}
System.out.println("The averages are "+fact);
}
}