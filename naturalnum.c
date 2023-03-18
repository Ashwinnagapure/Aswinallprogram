#include<stdio.h>
int sumnumber(int n)
{ 
    if(n!=0)
    {
        return n + sumnumber(n-1) ;
        
    }

    else 
    {
        return n ;
    }
}
void main(int num)
{
    
    printf("enter the number : ");
    scanf("%d",&num);
    printf("the sum of natural number is  %d",sumnumber(num));
}