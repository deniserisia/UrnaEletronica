#include <stdio.h>
#include <stdlib.h>

int main()
{
    float a,b,c ;

    printf("\n Digite as horas trabalhadas: ");
    scanf("%f", &a);
    printf("\n Digite o salario por hora do funcionario: ");
    scanf("%f", &b);

    c = a * b ;
    printf("\n O salario total eh: %.2f", c);

    return 0;
}
