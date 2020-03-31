#include<iostream>
using namespace std;
int main()
{
  int a,b;
  cin>>a;
  int m[a];
  for(int i=0;i<a;i++)
    cin>>m[i];
  cin>>b;
  int n[b];
  if(a!=b)
  {
    cout<<"Incompatible";
    return 0;
  }
  for(int i=0;i<b;i++)
  {
    cin>>n[i];
    if(m[i]<n[i])
    {
      cout<<"Incompatible";
      return 0;
    }
  }
  cout<<"Compatible";
}
