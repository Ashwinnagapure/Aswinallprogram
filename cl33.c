

#include <stdio.h>
int main()
{

int a ,b;
double c;

printf("enter the first number  : ");
scanf("%d",&a);
printf("enter the second number : ");
scanf("%d",&b);
c=(double)a/b;//type-cast 
printf("the output is : %f",c);
   /* char str[100];

    printf("Enter a value :");
    gets(str);

    printf("\nYou entered: ");
    puts(str);

    return 0;*/
}
/*int main()
{

    printf("hello world !\n");
    int a , b, c;
printf("enter the first number  : ");
scanf("%d",&a);
printf("enter the second  number  : ");
scanf("%d",&b);

    c = a + b;
    printf("the sum is %d", c);
}*/
