#include<stdio.h>
int star(int n  )  // defination
{
    int i ;
    for ( i = 0; i < n; i++)
    {
        printf("%c\n",'*');

    }
    printf("%c",'*');
}
void main()
{
  int n = 10 ; 
   star(n);  // call by value 

}