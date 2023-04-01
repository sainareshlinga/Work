#include<stdio.h>
int main()
{
int i,n,j,temp;
int a[20]={10,5,2,7,4,8};
for(i=1;i<n;i++)
{
    temp=a[i];
    j=i-1;
    while(i>0&&a[i]>temp)
    {
        a[j+1]=a[j];
        j--;
    }
    a[j+1]=temp;
}
for(i=0;i<6;i++)
{
printf("%d",a[i]);
return 0;
}
}