#include<stdio.h>
int main()
{
  //Type your code here
  int arr_size;
  scanf("%d",&arr_size);
  int arr[arr_size];
  for(int i=0;i<arr_size;i++)
  {
    scanf("%d",&arr[i]);
  }
  int n1;
  int n2;
  scanf("%d",&n1);
  scanf("%d",&n2);
  
  int cnt1=0;
  int index_1;
 for(int j=0;j<arr_size;j++)
  {
    if(n1==arr[j])
    {
      cnt1=1;
      index_1=j;
      break;
    }
  }
  if(cnt1==1)
  {
    printf("%d\n",index_1);
  }
  else
  {
    printf("-1\n");
  }
  
  int cnt2=0;
  int index_2;
 for(int i=0;i<arr_size;i++)
  {
    if(n2==arr[i])
    {
      cnt2=1;
      index_2=i;
      break;
    }
  }
  if(cnt2==1)
  {
    printf("%d\n",index_2);
  }
  else
  {
    printf("-1\n");
  }
  return 0;
}