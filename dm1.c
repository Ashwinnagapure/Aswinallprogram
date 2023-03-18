#include <stdio.h>
int main()
{
    int num;
    printf("enter the positive integer ");
    scanf("%d", &num);

    if (num > 0)
    {
        while (num % 2 == 0)
        {
            printf("2\t");
            num /= 2;
        }

        for (int i = 2; i < num; i++ )
        {
            while (num % i == 0)
            {
                printf("%d \t", i);
                num /= i;
            }
        }
    }
    if (num > 2)
    {
        printf("%d \t", num);
    }
}