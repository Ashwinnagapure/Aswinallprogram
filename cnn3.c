#include <stdio.h>
void main()
{
    char a;
    printf("enter the character : ");
    scanf("%c", &a);

    printf("the character enter is : %c \n", a);
    if (a >= 97 && a <= 122)
    {
        printf("the character enter is lower case ");
    }
    else if (a >= 65 && a <= 90)
    {
        printf("the character enter is upper case");
    }
    else if (a >= 48 && a <= 57)
    {
        printf("the character enter is digit ");
    }
    else if (a >= 32 && a <= 47 || a >= 58 && a <= 64 || a >= 91 && a <= 96 || a >= 123 && a <= 126)
    {
        printf("the character enter is special symbol ");
    }
    else
    {
        printf("the character enter is not valid ");
    }
}