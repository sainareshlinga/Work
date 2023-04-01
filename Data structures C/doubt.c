#include <stdio.h>

int main(void) {
	int t;
	scanf("%d,&t");
	while(t--)
	{
	    int X,Y,Z;
	    scanf("&d%d%d",&X,&Y,&Z);
	    if(X<Y&&X<Z)
	    {
	        printf("ALICE\n");
	    }
	    else if(Y<Z&&Y<X)
	    {
	        printf("BOB\n");
	    }
	    else
	    {
	        printf("CHARLIE\n");
	    }
	}
	return 0;
}

