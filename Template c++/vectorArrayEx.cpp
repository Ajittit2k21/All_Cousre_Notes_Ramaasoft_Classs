#include<iostream>
#include<vector>
using namespace std;
int main()
{
	vector<int> v1{10,20,30,40};
	for(int r=0;r<v1.size();r++)
	{
		cout<<v1[r]<<endl;
	}
	for(int r:v1)
	{
		cout<<r<<endl;
	}
}
