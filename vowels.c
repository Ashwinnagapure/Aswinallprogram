#include<stdio.h>
#include<string.h>

int countvowels(char str []);

int main()
    {
        char str []= "ashwinnagapure";

        printf("the number of vowels are : %d",countvowels(str));
    }


int countvowels(char str [])

{
    int count = 0;

    for ( int i = 0; str[i] != '\0'; i++)

    {
        if ( str[i]=='a'|| str [i]=='e'|| str[i]=='i'|| str [i]=='o' || str[i]=='u')
        {
            count++ ;
        }
        
    }
    return count ;
    puts(str);
}