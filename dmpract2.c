#include <stdio.h>
int main()
{
    int n;
    printf("enter the positive number : ");
    scanf("%d", &n);
    if (n > 0)
    {
        while (n % 2 == 0)
        {
            printf("2\t");
            n /= 2;
        }
        for (int i = 2; i < n; i++)
        {
            while (n % i == 0)
            {
                printf("%d\t", i);
                n /= i;
            }
        }
    }
    if (n > 2)
    {
        printf("%d\t", n);
    }
}