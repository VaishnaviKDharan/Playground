#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char a[100];
 int temp;
 cin>>a;
 int n= strlen(a);
  for(int i=0;i<n-1;i++)
  {
    for(int j=i+1;j<n;j++)
    {
      if(a[i]>a[j])
      {
        temp=a[i];
        a[i]=a[j];
        a[j]=temp;
      }
    }
  }
 cout<<"The output string is "<<a;

}
