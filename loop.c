#include <stdio.h>
void main()
{
    char name[100], regno[100], branch[100];

    int n;
    printf("enter the size of an array : ");
    scanf("%d", &n);
    printf("enter the details :\n ");
    for (int i = 0; i < n; i++)
    {
        scanf("%s", name);
        scanf("%s", regno);
        scanf("%s", branch);
    }

    printf("the name of the student is : %s\n", name);
    printf("the reg no. of the student is : %s\n", regno);
    printf("the branch of the student is : %s\n", branch);

    for (int i = 0; i < n; i++)
    {
        scanf("%s", name);
        scanf("%s", regno);
        scanf("%s", branch);
    }

    printf("the name of the student 2 is : %s\n", name);
    printf("the reg no. of the student 2 is : %s\n", regno);
    printf("the branch of the student 2 is : %s\n", branch);
}
