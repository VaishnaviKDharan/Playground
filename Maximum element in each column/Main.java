#include <bits/stdc++.h> 
using namespace std; 
int main() 
{ 
  int n,m;
  cin>>n>>m;
  int max[n][m];
  for(int i=0;i<n;i++)
  {
    for(int j=0;j<m;j++)
		cin>>max[i][j];
    }
      for (int i = 0; i < m; i++)
      { 
			int maxm = max[0][i]; 
			 for (int j = 1; j <n; j++)
             { 
            if (max[j][i] > maxm) 
                maxm = max[j][i]; 
       		 } 
        cout << maxm << endl; 
    } 
  return 0; 
}
