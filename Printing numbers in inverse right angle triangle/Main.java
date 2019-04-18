#include <stdio.h>
int main() {
    // Type your code here
  int n;
  scanf("%d",&n);
  for(int i=1;i<=n;i++)
  {
    int starcount=n-i+1;
    for(int j=1;j<=n-i+1;j++)
    {
      printf("%d",starcount);
      starcount=starcount-1;
    }
    printf("\n");
  }
	return 0;
}