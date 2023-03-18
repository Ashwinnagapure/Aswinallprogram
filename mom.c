#include <stdio.h>
int sum(int a, int b); // declaration

int main()
{
    int a, b, c;
    a = 30;
    b = 40;

    c = sum(a, b); // call
    printf("%d", c);
}
int sum(int a, int b) // defination
{
    return a + b;
}