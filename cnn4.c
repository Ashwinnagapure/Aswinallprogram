#include <stdio.h>
void main()
{
    int health, gender, residence,age, amount;
    printf("enter the age of the person  : ");
    scanf("%d", &age);
    printf("enter the health 1.excellent  2.poor : ");
    scanf("%d", &health);
    printf("enter the gender 1.male 2.female : ");
    scanf("%d", &gender);
    printf("enter the residence 1.city 2.village : ");
    scanf("%d", &residence);
    printf("enter the amount : ");
    scanf("%d", &amount);

    printf("the age of the person is : %d \n", age);
    printf("the health of the person is : %d \n", health);
    printf("the gender of the person is : %d \n", gender);
    printf("the residence of the person is : %d \n", residence);
    printf("the amount  of the policy is : %d \n", amount);

    if (age >= 25 && age <= 35)
    {
        if (health == 1 && gender == 1 && residence == 1)
        {
            if (amount >= 0 && amount <= 200000)
            {
                printf("the premium is Rs.4 per thousand ");
            }
        }
    }
    if (age >= 25 && age <= 35)
    {
        if (health == 1 && gender == 2 && residence == 1)
        {
            if (amount >= 0 && amount <= 100000)
            {
                printf("the premium is Rs.3 per thousand ");
            }
        }
    }
    if (age >= 25 && age <= 35)
    {
        if (health == 2 && gender == 1 && residence == 2)
        {
            if (amount >= 0 && amount <= 200000)
            {
                printf("the premium is Rs.2 per thousand ");
            }
        }
    }
}