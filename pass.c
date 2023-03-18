#include <stdio.h>
void main()
/*print which gift they will get if pass in maths science both will get 45
as there gift and of individually get pass in maths and science will get 15,15 respectively */
{
    int marks;
    printf("enter the marks they get : ");
    scanf("%d", &marks);
    if (marks >= 90)
    {
        printf("pass in maths and science\n");
        printf("they will get the gift of :45\n");
    }
    else if (marks >= 50)
    {

        printf("pass in maths  \n  ");
        printf("they  will get the gift of :15 \n ");
    }

    else if (marks >= 40)
    {
        printf("passs in science\n");
        printf("they will the get the gift of 15\n");
    }

    else
    {
        printf("fail in both the subject");
    }
}