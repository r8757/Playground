#include<stdio.h>
int main()
{
  //fill the code
  int n;
  scanf("%d",&n);
  int arr[n];
  for(int i=0;i<n;i++)
  {
    scanf("%d",&arr[i]);
  }
 
    int max=arr[0];
    for(int j=1;j<n;j++){
      if(arr[j]>arr[max]){
        max=j;
      }
    }
  printf("%d",arr[max]);
  
  
  return 0;
}