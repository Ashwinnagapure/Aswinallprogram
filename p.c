#include<stdio.h>
int revarr(int a[],int n);
void main()
{ int n,a[100];
    printf("enter the elements of array: ");
    scanf("%d",&n);
    for (int i = 0; i < n; i++)
    {
        scanf("%d",&a[i]);
    
    }
    
    for (int i = 0; i < n; i++)
   {
    printf("array elements %d:%d\n",i+1,a[i]);

   }
 revarr(a,n);
}
int revarr(int a[],int n)
{
    for (int i = n; i>0 ;i--)
    {
       printf("reverse array %d :%d\n",i,a[i]);
    }
    
}
