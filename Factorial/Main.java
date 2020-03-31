#include<iostream>
using namespace std;
int fact(int n)
{
  if(n==1)
    return 1;
  else
    return n*fact(n-1);
}
int main()
{
  //Type your code here.
  int num;
  cout<<"Enter the value of n"<<endl;
  cin>>num;
  cout<<"The factorial of "<<num<<" is "<<fact(num);
}
