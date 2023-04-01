#include<stdio.h>
int main(void)
{
    int a;
    scanf("%d",&a);
    while(a--)
    {
        int m,n;
        scanf("%d%d",&m,&n);
        if(m<=8 && m*n<=500)
        printf("YES\n");
        else
        printf("NO\n");
    }
    return 0;
}