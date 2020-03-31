#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int num,temp,n,sum=0;
  cout<<"Enter the value of n"<<endl;
  cin>>num;
   n=num;
  while(num!=0)
  {
    temp=num%10;
    sum+=temp;
    num=num/10;
  }
  cout<<"The sum of digits in "<<n<<" is "<<sum;
}
