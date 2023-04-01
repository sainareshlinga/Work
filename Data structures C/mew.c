#include <stdio.h>
#include <string.h>

const char pi[] = "314159265358979323846264338327";

int main() {
    int h,i;
    scanf("%d", &h);
    while (h--) 
  {
        char n[31];
        scanf("%s", n);

        int corr=0;
        for (i = 0; i < strlen(n); i++) 
    {
            if (n[i] == pi[i]) 
      {
                corr++;
            } 
      else 
      {
                break;
            }
        }
        printf("%d\n", corr);
    }
    return 0;
}