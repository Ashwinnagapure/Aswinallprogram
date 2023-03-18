#include <stdio.h>

int main(void) {
      int n,x,h,i;
      scanf("%d",&n);
      int a[n];
      for(i=0;i<n;i++)
      {
          scanf("%d %d",&x,&h);
          if(x>=h)
          a[i]=0;
          else
          a[i]=1;
         
      }
      
      for(i=0;i<n;i++)
      {
          if(a[i]==0){
          printf("YES");
           printf("\n");}
          else if(a[i]==1){
          printf("NO");
           printf("\n");}
      }
	return 0;
}

