#include <stdio.h>

int main(void) {
  int t;
  scanf("%d",&t);
  while(t--)
  {
      int p,q,r,t;
      scanf("%d%d%d%d",&p,&q,&r,&t);
      if(p+q>=t||q+r>=t||r+p>=t)
      {
          printf("\nYES");
      }
      else
      {
          printf("\nNO");
      }
  }
  return 0;
}