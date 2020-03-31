#include<iostream>
using namespace std;
int find(int n,int v) 
{ 
    if (n==0)  
        return 0;  
    else
        return (n%v+10*find(n/v,v)); 
}
int main()
{
  int n,a;
  cout<<"Enter the value of n"<<endl;
  cin>>n;
  cout<<"Enter the base to which you want to convert "<<endl;
  cin>>a;
   cout<<"The number in base "<<a<<" is "<<find(n,a);
}
