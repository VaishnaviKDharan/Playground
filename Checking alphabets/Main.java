#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  char c;
  cin>>c;
  if((c>='a' && c<='z') || (c>='A' && c<='Z'))
    if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ||c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
    cout<<"Vowel";
    else
    cout<<"Consonant";
  else
    cout<<"Not an alphabet";
}