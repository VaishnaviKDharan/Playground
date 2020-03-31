#include<iostream>
using namespace std;
int fib(int num)
{
  int a=0,b=1,sum=0;
  for(int i=2;i<num;i++)
  {sum=a+b;
  a=b;
  b=sum;
  }
  return sum;
}
int main()
{
  //Type your code here.
  int n;
  cout<<"Enter the value of n"<<endl;
  cin>>n;
  cout<<"The term "<<n<<" in the fibonacci series is "<<fib(n); 
}
