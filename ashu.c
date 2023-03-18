#include<stdio.h>
void main()
{
    int age ;
    printf("enter the age of the person : ");
    scanf("%d",&age);
if (age>=18)
{
    printf("person can vote ");
}
else if (age<=10)
{
    printf("the person is kid");
}


else
{
    printf("person can never vote");
}

}