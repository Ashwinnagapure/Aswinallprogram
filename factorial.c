#include<stdio.h>
int factorial(int n)
{
    if (n==1 || n == 0)
    {
        return n = 1 ;
    }
    else
    {
        return( n*factorial(n-1));
    }
}
void main()
{
    int num ,n;
    printf("enter the size : ");
    scanf("%d",&n);
    printf("enter the number : ");
    for (int i = 0; i <n; i++)
    {
        scanf("%d",&num);
    }
    
    
   
   for (int i = 0; i <= n ; i++)
   {
     printf("the  factorial of the given number  is :%d\n", factorial(num));
   }
   
   
   
}