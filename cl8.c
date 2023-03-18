// print the multiplication table of any number using for loop 

#include<stdio.h>
void main()
{

int n;

printf("enter the number whose table to be printed : ");
scanf("%d",&n);

for (int i = 1; i <11; i++)
{
   printf("%d*%d=%d \n",n,i,n*i);
}



}










