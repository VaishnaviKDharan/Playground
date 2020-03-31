#include<iostream>
using namespace std;
int main()
{
 int num,s,sum=0;
  cin>>num>>s;
  int arr[num];
  for(int i=0;i<num;i++)
  {
    cin>>arr[i];
    sum=sum+arr[i];
  }
  if(sum<=s)
  {
    cout<<"YES";
  }
  else
  {
    cout<<"NO";
  }   
}
