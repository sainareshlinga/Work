#include <stdio.h>
#include<math.h>
int main(void) {
    int x1,x2,y1,y2,dis_alice,dis_bob,n,i;
    scanf("%d",&n);
    for(i=0;i<n;i++)
    {
        scanf("%d%d%d%d",&x1,&y1,&x2,&y1);
        dis_alice= sqrt((0-x1)(0-x1)+(0-y1)(0-y1));
        dis_bob= sqrt((0-x2)(0-x2)+(0-y2)(0-y2));
        if(dis_alice==dis_bob)
        {
            printf("SAME");
        }
        if else(dis_alice>dis_bob)
        {
            printf("ALICE")
        }
        else
        {
            printf("BOB");
        }
    }
	return 0;
}

