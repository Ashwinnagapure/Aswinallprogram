#include <stdio.h>
void main()
{
    char ch;

    printf("enter the operator (+,-,*,/) : ");
    scanf("%c", &ch);
    int a;
    printf("enter the first value : ");
    scanf("%d", &a);
    int b;
    printf("enter the second value : ");
    scanf("%d", &b);
     
    switch (ch)
    {
    case '+':
        printf("%d+%d=%d", a, b, a + b);
        break;

    case '-':
        printf("%d-%d=%d", a, b, a - b);
        break;

    case '*':
        printf("%d*%d=%d", a, b, a * b);
        break;
      //float d ;
      //d = a/b ;
    case '/':
        printf("%d/%d=%d", a, b, a/b);
        break;

    default:
        break;
    }
}