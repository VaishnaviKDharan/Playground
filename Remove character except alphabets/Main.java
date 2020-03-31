#include<iostream>
using namespace std;
int main()
{
 char a[200];
  int i;
  cin>>a;
  for(i=0;a[i]!='\0';i++)
  {
    if(a[i]>='a'&& a[i]<='z'||a[i]>='A'&& a[i]<='Z')
      cout<<a[i];
  }
}

