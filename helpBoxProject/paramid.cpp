#include<iostream>
using namespace std;
int main()
{
	int n;
	cout<<"Enter size:";
	cin>>n;
	int space=n-1;
	for(int r=1;r<=n;r++)
	{
		for(int s=1;s<space;s++)
		{
			cout<<" ";
			
		}space--;
		for(int j=1;j<=2*r-1;j++)
		{
			cout<<"*";
		}
		cout<<"\n";
	}
	
}
