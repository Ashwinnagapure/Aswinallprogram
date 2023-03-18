#include <stdio.h>
int main()
{
   int perimeter, area;
   int lenght = 2, breadth = 5;

   area = lenght * breadth;
   printf("the area of the rectangle is :%d \n", area);

   perimeter = 2 * (lenght + breadth);
   printf("the perimeter of the rectangle is : %d \n", perimeter);

   if (area >= perimeter)
   {
      printf("the area of rectangle is greater ");
   }
   else if (perimeter >= area)
   {
      printf("the perimeter of rectangle is greater ");
   }

   else
   {
      printf("the condition is false ");
   }

   return 0;
}
