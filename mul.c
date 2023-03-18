#include <stdio.h>
int main()
{   int a[100][100], b[100][100], mul[100][100];
    int n, m, i, j;
    printf("enter the number of rows : "); // rows should be equal to column
    scanf("%d", &n);
    printf("enter the number of column : ");
    scanf("%d", &m);
    printf("enter the elements of matrix 1 \n: ") ;
    for (  i = 0; i < n ; i++)
   {for (  j = 0; j < m; j++)
     {
     scanf("%d",&a[i][j]);
     }
     }
   printf("enter the elements of matrix 2 \n: ") ;
    for (  i = 0; i < n ; i++)
   { for (  j = 0; j < m; j++)
     {
     scanf("%d",&b[i][j]);
     }
      }
   for (  i = 0; i < n ; i++)
   {
     for (  j = 0; j < m; j++)
     {
        mul[i][j]=0;
       for (  int k = 0; k < n;k++)
       {
        mul[i][j]=a[i][k]*b[k][j];
       }
        }}
    printf("the product of the matrix is  \n: ") ;
   
   for (  i = 0; i < n ; i++)
   {
     for (  j = 0; j < m; j++)
     {
     printf("%d\t",mul[i][j]);
     }
     printf("\n");
   }

   return 0 ;
}