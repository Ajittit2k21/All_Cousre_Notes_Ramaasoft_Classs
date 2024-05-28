#include<iostream>
using namespace std;
int main()
{
	int size ,*A;
	cout<<"Enter size of Array:\n";
	cin>>size;
	 A=new int[size];
	for(int r=0;r<size;r++)
	{
		cout<<"A["<<r<<"]=";
		cin>>A[r];
	}
	cout<<"Values of Array:\n";
	for(int r=0;r<size;r++)
	{
		cout<<"A["<<r<<"]="<<A[r];
		cout<<"\n";
	}
}

