#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,sum=0;
  cout<<"Enter the number of elements in the array"<<endl;
  cin>>n;
  int a[n];
  cout<<"Enter the elements in the array"<<endl;
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
      if(a[i]%2==0)
       sum+=a[i];
  }
  cout<<"The sum of the even elements in the array is "<<sum;
}
