#include<iostream>
#include<fstream>
using namespace std;
class Product{
	
	int id;
	char str[20];
	float price;
	public:
		Product(){
			ofstream fout("product1.txt",ios::app);
			fout.close();
		}
		void setProduct()
		{
			ofstream fout("product1.txt",ios::app);
			cout<<"\nEnter id:";
			cin>>id;
			cout<<"\nEnter name";
			cin.ignore();
			cin.getline(str,20);
			cout<<"\nEnter price:";;
			cin>>price;
			//fout.write((int*)this,sizeof(this));
			fout.write((char*)this,sizeof(this));
			//fout.write((float*)this,sizeof(this));
			fout.close();
		}
		void getProduct()
		{
			
		}
	
};
int main()

{
	Product p;
	p.setProduct();
}
	

