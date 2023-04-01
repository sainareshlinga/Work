#include<stdio.h>
int main()
{
int i,j,rows,columns;
int n;
scanf("%d",&n);
while(n--)
{
scanf("%d%d",&rows,&columns);
for(i=0;i<rows;i++)
{
for(j=0;j<columns;j++)
{
if((i+j)%2==0)
{
printf("*");
}
else
{
printf(".");
}
printf("\n");
}
}
return 0;
}
}