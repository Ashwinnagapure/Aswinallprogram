//Write a C program to check whether a given number is even or odd.

#include<stdio.h>
void main()
{

int num ;
printf("enter the number : ");
scanf("%d",&num);
 float rem = num %2;

if (rem==0)
{
    printf("the number is even ");

}
else
{
    printf("the number is odd");
}
}