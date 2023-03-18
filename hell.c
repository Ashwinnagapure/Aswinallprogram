#include<stdio.h>
int stk[5];
int top=-1;
int x;
void push()
{
  
    printf("enter the element\n");
    scanf("%d",&x);
    if(top==4)
    {
        printf("stack is overflow");
    }
    else
    {
        top++;
        stk[top]=x;
    }
}

void pop()
{
    if(top=-1)
    {
        printf("stack is underflow");
    }
    else
    {
        stk[top]=x;
        top--;
        printf("%d",stk[top]);
    }
}


void main()
{
    push();
    pop();

}