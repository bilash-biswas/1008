#include<stdio.h>
int main()
{
   int NUMBER,HOURS;
   double AMOUNT,SALARY;
   scanf("%d",&NUMBER);
   scanf("%d",&HOURS);
   scanf("%lf",&AMOUNT);

   SALARY = (double)HOURS * AMOUNT;
   printf("NUMBER = %d\n", NUMBER);
   printf("SALARY = U$ %.2lf\n", SALARY);

   return 0;
}
