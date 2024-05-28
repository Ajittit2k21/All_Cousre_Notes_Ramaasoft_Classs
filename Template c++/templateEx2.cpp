#include<iostream>
using namespace std;
template<class T>
class Student{
	T name,marks,age;
	public:
	void setName( T x)
	{
		name=x;
		
	}
	
	T getName(){
		return name;
	}
	void setMarks(T y){
		marks=y;
	}
	T getMarks(){
		return marks;
	}
	void setAge(T z){
		age=z;
		
	}
	T getAge()
	{
		return age;
	}
	
};
int main()
{
	Student<string> objr;
	Student<float>objr2;
	Student<int>objr3;
	objr2.setMarks(500.56);
	objr3.setAge(21);
	
	objr.setName("anish");
	cout<<"\nname="<<objr.getName();
	cout<<"\nMarks="<<objr2.getMarks();
	cout<<"\nAge="<<objr3.getAge();
	
	return 0;
	
}


