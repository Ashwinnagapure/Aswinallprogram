// Write a program in C to accept a grade and declare the equivalent description

#include<stdio.h>
void main()
{
  char grade;

  printf("enter the grade student get in exam : ");
  scanf("%c",&grade);

  if (grade =='A')
  {
    printf("excellent");
  }
  else if (grade=='B')
  {
    printf("Very Good");
  }
  else if (grade=='C')
  {
    printf("Good");
  }
  else if (grade=='D')
  {
    printf("Average");
  }

}
  



