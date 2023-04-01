#include<stdio.h>
int main(void)
{
    int t;
    scanf("%d",&t);
    while(t--)
    {
        int X,Y,Z;
        scanf("%d%d%d",&X,&Y,&Z);
        if(X+Y+Z>5)
        {
            printf("Yes\n");
        }
        else
        {
            printf("No\n");
        }
        
    }
    return 0;
    
}