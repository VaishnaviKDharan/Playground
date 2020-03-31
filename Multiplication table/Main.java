#include<iostream>
using namespace std;
int main()
{
  int num,mul;
  cout<<"Enter n\nEnter m"<<endl;
  cin>>num>>mul;
  cout<<"The multiplication table of "<<num<<" is"<<endl;
  for (int i=1;i<=mul;i++)
  {
    cout<<i<<"*"<<num<<"="<<(i*num)<<endl;
  }
}
