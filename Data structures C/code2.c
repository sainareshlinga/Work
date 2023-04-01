#include <stdio.h>

int main()
{
    int t;
    scanf("%d", &t);
    
    while (t--) {
        int n;
        scanf("%d", &n);
        
        int x = 0, y = 0;
        char s[n+1];
        scanf("%s", s);
        
        for (int i = 0; i < n; i++) {
            if (s[i] == 'L') x--;
            else if (s[i] == 'R') x++;
            else if (s[i] == 'U') y++;
            else if (s[i] == 'D') y--;
            
            if (x == 1 && y == 1) {
                printf("YES\n");
                break;
            }
        }
        if (x != 1 || y != 1) printf("NO\n");
    }
    return 0;
}
