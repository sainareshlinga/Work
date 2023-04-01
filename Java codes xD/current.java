import java.util.Scanner;
public class current 
{  
public static void main(String args[])   
{  
int a,b,c;
float d;
System.out.println("Please enter the number of units in before");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
c=b-a;
if(c<100)
{
    d=(float) (c*1.2);
}
else if(c<300)
{
    d=(float) (100*1.2 + (c-100)*2);
}
else if(c>300)
{
    d=(float) (100*1.2 + 200*2 + (c-300)*3);
}
System.out.println(""+d);
}
}