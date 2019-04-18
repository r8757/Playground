#include<stdio.h>
int main()
{
  //Type your code here
  
  int n,count=0;
  scanf("%d",&n);
  int arr[n];
  for(int i=0;i<n;i++)
    scanf("%d",&arr[i]);
  for(int i=0;i<n;i++){
      if(arr[i]==0)
        count++;
  }
  for(int i=0;i<n;i++)
  {
    if(arr[i]!=0)
      printf("%d ",arr[i]);
  }
  for(int i=n-count;i<n;i++)
  {
      printf("0 ");
  }
  return 0;
}