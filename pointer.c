#include <stdio.h>
/*void main()
{
    int age =55 ;
    int *ptr = &age ;
    int **pptr =&ptr ;

printf("%d %d",**pptr,*ptr);

}*/

// pointer arithmetic

int main()
{
    int age = 22;
    int _age = 25;
    int *ptr = &age;
    int *_ptr = &_age;

    printf("difference = %d\n ", *ptr - *_ptr);

    _ptr = &age;

    printf("camparison = %d \n ", *ptr == *_ptr);

    return 0;
}