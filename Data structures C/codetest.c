#include <stdio.h>

int main(void) {
  int t;
  scanf("%d",&t);
  while(t--)
  {
      int x;
      scanf("%d",&x);
      if(x>=80)
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