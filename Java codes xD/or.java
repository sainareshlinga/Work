import java.util.Scanner;
public class or  
{  
public static void main(String args[])   
{  
int a;
System.out.println("Please enter the number to be checked");
Scanner obj=new Scanner(System.in);
a=obj.nextInt(); 
if(a%2==0)
{
    System.out.println("It is a even number");
}  
else
{
    System.out.println("It is a odd number");
}
}
}