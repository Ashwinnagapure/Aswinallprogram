#include <stdio.h>

void sum(int number); // declaration
void _sum(int *number);

void main() /*call always takes place in main */

{
    int num = 4;
    printf("the number  is = %d  \n", num);
    sum(num);   // call by value
    _sum(&num); // call by reference (we have to address the  variable here )
}

void sum(int number)
{
    number = number * number;

    printf("the square is  = %d \n", number); // defination
}
void _sum(int *number)
{
    *number = (*number) * (*number); // defination for pointer
    printf("the square is %d \n", *number);
}