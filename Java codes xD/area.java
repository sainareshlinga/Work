import java.util.Scanner;
public class area 
{  
public static void main(String args[])   
{  
int r,area;
System.out.println("Please enter the radius of the circle :");
Scanner obj=new Scanner(System.in);
r=obj.nextInt();
area=(22/7)*r*r;
System.out.println("The averages are "+area);
}
}