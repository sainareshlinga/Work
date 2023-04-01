#include <stdio.h>

int main(void) {
	int n,p,i;
	scanf("%d",&n);
	for(i=0;i<n;i++)
	{
	    scanf("%d",&p);
	    if(p==6)
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

