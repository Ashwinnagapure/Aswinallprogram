#include <stdio.h>
#include <stdlib.h>
struct blood
{
char name[50];
char address[50];
int age;
int blood;
} b;
int main()
{
FILE *fp;
char ch;

fp = fopen("C:\\Users\\ashun\\OneDrive\\Desktop\\c language\\cl\\Hospital_report.DAT", "rb");
if (fp == NULL)
{
printf("cannot open source file!\n\n");
exit;
}
while (fscanf(fp, "%s\t%s\t%d\t%d", &b.name, &b.address, &b.age, &b.blood) != EOF)
if (b.age < 25 && b.blood == 2)
{
printf("\nname=%s\t address=%s\tage=%2d\t blood=%d\n", b.name, b.address, b.age, b.blood);
}
fclose(fp);
}