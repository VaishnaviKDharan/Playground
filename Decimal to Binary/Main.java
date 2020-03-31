#include<iostream>
using namespace std;

int find(int n) 
{ 
    if (n==0)  
        return 0;  
    else
        return (n%2+10*find(n/2)); 
} 
  
 
int main() 
{ 
  int num;
  cin>>num;
  cout<<find(num);
    return 0; 
}
