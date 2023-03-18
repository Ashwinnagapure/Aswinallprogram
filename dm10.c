#include <stdio.h>
#include <math.h>
int recurence(int n)
{
    if (n == 0 || n == 1)
    {
        return 0;
    }
    else if (n == 2)
    {
        return 1;
    }
    else
    {
        return recurence(n - 1) + recurence(n - 2) + pow(2, (n - 2));
    }
}
int main()
{
    int n;
    printf("enter the string lenght :");
    scanf("%d", &n);
    printf("the number of bit strings are : %d", recurence(n));
}