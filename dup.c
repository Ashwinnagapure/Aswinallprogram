#include <stdio.h>

int duplicate(int arr[100], int n, int a);
int duplicate(int arr[100], int n, int a)
{
    int count = 0;
    for (int i = 0; i < n; i++)
    {
        if (arr[i] == a)
        {
            count = 1;
            return count;
        }
    }
    return count;
}
int main()
{
    int arr[100], dup[100], n, dupadd, k;

    printf("enter the size of an array : ");
    scanf("%d", &n);

    printf("enter the elements in array :\n ");
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]);
    }
    printf("array __________ \n");
    for (int i = 0; i < n; i++)
    {
        printf("%d \t", arr[i]);
    }
   

    for (int i = 0; i < n; i++)
    {
        for (int j = i + 1; i < n; j++)
        {
            if (arr[i] == arr[j])
            {
                dupadd = duplicate(arr, dup[i], n);
                if (dupadd == 0)
                {
                    dup[k] = arr[i];
                    k++;
                }
            }
        }
    }
    printf("\n______________________\n");

    for (int i = 0; i < k; i++)
    {
      
        printf("%d", dup[k]);
    }

    return 0;
}

