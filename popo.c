#include<stdio.h>
void main()
{
int  num ,i , j ;
printf("enter the number : ");
scanf("%d",&num);
for(i=0 , j = 0 ; i<num,j<num;--i,++j)
{
    printf("%d %d\n",i+1,j+1);
}

}