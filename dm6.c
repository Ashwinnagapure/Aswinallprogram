#include <stdio.h>
void main()
{
    int num1, num2, gcd;
    printf("enter the number 1 : ");
    scanf("%d", &num1);
    printf("enter the number 2 : ");
    scanf("%d", &num2);

    for (int i = 1; i <= num1 && i <= num2; i++)
    {
        if (num1 % i == 0 && num2 % i == 0)
        {
            gcd = i;
        }
    }

    printf("the gcd of %d and %d is %d ", num1, num2, gcd);
}