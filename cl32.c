#include <stdio.h>
#include <stdlib.h>
struct cricket
{
    char name[100];
    int age;
    int test_matches;
    int runs;
};
int n, i;
int cricketer(struct cricket c[])
{
    for (i = 0; i < n; i++)
    {
        printf("enter the name of the cricketer %d : ", i + 1);
        scanf("%s", &c[i].name);
        printf("enter the age of the cricketer  %d :", i + 1);
        scanf("%d", &c[i].age);
        printf("enter the test matches played by cricketer %d : ", i + 1);
        scanf("%d", &c[i].test_matches);
        printf("enter the runs of the cricketer  %d :", i + 1);
        scanf("%d", &c[i].runs);
    }
}
int sort(const void *a, const void *b)
{
    return ((int)a - (int)b);
}

int record(struct cricket c[])
{
    printf("\nCricketer Record ====\n");
    qsort(record, n, sizeof(struct cricket), sort);
    for (int i = 0; i < n; i++)
    {
        printf("Player: %d\n", 1);
        printf("Name:%s\n", c[i].name);
        printf("Age: %d\n", c[i].age);
        printf("Total Test matches played: %d\n", c[i].test_matches);
    }
}

int main()
{
    struct cricket c[100];
    printf("enter the number of cricket player : ");
    scanf("%d", &n);

    cricketer(c);
    record(c);
}