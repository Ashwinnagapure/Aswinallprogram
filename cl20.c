#include <stdio.h>
int primefactor(int n);
int main()
{

    int n;
    printf("enter the number : ");
    scanf("%d", &n);
    printf("the prime factor are : \n");
    primefactor(n);
}

int primefactor(int n)
{
    if (n > 0)
    {
        while (n % 2 == 0)
        {
            printf("2 \t");
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
        printf("%d", n);
    }
}
