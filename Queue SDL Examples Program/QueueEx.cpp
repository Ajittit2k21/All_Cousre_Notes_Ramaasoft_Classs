#include<iostream>
#include<queue>
using namespace std;
int main()
{
	queue<int> q;
	q.push(10);
	q.push(20);
	q.push(30);
	q.push(40);
	q.push(50);
//	while(!q.empty()){
//		
//		cout<<q.front()<<endl;
//		q.pop();
//		cout<<"size of queue"<<q.size()<<endl;
//		
//	
//			
//	}
	for(int r=0;r<q.size();r++)
	{
		if(q.back())
		{
			cout<<q.front()<<endl;
			q.pop();
		}
	}
}
