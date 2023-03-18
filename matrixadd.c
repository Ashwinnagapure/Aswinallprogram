#include <stdio.h>
void main()
{
    int n, m, a[100][100], b[100][100], sum[100][100], i, j;

    printf("enter the number of rows of the matrix  : ");
    scanf("%d", &n);
    printf("enter the number of column of the matrix : ");
    scanf("%d", &m);

    printf("enter the elements of matrix 1  : \n  ");
    for (i = 0; i < n; i++)
        for (j = 0; j < m; j++)
        {
            printf("enter the elements a%d%d :  ", i + 1, j + 1);
            scanf("%d", &a[i][j]);
        }

    printf("enter the elements of matrix 2  :\n  ");
    for (i = 0; i < n; i++)
        for (j = 0; j < m; j++)
        {
            printf("enter the elements b%d%d :   ", i + 1, j + 1);
            scanf("%d", &b[i][j]);
        }

    printf("the sum of two matrix is \n : ");

    for (i = 0; i < n; i++)
        for (j = 0; j < m; j++)
        {
            sum[i][j] = a[i][j] + b[i][j];
            printf("%d\t", sum[i][j]);
            if (j == n - 1)
            {
                printf("\n\n");
            }
        }
}