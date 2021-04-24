#include <stdio.h>
#include <stdlib.h>

int main()
{
    int linha = 10;
    int coluna ;

    while ( linha >= 1 ){
            coluna = 1 ;
    while ( coluna <= 10){
        printf("%s", linha % 2 ? "<" : ">");
        coluna++;
    }
    linha--;
    printf("\n");
    }
    return 0;
}
