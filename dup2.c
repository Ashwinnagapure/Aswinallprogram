#include<stdio.h>
int main()
{
   int n,k  ;

   printf("size of an array is  :");
   scanf("%d",&n);
  int arr[n], dup[n];
   printf("the array elements are : \n");
   for (int i = 0; i < n; i++)
   {
    scanf("%d",&arr[i]);
   }

   /*for (int i = 0; i < n; i++)
   {
    printf("the array elemets are : %d",arr[i]);
   }
   printf("\n"); */
   
   for (int i = 0; i < n ; i++)
   {
    for (int j = i+1; j <n; j++)

    
    {
        if (arr[i]==arr[j])
        {
         printf("duplicate %d\n",arr[i]);
         dup[k]=arr[i];
         k++;
        } 
    }

   for ( int i = 0; i <k; i++)
   {
    printf("%d\n",dup[i]);
   }
   
   }
   
   







}