// Write a program in C to find the sum of the series [ x - x^3 + x^5 + ......]
#include<stdio.h>
void main()
{
  int n ,x , sum ;

printf("enter the number : ");
scanf("%d",&x);

printf("the number terms  in series : ");
scanf("%d",n);

for (int i = 1; i < n; i++)
{
    for (int j = 1; j < '\0'; j++)
    {
       if (j==x)
       {
        sum = j^i-j^i+2 ;
        printf("%d",sum);
       }
       
    }
    
    
     
     
}




}