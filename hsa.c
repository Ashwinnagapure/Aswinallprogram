
#include <stdio.h>

#include <conio.h>

#include <string.h>

#include <process.h>

#include <stdlib.h>

#include <direct.h>

struct contact

{

    long ph;

    char name[20], add[20], email[30];

} list;

char query[20], name[20];

FILE *fp, *ft;

int i, n, ch, l, found;

int main()

{

main:

    system("cls"); /* ************Main menu ***********************  */

    printf("\n\t **** Welcome to Contact Management System ****");

    printf("\n\n\n\t\t\tMAIN MENU\n\t\t=====================\n\t\t[1] Add a new Contact\n\t\t[2] List all Contacts\n\t\t[3] Search for contact\n\t\t[4] Edit a Contact\n\t\t[5] Delete a Contact\n\t\t[0] Exit\n\t\t=================\n\t\t");

    printf("Enter the choice:");

    scanf("%d", &ch);

    switch (ch)

    {

    case 0:

        printf("\n\n\t\tAre you sure you want to exit?");

        break;

        /* ********************Add new contacts***********  */

    case 1:

        system("cls");

        fp = fopen("contact.dll", "a");


    }
}