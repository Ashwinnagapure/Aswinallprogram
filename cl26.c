#include <stdio.h>
void main()
{
   int n, m, a[100][100], b[100][100], i, j, k;
   printf("enter the number of rows : ");
   scanf("%d", &n);
   printf("enter the number of column : ");
   scanf("%d", &m);
   printf("enter the elements of the matrix :\n");
   for (i = 0; i < n; i++)
      for (j = 0; j < m; j++)
      {
         printf("the element is a%d%d :", i + 1, j + 1);
         scanf("%d", &a[i][j]);
      }
   printf("the matrix before transpose : \n");
   for (i = 0; i < n; i++)
      for (j = 0; j < m; j++)
      {

         printf("%d\t", a[i][j]);
         if (j == m - 1)
         {
            printf("\n\n");
         }
      }
   printf("matrix after transpose is : \n");

   for (i = 0; i < n; i++)
      for (j = 0; j < m; j++)
      {
         b[j][i] = a[i][j];
      }

   for (i = 0; i < n; i++)
      for (j = 0; j < m; j++)
      {

         printf("%d\t", b[i][j]);
         if (j == m - 1)
         {
            printf("\n\n");
         }
      }
}