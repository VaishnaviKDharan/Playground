#include<iostream>
using namespace std;
int main()
{
  int num,sum=0,sum1=0;
  cin>>num;
int arr[num+1];
  for(int i=0;i<num;i++)
  {
    cin>>arr[i];
    {
      if(arr[i]%2==0)
      {
        sum=sum+arr[i];
      }
      else
      {
        sum1=sum1+arr[i];
      }
    }
  } 
  cout<<"The sum of the even numbers in the array is "<<sum<<endl;
  cout<<"The sum of the odd numbers in the array is "<<sum1<<endl;  
}
