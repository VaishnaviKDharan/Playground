#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
      int n=0;
      float mark=0;
      int count=0;
      while(n>=0)
      {
         if(count==3) 
           break;       
         cin>>n;
         if(n%2!=0 && n>=0)
         {
            ++mark;
            ++count;      
          }
        else if(n<0)
        {
          mark=(float)(mark-1);
        }
        else
        {
          mark=(float)(mark-0.5);
        }       
     }
        cout<<fixed<<setprecision(1)<<mark;
}
