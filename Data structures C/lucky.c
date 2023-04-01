#include <stdio.h>

int main(void) {
	int n,i,x;
	int a[10];
	scanf("%d",&n);
	{
	    for(i=0;i<n;i++)
	    {
	        scanf("%d",a[i]);
	        if(a[i]==7)
	        {
	            printf("YES\n");
	        }
	        else
	        {
	         printf("NO\n");   
	        }
	    }
	}
	return 0;
}

