#include<stdio.h>
void main ()
{

int  salary ;


printf("salary of the ramesh is : ");
scanf("%d",&salary);

float da = (salary+40*salary/100);
printf("the dearencess allowance is  : %f \n", da);
float hra = (salary + 20*salary/100);
printf("the house rent allowance is : %f \n ", hra);
float gross_salary = salary+da+hra ;
printf("the gross salary of ramesh is : %f \n ",gross_salary);


}