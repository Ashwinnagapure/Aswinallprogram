#include <stdio.h>
#include <stdlib.h>
struct hospital
{
    char name[100];
    char address[100];
    char blood_type[100];
    int age;
};

void main()
{
     struct hospital h ;
    FILE *fp;
    int n;
    fp = fopen("Hospital.txt", "w+");

    if (fp == NULL)
    {
        printf("file does not exist  ");
        return;
    }

    printf("enter the number of donor  :");
    scanf("%d", &n);

    for (int i = 0; i < n; i++)
    {
        printf("enter the name of the donor %d :", i + 1);
        scanf("%s", h.name);
        fprintf(fp, "name=%s\t\n",h.name);
        printf("enter the address of the donor %d :", i + 1);
        scanf("%s", h.address);
        fprintf(fp, "address=%s\t",h.address);
        printf("enter the blood type of the donor %d :", i + 1);
        scanf("%s",h.blood_type);
        fprintf(fp, "blood type=%s\t", h.blood_type);
        printf("enter the age of the donor %d :", i + 1);
        scanf("%d", &h.age);
        fprintf(fp, "age=%d\t", h.age);
    }

    fclose(fp);
}