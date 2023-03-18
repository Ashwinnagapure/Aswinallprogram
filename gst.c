#include <stdio.h>
void main()
{
    float item[3];

    printf("enter the price of item 1 : ");
    scanf("%f", &item[0]);

    printf("enter the price of item 2 : ");
    scanf("%f", &item[1]);

    printf("enter the price of item 3 : ");
    scanf("%f", &item[2]);

    printf("the price of item 1  with 18 percent gst is %f\n", (item[0] + (0.18 * item[0])));
    printf("the price of items 2 with 18 percent gst is %f\n", (item[1] + (0.18* item[1])));
    printf("the price of items 3 with 18 percent gst is %f\n", (item[2] +( 0.18 * item[2])));
}