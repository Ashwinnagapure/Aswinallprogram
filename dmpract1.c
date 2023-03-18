#include <stdio.h>
int main()
{
    char a[100];
    int key;
    printf("enter the message to be encrpted  :");
    gets(a);
    printf("enter the value of the key  :");
    scanf("%d", &key);
    for (int i = 0; a[i] != '\0'; i++)
    {
        if (a[i] >= 'a' && a[i] <= 'z')
        {
            a[i] = a[i] + key;
            if (a[i] > 'z')
            {
                a[i] = a[i] - 'z' + a[i] - 'a';
            }
        }
    }
    printf("the encrpted message is  :%s\n", a);
    char arr[100];
    int key1;
    printf("enter the message to be decrpted  :");
    gets(arr);
    printf("enter the value of the key  :");
    scanf("%d", &key1);

    for (int i = 0; arr[i] != '\0'; i++)
    {
        if (arr[i] >= 'a' && arr[i] <= 'z')
        {
            arr[i] = arr[i] - key;
            if (arr[i] > 'z')
            {
                arr[i] = arr[i] + 'z' - arr[i] + 'a';
            }
        }
    }
    printf("the message descrpted is : %s", arr);
}