#include <stdio.h>
void main()
{
    char arr[100];
    int key;
    printf("the message is to be decrpted : ");
    gets(arr);
    printf("enter the key : ");
    scanf("%d", &key);
    for (int i = 0; arr[i] != '\0'; i++)
    {
        if (arr[i] >= 'a' && arr[i] <= 'z')
        {
            arr[i] = arr[i] - key;
            if (arr[i] >= 'z')
            {
                arr[i] = arr[i] + 'z' - arr[i] + 'a';
            }
        }
    }
    printf("the message to be decrpted is : %s", arr);
}