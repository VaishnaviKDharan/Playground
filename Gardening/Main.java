#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int row,col,tree;
  cin>>row>>col>>tree;
  if(tree>col && tree<=(2*col))
    cout<<"It is a mango tree";
  else if((row*col)-col>=tree && (tree>=(row*col)-(2*col)))
     cout<<"It is a mango tree";
  else
    cout<<"It is not a mango tree";
}