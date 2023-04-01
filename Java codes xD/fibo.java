import java.util.Scanner;
public class fibo
{  
public static void main(String args[])   
{  
int n1,n2,n3,i,n;
System.out.println("The number of outputs ");
Scanner obj=new Scanner(System.in);
n=obj.nextInt();
n1=0;
n2=1;
for(i=3; i<=n; i++)
    {
        n3 = n1 + n2;
        n1 = n2;
        n2 = n3;
        System.out.println(""+n3);
       // System.out.println("\n");
    }    
}
}

 