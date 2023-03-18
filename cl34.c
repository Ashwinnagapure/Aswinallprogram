#include <stdio.h>
int getint()
{

    int n = 0;
    char num[10];
    printf("enter the numeric strings  :");
    scanf("%s", num);
    sscanf(num,"%d", &n);
    return n;
}
int main()
{

    int num1;
    num1 = getint();
    printf("the numbers are : %d\n", num1);
    
}