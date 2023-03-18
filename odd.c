#include <stdio.h>

int oddnumber(int arr[]);

void main()
{
    int arr[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20}, s;
    s = oddnumber(arr);

    printf("the number of odd number are = %d ", s);
}

int oddnumber(int arr[])
{
    int count = 0;

    for (int i = 0; i < 14; i++)
    {
        if (arr[i] % 2 != 0)
        {
            count++;
        }
    }
    return count;
}