#include <stdio.h>
#include <stdlib.h>

int main()
{
    float x,y,z,i,d;

    printf(" Informe quantos km foram rodados: ");
    scanf("%f", &x);
    printf(" Informe quantos litros foram colocados a cada abastecimento: ");
    scanf("%f", &y);
    printf(" Informe quantas vezes parou para abastecer: ");
    scanf("%f", &i);

    z = x / y ;
    printf("\n O resultado de km por litro eh: %.2f Km/L", z);

    d = z / i ;

    printf("\n O resultado de km por litros para cada abastecimento eh: %.2f", d);

    return 0;
}
