#include<iostream>
using namespace std;
int i=0;
class Sample{
	public:
	Sample()
	{
		i++;
		cout<<i<<endl;	
	}
};
int main()
{
	Sample a[3000];
	return 0;
}
