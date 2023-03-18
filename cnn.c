#include <stdio.h>
void main()
{

    int angle1, angle2, angle3, sum;

    printf("enter the angle 1 : ");
    scanf("%d", &angle1);

    printf("enter the angle 2 : ");
    scanf("%d", &angle2);

    printf("enter the angle 3 : ");
    scanf("%d", &angle3);

    sum = angle1 + angle2 + angle3;
    printf("the sum of the three angles of triangle is :%d \n", sum);

    if (sum == 180)
    {
        printf("the triangle is valid ");
    }
    else
        printf("the triangle is not valid ");
}