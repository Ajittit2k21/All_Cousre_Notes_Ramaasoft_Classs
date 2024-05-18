#include<stdio.h>
main()
{
	int size,r,c;
//	printf("Enter size of Element Array:\n");
//	scanf("%d",size);
	int A[5],B[5];
	printf("Enter A array values:\n");
	for(r=0;r<5;r++)
	{    
		printf("A[%d]=",r);
		scanf("%d",&A[r]);
		
	}printf("\n");

	printf("Enter B array values:\n");
	for(r=0;r<5;r++)
	{    
		printf("B[%d]=",r);
		scanf("%d",&B[r]);
		
	}printf("\n");

	printf("sum Array A and B\n");
	for(r=0;r<5;r++)
	{
		printf("%d",A[r]+B[r]);
		printf("\n");
	}
}
