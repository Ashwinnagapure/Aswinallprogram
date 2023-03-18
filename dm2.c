#include <stdio.h>
void main()
{
    int a[100], b[100], n;
    printf("enter the lenght of the string \n ");
    scanf("%d", &n);
    printf("enter the bits \n");
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &a[i]);
    }
    printf("enter the bits \n");
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &b[i]);
    }

    printf("AND \n");
    {
        for (int i = 0; i < n; i++)

            if (a[i] == 1 && b[i] == 1)
            {
                printf("1\n");
            }
            else
            {
                printf("0\n");
            }
    }
    printf("nor \n");
    {
        for (int i = 0; i < n; i++)

            if (a[i] == 0 && b[i] == 0)
            {
                printf("0\n");
            }
            else
            {
                printf("1\n");
            }
    }
    printf("xOR \n");
    {
        for (int i = 0; i < n; i++)

            if (a[i] == 0 && b[i] == 0)
            {
                printf("0\n");
            }
            else if (a[i] == 1 && b[i] == 1)
            {
                printf("0\n");
            }
            else

            {
                printf("1\n");
            }
    }
}
