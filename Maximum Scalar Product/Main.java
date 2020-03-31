#include<iostream>
using namespace std;
int main()
{
int num,temp,sum=0;
  cin>>num;
  int arr[num],arr1[num];
  for (int i=0;i<num;i++)
  {
    cin>>arr[i];
  }
  for(int i=0;i<num;i++)
  {
    cin>>arr1[i];
  }
  for(int i=0;i<num;i++)
  {
    for(int j=0;j<num;j++)
    {
      if(arr[i]>arr[j])
      {
        temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;  
      }
      if(arr1[i]>arr1[j])
      {
        temp=arr1[j];
        arr1[j]=arr1[i];
        arr1[i]=temp;  
      }
    }
  }
    for(int i=0;i<num;i++)
    {
     sum=sum+(arr[i]*arr1[i]);
    }
  cout<<sum;  
}
