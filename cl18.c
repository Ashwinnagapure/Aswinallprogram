#include<stdio.h>
int top=-1,i;
char stack[20];
int precedence(char a)
{
    if(a=='*')
    return 4;
    else
    if(a=='/')
    return 3;
    else
    if(a=='+'||a=='-')
    return 1;
    else
    if(a==')'
    return 0;
    else
    return 0;
}
int pop()
{
    top=top-1;
    return top;
}
int push(char j)
{
    top++;
    stack[top]=j;
    return stack[top];
}
int main()
{
    char a[10];
    printf("entre the equation");
    gets(a);
    push('#');
    for (i=0;a[i]!='\0';i++)
    {
        if(precedence(a[i])==0)
        printf("%c",a[i]);
        else
        {
        if(precedence(a[i])>precedence(stack[top]))
        push(a[i]);
        else
        if(precedence(a[i])<=precedence(stack[top]))
        {
            printf("%c",stack[top]);
            pop();
        }
        }

    }
while(top!=-1)
{
    printf ("%c",pop());
    
}
}