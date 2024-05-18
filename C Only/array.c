#include<stdio.h>
main(){
	
	int *A,r,size,max=0,min,sum=0;
	printf("Enter  size of Array:");
	scanf("%d",&size);
	//A=(int*)malloc(size*4);
	for(r=0;r<size;r++)
	{
		printf("A[%d]=",r);
		scanf("%d",(A+r));
	//	scanf("%d",&A[r]);
		
	}
	printf("\n%d values of Array",size);
	for(r=0;r<size;r++)
	{
		printf("\nA[%d]=%d",r,*(A+r));
		
	}
	for(r=0;r<size;r++)
	{
		if(max<=A[r])
		{
			max=A[r];
		}
	}
	min=max;
	for(r=0;r<size;r++)
	{
		if(min>=A[r])
		{
			min=A[r];
		}
	}
	for(r=0;r<size;r++)
	{
		sum+=A[r];
	}
	printf("\nsum=%d",sum);
	printf("\nmax=%d",max);
	printf("\nmin=%d",min);
	
	
	
	
	
	
	
}
