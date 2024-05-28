#include<iostream>
#include<vector>
using namespace std;
int main()
{ 

//	cout<<"Enter size of Array";
//	int size;
//	cin>>size;
//x
	
	vector<int>v1{10,21,30,43,50};
	vector<int>v2(v1.begin(),v1.begin()+5);
	int sum=0;
	
	
	cout<<v1.at(0)<<endl;
	cout<<v1.at(2)+v1.at(3);
	v1.push_back(60);
	v1.push_back(70);
	v1.pop();
		
	for(const int&i:v1)
	{
		cout<<i<<endl;
	}
	
}
