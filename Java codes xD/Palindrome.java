
import java.util.Scanner; 
 
public class Palindrome { 
static int findreverse(int n) 
{ 
 int rev = 0;  
    int rem;   
      
    while(n>0){  
         
      rem = n%10;  
      rev = (rev*10) + rem;  
      n = n/10;  
    }  
      
    return rev;  
} 
static boolean isPal(int num) 
{ 
 int n; 
 n=num; 
 int rev=0,rem; 
 while(n>0){  
         
       rem = n%10;  
       rev = (rev*10) + rem;  
       n = n/10;  
     } 
 //System.out.println(rev); 
 if(num==rev) { 
  return true; 
   } 
   
 //else 
 //System.out.println(n+ " is not palindrome"); 
  return false; 
} 
 
 

public static void main(String[] args)  
{ 
 int n; 
 Scanner sc=new Scanner(System.in); 
 n=sc.nextInt(); 
 System.out.println(findreverse(n)); 
 //System.out.println(if(Palindrome.isPal(n)); 
 if(Palindrome.isPal(n)) 
  System.out.println(n+ " is  palindrome"); 
 else 
  System.out.println(n+ " is not palindrome"); 
} 
}