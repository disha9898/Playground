#include <stdio.h>
#include<math.h>
int main() {
	int n,c=0,s=0,i,t,d;
  scanf("%d",&n);
  t=n;
  while(t!=0)
  {
    t=t/10;
    c++;
  }
  t=n;
  while(t!=0)
  {
    d=t%10;
    s=s+(int)(pow(d,c));
    t=t/10;
  }
    if(s==n)
      printf("Armstrong Number");
  else
    printf("Not an Armstrong Number");
	return 0;
}