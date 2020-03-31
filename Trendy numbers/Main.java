#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  if(n<=999 & n>=100)
  {
  n=(n/10)%10;
  if(n%3==0)
	cout<<"Trendy Number";
  else 
    cout<<"Not a Trendy Number";
  }
  else 
    cout<<"Not a Trendy Number";
}
