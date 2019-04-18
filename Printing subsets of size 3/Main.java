#include<stdio.h>
int main()
{
  //Type your code here
  int n;
  scanf("%d",&n);
  int arr[n];
  for(int i=0;i<n;i++)
    scanf("%d",&arr[i]);
  
  for(int i=0;i<n-1;i++){
  for(int k=i+1;k<n;k++){
  for(int j=k+1;j<n;j++){
     printf("(%d, %d, %d) ",arr[i],arr[k],arr[j]);
      }
  }
     printf("\n");
  }
  return 0;
}