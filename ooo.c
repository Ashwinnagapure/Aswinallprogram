//  write a program to search an element in a array and reverse a given array

#include <stdio.h>
void main()
{
    int arr[100], search, n, count = 0;
    printf("enter the elements of array : ");
    scanf("%d", &n);
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]);
    }
    for (int i = 0; i < n; i++)
    {
        printf("array %d : %d \n", i + 1, arr[i]);
    }
    printf("enter the element to search : ");
    scanf("%d", &search);
    for (int i = 0; i < n; i++)
    {
        if (arr[i] == search)
        {
            printf("%d is element found",search);
            break;
        }
        count++;
    }
    if (count == n)
    {
        printf("element is not found");
    }
}
