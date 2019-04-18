#include <stdio.h>
int main() {
	//Type your code
  int n;
  int sum=0;
  scanf("%d",&n);
  for(int i=1;i<=n;i++)
  {
    sum=sum+i;
  }
  printf("%d",sum);
	return 0;
}