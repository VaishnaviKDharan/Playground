#include<iostream>
using namespace std;

int main()
{
  int i=1,n,t1 =0,t2 =1,sum=0;
       cin>>n;
		while (i<n)
        { 
     	 sum= t1+t2;
            t1=t2;
            t2=sum;
          i++;
        }
   cout<<t1<<endl;
  return 0;
}
