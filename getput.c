#include<stdio.h>
void main()
{
    char str[100];

    //gets(str);
    fgets(str,100,stdin);
    puts(str);
}