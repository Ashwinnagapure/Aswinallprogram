#include <stdio.h>

void main()
{
  char a;
  int number = 0;

  while (number <= 255)
  {
    printf(" %d the ascii chracter is  %c \n", number + 1, number);
    number++;
  }
}
