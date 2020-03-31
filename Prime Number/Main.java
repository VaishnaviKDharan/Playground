#include<iostream>
using namespace std;
int prime(int n);
int main()
{
  //Type your code here.
  int num;
  cin>>num;
  prime(num);
}
int prime(int n)
{
  if(n%2==0)
    cout<<"Not a Prime Number";
  else 
    cout<<"Prime Number";
}
