#include<iostream>
using namespace std;
class Garden
{
  public:
  int r;
  float area;
  void read();
  void print();
};
void Garden::print()
{
   area=0;
   area=3.14*r*r;
   cout<<"Area of Circle : "<<area;
}
 void Garden::read()
 {
  cout<<"Enter the value of Radius :"<<endl;
  cin>>r;
 }
int main()
{
  Garden g; 
  g.read();
  g.print();
  return 0;
}
