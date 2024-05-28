#include<iostream>
using namespace std;
template<class T>
class Sample{
	T var;
	public :
		void setVar(T x)
		{
			var =x;
		}
		T getVar(){
			return var;
		}
};
int main(){
	Sample<int>objr;
	Sample<double>objr1; 
	objr.setVar(100);
	cout<<"\nvalue of object is:"<<objr.getVar();
	objr1.setVar(100.23);
	cout<<"\nvalue of object is :"<<objr1.getVar();
	return 0;
}
