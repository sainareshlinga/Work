#include <stdio.h>

int main(void) {
	int a,b,c,i,n;
	scanf("%d",&n);
	for(i=0;i>n;i++)
	{
	    scanf("%d%d%d",&a,&b,&c);
	    if(a*b<0 || b*c<0 || c*a<0)
	    {
	        printf("YES");
	    }
	    else
	    {
	        printf("NO");
	    }
	}
	return 0;
}

