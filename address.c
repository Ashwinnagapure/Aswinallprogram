#include<stdio.h>
#include<string.h>

struct address
{
    int house;
    int block ;
    char city[100];
    char state[100];
};

void printadd(struct address add );

void main()
{
    struct address add[2];

    printf("enter the info of the person 1 : ");
    scanf("%d",&add[0].house);
    scanf("%d",&add[0].block);
    scanf("%s",add[0].city);
    scanf("%s",add[0].state);
    
    printf("enter the info of the person 2 : ");
    scanf("%d",&add[1].house);
    scanf("%d",&add[1].block);
    scanf("%s",add[1].city);
    scanf("%s",add[1].state);


    printadd(add[0]);
   printadd(add[1]);
}


void printadd(struct address add)
{
    printf("the address of the person 1 and 2 is  \n house number = %d \n block number = %d\n city name = %s\n state name = %s\n",
    add.house,add.block,add.city,add.state );

   // printf("the address of the person 2 is  \n house number = %d \n block number = %d\n city name = %s\n state name = %s\n",
    //add.house,add.block,add.city,add.state );

}
