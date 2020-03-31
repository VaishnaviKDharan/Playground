#include<iostream>
using namespace std;
int main()
{
    int n,i;
      cin>>n;
      int a[n],s=0;
      for(i=0;i<n;i++)
    {
      cin>>a[i];
    }
      cout<<"1";
      for(i=1;i<n;i++)
    {
        if(a[i]>a[i-1])
        {
          s+=2;
          cout<<"\n"<<s;
        }
      else
        cout<<"\n1";
    }
}