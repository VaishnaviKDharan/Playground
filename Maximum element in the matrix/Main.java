#include<iostream>
using namespace std;
int main() {
  int row,col;
  cin>>row>>col;
  int max[row][col];
 for(int i=0;i<row;i++)
 {
   for(int j=0;j<col;j++)
   {
     cin>>max[i][j];
   }
 }
   int max_row_element = max[0][0];
  for (int i = 0; i < row; i++) {
     
   for (int j = 1; j < col; j++) {
      if (max[i][j] > max_row_element)
         max_row_element = max[i][j];
   }
  
}
   cout << "The maximum element is "<<max_row_element << endl;
}
