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
ifstream fin("product.dat",ios::in);
 //fileobject.read((char*)&object,sizeof(object));
 /*fin.read((char)&p,sizeof(p));
 p.getData();
 fin.read((char*)&p,sizeof(p));
 p.getData();
 */
 while(fin.read((char*)&p,sizeof(p)))
	{
	
	p.getData();}
 fin.close();
}
