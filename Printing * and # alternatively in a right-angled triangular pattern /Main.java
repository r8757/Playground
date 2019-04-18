#include <stdio.h>
int main(){
	// Type your code here
  int n;
  scanf("%d",&n);
  int num=0;
  for(int i=1;i<=n;i++)
  {
    for(int j=1;j<=i;j++)
    {
      num=num+1;
      if(num%2==1)
      {
        printf("*");
      }
      else
        printf("#");
    }
    printf("\n");
  }
          
  	return 0;
}