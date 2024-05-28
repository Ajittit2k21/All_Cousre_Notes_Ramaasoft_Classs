#include<iostream>
#include<vector>
using namespace std;
class Student{
	int rno;
	string name;
	float marks;
	
	public:
	
	void setData(){
		cout<<"\nEnter rno";
		cin>>rno;
		cout<<"\nEnter name";
		cin.ignore();
		getline(cin,name);
		cout<<"\nEnter marks";
		cin>>marks;
	}
	void getData(){
		cout<<"\nRno=>"<<rno;
		cout<<"\nName=>"<<name;
		cout<<"\nMarks=>"<<marks;
	}
		
};
int main(){
	
	Student std;
	
	std.setData();
	std.getData();
	
	//vector<char>v{'a','b','c'};
		
}
