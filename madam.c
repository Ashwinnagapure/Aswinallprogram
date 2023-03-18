
 #include<stdio.h>


int search(int a,int arr[],int n){

	int m,re=0;
	for(m=0;m<n;m++){
	
		if(arr[m]==a){
		
			re =1;
		 	return re; 
		
		}
	
	}

	return re;

}
int main()
{
	int n,i,j=0,k=0,ispresent;
	printf("Enter No. of elements in array\n");
	scanf("%d",&n);
	
	int arr[n];
	int dup[n];
	
	printf("Enter elements in array\n");
	for(i=0;i<n;i++)
	{
		scanf("%d",&arr[i]);
	}
	
	printf("array\n");
	for(i=0;i<n;i++)
	{
		printf(" %d ",arr[i]);
	}
	
	printf("\n----------------------------------\n");
	for(i=0;i<n;i++)
	{
		for(j=i+1;j<n;j++){
		
			if(arr[i]==arr[j])
			{
				
				ispresent = search(arr[i],dup,n);				
				if(ispresent==0){
					dup[k] = arr[i];
					k++;
				
				}
				 
					
				
				
			}
		}
	}
	printf("\n--------------Duplicates --------------------\n");
	
	for(i=0;i<k;i++)
	{
		printf(" %d ",dup[i]);
	}
}