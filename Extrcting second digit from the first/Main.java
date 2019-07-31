#include <stdio.h>
#include<math.h>
int main() {
	int n,t,c,d;
    scanf("%d",&n);
    c=0;
  t=n;
    while(t!=0)
    {
      c++;
      t/=10;
    }
  d=(int)(n/(pow(10,(c-2))));
  d=d%10;
  printf("%d",d);
	return 0;
}