#include <stdio.h>
#include<math.h>
int main() {
	int n,fd,ld,c,t,s;
  scanf("%d",&n);
  t=n;
  c=0;
  while(t!=0)
  {
    c++;
    t/=10;
  }
  fd=(int)(n/(pow(10,(c-1))));
  ld=n%10;
  s=fd+ld;
  printf("%d",s);
	return 0;
}