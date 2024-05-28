#include<iostream>
#include<vector>
using namespace std;

int main(){
	vector<int>v1{10,20,30,40,50};
	
	v1.at(0)=11;
	v1.at(1)=22;
	v1.at(2)=33;
	v1.at(3)=44;
	v1.at(4)=55;
	for(int val:v1){
		cout<<val<<endl;
	}
}
