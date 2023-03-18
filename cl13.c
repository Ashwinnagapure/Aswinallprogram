#include <stdio.h>
void main()
{
    int hours, overtime;
    for (int i = 0; i <= 10; i++)
    {
        printf("enter the number of hours :\n ");
        scanf("%d", &hours);

        if (hours >= 40)
        {
          overtime = (hours - 40) * 12;
            printf(" the overtime of an employee is %d \n", overtime);
        }
    }
}
