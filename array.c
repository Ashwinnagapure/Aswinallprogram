#include <stdio.h>

// percentage of a student using arrays in c 

void main()
{
    int marks[3] , i ;
    printf("the number in maths is : ");
    scanf("%d", &marks[0]);

     printf("the number in phy is : ");
    scanf("%d", &marks[1]);

     printf("the number in chem is : ");
    scanf("%d", &marks[2]);
float  t ;
    t=(marks[0]+marks[1]+marks[2]);
   float per=(t*100/300)  ;  
   printf("phy=%d,math=%d,chem=%d\n",marks[0],marks[1],marks[2]);
   printf("the percentage of the student is %f \n ", per,t);
    
}