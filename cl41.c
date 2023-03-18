#include <stdio.h>
#include <conio.h>
#include <stdlib.h>
#include <string.h>
#include <Windows.h>
struct employee
{
    int id;
    char name[20];
    char sex;
    int salary;
};
int main()
{
    addemployee(1, "Ashwin Nagapure", 'M', 100);
   addemployee(2, "Sushant mukhedkar", 'M', 200);
    addemployee(3, "ashutosh tamboli", 'M', 300);
    addemployee(4, "aryan ojha", 'M', 400);
    addemployee(5, "gayatri borkar", 'F', 500);
   addemployee(6, "achal waypankar", 'F', 600);
    change_sal(1, 1000);
    disemp();
    _getch();
    return 0;
}
void addemployee(int id, char *name, char sex, int salary)
{
    struct employee help;
    FILE *fp;
    fp = fopen("Emp.txt", "rb+");
    if (fp == NULL)
        fp = fopen("Emp.txt", "wb");
    fseek(fp, 0, SEEK_END);
    help.id = id;
    strcpy(help.name, name);
    help.sex = sex;
    help.salary = salary;
    fwrite(&help, sizeof(help), 1, fp);
    fclose(fp);
}
void change_sal(int id, int new_salary)
{
    struct employee help;
    int size = sizeof(help);
    FILE *fp;
    fp = fopen("Emp.txt", "rb+");
    if (fp == NULL)
        fp = fopen("Emp.txt", "wb");
    while (fread(&help, sizeof(help), 1, fp) == 1)
    {
        if (help.id == id)
        {
            fseek(fp, -size, SEEK_CUR);
            help.salary = new_salary;
            fwrite(&help, sizeof(help), 1, fp);
            break;
        }
    }
    fclose(fp);
}
void delemp(int id)
{
    struct employee help;
    int size = sizeof(help);
    FILE *fp;
    fp = fopen("Emp.txt", "rb+");
    if (fp == NULL)
        fp = fopen("Emp.txt", "wb");
    while (fread(&help, sizeof(help), 1, fp) == 1)
    {
        if (help.id == id)
        {
            fseek(fp, -size, SEEK_CUR);
            help.salary = 0;
            fwrite(&help, sizeof(help), 1, fp);
            break;
        }
    }
    fclose(fp);
}
void disemp()
{
    struct employee help;
    FILE *fp;
    fp = fopen("Emp.txt", "rb");
    if (fp == NULL)
    {
        puts("\nFile is unable to open or did not exist.\nExiting. . .");
        exit(1);
    }
    while (fread(&help, sizeof(help), 1, fp) == 1)
    {
        printf("\n%2d", help.id);
        printf("\t%-20s", help.name);
        printf("\t%c", help.sex);
        printf("\t%d\n", help.salary);
    }
    fclose(fp);
}