import java.util.Scanner;
public class grt 
{  
public static void main(String args[])   
{  
int a,b,c;
System.out.println("Please enter the numbers.");
try (Scanner obj = new Scanner(System.in)) {
    a=obj.nextInt();
    b=obj.nextInt();
    c=obj.nextInt();
}
if(a>b||a>c)
{
    System.out.println("the greatest number is"+a);
}
else if(b>a||b>c)
{
    System.out.println("the greatest number is"+b);
}
else if(c>a||c>b)
{
    System.out.println("the greatest number is"+c);
}
}
}