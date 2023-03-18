// program to print conjunction and disjunction
#include <stdio.h>
int main()
{
    int n, m;
    printf("enter the number 1 :");
    scanf("%d", &n);
    printf("enter the number 1 :");
    scanf("%d", &m);
    if (n == 1 && m == 1)
    {
        printf("the output of the conjunction : 1\n");
    }
    else
    {
        printf("the output of the conjunction : 0");
    }
    if (n == 0 && m == 0)
    {
        printf("the output of the disjunction is : 0");
    }
    else
    {
        printf("the output of the disjunction is : 1");
    }
}