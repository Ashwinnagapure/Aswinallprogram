#include <stdio.h>

int sum(int n);

int main()
{
    int n;
    printf("enter the positive number : ");
    scanf("%d", &n);

    printf("the sum of n positive number is : %d ", sum(n));
}
int sum(int n)
{
    if (n > 0)
    {
        return n * (n + 1) / 2;
    }
    else
        
       return 0 ;
}
