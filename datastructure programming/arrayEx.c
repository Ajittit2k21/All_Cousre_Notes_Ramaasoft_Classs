#include<stdio.h>
void insert();
int A[50],size,num,pos,i;
int main()
{
	
	printf("\nEnter size of Array:");
	scanf("%d",&size);
	printf("Enter Element of Array:");
	for(i=0;i<size;i++)
	{
		scanf("%d",&A[i]);
	}
	insert(A,size);
	
}
void insert(int *A,int size)
{
	printf("Enter data you want to Insert:\n");
	scanf("%d",&num);
	printf("\nEnter position:");
	scanf("%d",&pos);
	for(i=size-1;i>=pos-1;i--)
	{
		A[i+1]=A[i];
	}
	A[pos-1]=num;
	size++;
	if(pos<=0 || pos>size+1)
	{
		printf("invaild position");
	}
	else
	for(i=0;i<size;i++)
	{
		printf("%d",A[i]);
		printf("\n");
	}
	
}
	
	

