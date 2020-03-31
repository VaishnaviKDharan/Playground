#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int fa,fd,fs,aa,ad,as,sa,sd,ss;
  int flip,snap,amazon;
  cin>>fa>>fd>>fs>>sa>>sd>>ss>>aa>>ad>>as;
  flip=fa-(fa*fd/100)+fs;
  cout<<"In Flipkart Rs."<<flip<<"\n";
  snap=sa-(sa*sd/100)+ss;
  cout<<"In Snapdeal Rs."<<snap<<"\n";
  amazon=aa-(aa*ad/100)+as;
  cout<<"In Amazon Rs."<<amazon<<"\n";
  if(flip<=snap && flip<=amazon)
    cout<<"He will prefer Flipkart";
  else if(snap <flip && snap<amazon)
    cout<<"He will prefer Snapdeal";
  else if(amazon<flip && amazon<snap)
    cout<<"He will prefer Amazon";
  
}