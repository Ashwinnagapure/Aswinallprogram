#include <stdio.h>
#include <conio.h>
#include <stdlib.h>
struct hospital
{
char name[50];
char adrress[50];
int age;
int blood;
} b;
int main()
{
FILE *fp;
char another = 'y';

fp = fopen("Hospital_report.DAT", "wb");
if (fp == NULL)
{
printf("cannot open target file!\n");
exit;
}
while (another == 'Y' || another == 'y')
{
printf("\t\tInformation of Blood donor\n");
printf("\t\t**************************\n\n\n");
printf("Enter the name of the donor: ");
scanf("%s", b.name);
printf("\n\nenter the address of the donor : ");
scanf("%s", b.adrress);
printf("\n\nenter the age: ");
scanf("%d", &b.age);
printf("\n\nenter the blood group of the donor (1/2/3/4): ");
scanf("%d", &b.blood);
fprintf(fp, "name =%s\taddress=%s\tage=%d\tblood group=%d\n", b.name, b.adrress, b.age, b.blood);
printf("\n\n\nenter more information(Y/N): ");
fflush(stdin);
another = getch();
}
fclose(fp);
}
