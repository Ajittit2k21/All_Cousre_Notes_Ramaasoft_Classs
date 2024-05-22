#include<iostream>
#include<fstream>
#include<string.h>
using namespace std;

class Passwords{
	char name[20];
	char pass[20];
	char type[20];
	public:
		Passwords()
		{
          	 ofstream fout("password.dat",ios::app);
			 fout.close();	
			
		}
	void setPassword()
	{
		  	 ofstream fout("password.dat",ios::app);
		     cout<<"Enter your name:";
		     cin>>name;
		     cout<<"\nEnter password:";
		     cin>>pass;
		     cout<<"\nEnter user type:";
		     cin>>type;
		     fout.write((char*)this,sizeof(*this));
	        fout.close();
	}
	void changePassword()
	{
		//modify
	}
	bool matchPassword()
	{
		char inname[20];
		char inpass[20];
		char intype[20];
		
		//input
		cout<<"\nEnter name:";
		cin>>inname;
		cout<<"\nEnter password";
		cin>>inpass;
		cout<<"\nEnter type:";
		cin>>intype;
		ifstream fin("password.dat",ios::in);
		while(fin.read((char*)this,sizeof(*this)))
		{
			if(!strcmp(inname,name))
			{
				if(!strcmp(inpass,pass))
				{
					if(!strcmp(intype,type))
					{
					    return true;	
					}
					else
					{
						return 0;
					}
				}
				else
				{
					return 0;
				}
			}
			else
			{
				return 0;
			}
		}
		
	}
};
class ContentsCCPP{
	
	
	
};
main()
{
	ofstream fout("password.dat",ios::app);fout.close();
	Passwords p;
	
	bool ans=p.matchPassword();
	cout<<ans;
	if(ans)
	{
		cout<<"Login Successfully";
	}
	else
		cout<<"Login falied";
	
}
