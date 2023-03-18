#include <stdio.h>
void shift(int *a)
{
    int *b, c, d, i;
    b = a;
    c = *a;
    d = *(a + 1);

    for (i = 0; i < 3; i++)

        *(b + i) = *((a + 2) + i);
    *(b + 3) = c;
    *(b + 4) = d;
}
int main()
{
    int a[5], i;
    printf("enter the number : \n");
    for (i = 0; i < 5; i++)
    {
        scanf("%d", &a[i]);
    }
    shift(a);
    printf("\n\n after shifting :");
    for (i = 0; i < 5; i++)
    {
        printf("%d\t", a[i]);
    }
}
