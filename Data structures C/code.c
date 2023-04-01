#include<stdio.h>
#include<string.h>

int main()
{
    int t;
    scanf("%d", &t);
    while (t--)
    {
        char c, s[] = "codeforces";
        scanf(" %c", &c);
        if (strchr(s, c))
            printf("YES\n");
        else
            printf("NO\n");
    }
    return 0;
}