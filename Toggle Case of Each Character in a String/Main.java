#include<iostream>
using namespace std;
int main()
{
	char a[50];
  cin>>a;
  for(int i=0;a[i]!='\0';i++)
  {
    if(a[i]>=65 &&a[i]<=92)
    {
      a[i]=a[i]+32;
      cout<<a[i];
    }
    else
    {
      a[i]=a[i]-32;
      cout<<a[i];
     }
  }
}
