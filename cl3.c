// Write a program in C that takes minutes as input, and display the total number of hours and minutes

#include<stdio.h>
void main()

{
  int num;
  printf("enter the number to be converted : ");
  scanf("%d",&num);

  int hour = num/60 ;
  int min = num%hour;
  printf("%d hours %d min ",hour,min);

}