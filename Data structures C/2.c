#include <stdio.h>

int main(void) {
 // your code goes here
 int t;
 scanf("%d",&t);
 while(t--)
 {
     int n,i;
     scanf("%d",&n);
     char s[n];
     scanf("%s",s);
     int a=0,x=0;
     for(i=0;s[i]!='\0';i++)
     {
         if(s[i]=='0')
         a++;
         else 
         x++;
     }
     if(a>=x)
     {
         printf("%d\n",x);
     }
     else
     {
         printf("%d\n",a+1);
     }
 }
 return 0;
}