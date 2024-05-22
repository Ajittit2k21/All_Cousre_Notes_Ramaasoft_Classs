#include<iostream>
#include<fstream>
using namespace std;
class Product{
	int id;
	char name[20];
	float price;
	public:
		void setData();
		void getData();
}p;
void Product::setData()
{
	cout<<"Enter product id:";
	cin>>id;
	cout<<"Enter product Name:";
	cin.ignore();
	cin.getline(name,20);
	cout<<"\nEnter product price:";
	cin>>price;
}
void Product::getData()
{
	cout<<"\nProduct Id:"<<id;
	cout<<"\nProduct Name:"<<name;
	cout<<"\nProduct price:"<<price;
	
}
int main()
{
//write data into file
ofstream fout("product.dat",ios::app);
 //read data from console input memory
 p.setData();
 //fileobject.write((char*)&object,sizeof(object));
 fout.write((char*)&p,sizeof(p));
 fout.close();
}
