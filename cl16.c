#include<stdio.h>
int stack[5],item,i,top=-1,op;
void push();
void pop();
void show();
int main()
{
    printf("1 for push\n2 for pop\n3 for show\n");
    while(1)
    {
        printf("enter the option : ");
        scanf("%d",&op);
        switch(op)
        {
            case 1: push();
            break;
            case 2: pop();
            break;
            case 3: show();
            break;
            default: printf("enter the valid option");
        }
    }
    return 0;

}
void push()
{
    if(top==4)
    {
        printf("stack is overflow");
    }
    else{
        printf("enter the push element : ");
        scanf("%d",&item);
        top=top+1;
        stack[top]=item;

    }
}
void pop()
{
    if(top==-1)
    {
        printf("stack is empty");
    }
    else
    {
        printf("popped elemeny %d\n",stack[top]);
        top=top-1;
    }
}
void show()
{
    printf("array elements\n");
    for(i=top;i>=0;i--)
    {
        printf("%d\n",stack[i]);
    }
}