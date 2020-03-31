#include<iostream>
#include<cstring>

using namespace std;
int main()
{
  //Type your code here.
  char a[1000],b[1000];
  cin>>a>>b;
  if(strcmp(a,b)==0)
    cout<<"It is correct";
  else 
    cout<<"It is wrong";
}
