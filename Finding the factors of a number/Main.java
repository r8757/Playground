#include <stdio.h>
int main() {
	//Type your code
  int n;
  scanf("%d",&n);
  int num=1;
  while(num<=n/2)
  {
    if(n%num==0)
      printf("%d\n",num);
    num++;
  }
  printf("%d",n);
    
	return 0;
}