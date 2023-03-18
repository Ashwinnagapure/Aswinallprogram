//Write a C program to accept two integers and check whether they are equal or not

#include<stdio.h>
void main()
{
 int num1 , num2 ;

 printf("enter the number 1 : ");
 scanf("%d",&num1);
 printf("enter the number 2 : ");
 scanf("%d",&num2);

 if (num1==num2)
 {
    printf("the numbers are equal");
 }
 else
 {
    printf("numbers are not equal ");
 }
 

}