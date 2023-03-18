#include <stdio.h>

void shift(int *x, int *y, int *z);
void main()
{
    int x = 5, y = 8, z = 10;
    printf("x=%d y = %d z = %d ", x, y, z);

    printf("\nthe circular shift is : \n");
    shift(&x, &y, &z);
}
void shift(int *x, int *y, int *z)
{

    int t = *y;
    *y = *x;
    *x = *z;

    *z = t;
    printf("x=%d y = %d z = %d ", *x, *y, *z);
}