// write a code to print the sum , product ,  avg of two number using pointer

#include <stdio.h>

int work(int a, int b, int *sum, int *pro, int *avg); // declare 

void main()
{
    int a = 10;
    int b = 20;
    int sum, pro, avg;
    work(a, b, &sum, &pro, &avg); // call by value + call by reference

    printf("sum = %d , pro = %d , avg = %d \n ", sum, pro, avg);
}

int work(int a, int b, int *sum, int *pro, int *avg)
{
    *sum = a + b;
    *pro = a * b;
    *avg = (a + b) / 2;
}