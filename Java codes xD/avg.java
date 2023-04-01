import java.util.Scanner;
public class avg 
{  
public static void main(String args[])   
{  
int a,b,c,d;
System.out.println("Please enter the numbers.");
try (Scanner obj = new Scanner(System.in)) {
    a=obj.nextInt();
    b=obj.nextInt();
    c=obj.nextInt();
}
d=(a+b+c)/3;
System.out.println("The averages are "+d);
}
}