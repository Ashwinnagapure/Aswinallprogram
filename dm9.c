#include <stdio.h>
#include <stdlib.h>

int fibonacci(int n);
int main()
{
    int num;
    printf("enter the number : ");
    scanf("%d", &num);

    printf("The fibonacci series is : \n");
    fibonacci(num);
}

int fibonacci(int n)
{
     int a[n];
     a[0] = 0;
     a[1] = 1;
     for (int i = 2; i < n; i++)
     {
       a[i] = a[i - 1] + a[i - 2];
        printf("%d\t", a[i]);

     }
    
}