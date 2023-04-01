// inserton sort
#include <stdio.h>

int main()
{
   int a[20]={5,4,3,2,1};
   int i,j,temp;
   for(i=1;i<5;i++)
   {
       temp=a[i];
       j=i-1;
       while(j>=0 && temp<a[j])s
       {
           a[j+1]=a[j];
           j=j-1;
       }
       a[j+1]=temp;
   }
for(i=0;i<5;i++)
printf("%d ",a[i]);
    return 0;
}