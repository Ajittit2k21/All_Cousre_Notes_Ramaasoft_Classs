//1kg --->atta(100/pizza)
#include<iostream>
using namespace std;
int main()
{
	int n;
	cout<<"\nEnter size";
	cin>>n;
	for(int r=1;r<=n;r++)
	{
		
		for(int j=1;j<=n;j++)
		{
			if(j==1||r==1 ||r==n || j==n)
			
			cout<<"*";
			else
			cout<<" ";
		}
		cout<<"\n";
		
	}
	
}

