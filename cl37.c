#include <stdio.h>
#include <stdlib.h>
int n;
FILE *fp;
struct hospital
{
    char name[100];
    char address[100];
    int age[100];
    char blood_type[4];
};

/*int data(struct hospital h[])
{

    for (int i = 0; i < n; i++)
    {
        printf("enter the name of the donor %d :", i + 1);
        scanf("%s", h->name[i]);
        fprintf(fp, "name=%s\t", h->name[i]);
        printf("enter the address of the donor %d :", i + 1);
        scanf("%s", h->address[i]);
        fprintf(fp, "name=%s\t",h->address[i]);
        printf("enter the age of the donor %d :", i + 1);
        scanf("%d", h->age[i]);
        fprintf(fp, "name=%d\t",h->age[i]);
        printf("enter the blood type of the donor %d :", i + 1);
        scanf("%s", h->blood_type[i]);
        fprintf(fp, "name=%s\t", h->blood_type[i]);
    }
    fclose(fp);
}*/
int main()
{
    FILE *fp;
    fp = fopen("hospital_1.txt", "w+");
    int n;
    struct hospital h[100];
    printf("enter the number of the donor : ");
    scanf("%d", &n);
    for (int i = 0; i < n; i++)
    {
        printf("enter the name of the donor %d :", i + 1);
        scanf("%s", &h->name[i]);
         fprintf(fp, "name=%s\t", h->name[i]);
        printf("enter the address of the donor %d :", i + 1);
        scanf("%s", &h->address[i]);
         fprintf(fp, "name=%s\t",h->address[i]);
        printf("enter the age of the donor %d :", i + 1);
        scanf("%d", &h->age[i]);
          fprintf(fp, "name=%d\t",h->age[i]);
        printf("enter the blood type of the donor %d :", i + 1);
        scanf("%s", &h->blood_type[i]);
         fprintf(fp, "name=%s\t", h->blood_type[i]);
    }
    /*for (int i = 0; i < n; i++)
    {
        fprintf(fp, "name=%s\t", h->name[i]);
        fprintf(fp, "address=%s\t", h->address[i]);
        fprintf(fp, "age=%d\t", h->age[i]);
        fprintf(fp, "blood type=%s\t", h->blood_type[i]);
    }*/

    fclose(fp);
}
