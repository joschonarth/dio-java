# Calculando Consumo e Desconto de Telefonia

## 1 / 2 - Calculando o Consumo de Crédito em Ligações Telefônicas

## Descrição
Implemente um sistema para monitorar o uso de crédito em ligações telefônicas. Cada ligação consome uma quantidade de crédito de acordo com a sua duração e o tipo da ligação (local, nacional ou internacional). Desenvolva uma função que calcule o consumo de crédito de um cliente baseado nas suas ligações.

Cada ligação é representada por um triplo de valores: a duração da ligação (em minutos), o tipo da ligação e o valor do crédito por minuto de acordo com o tipo de ligação.

## Entrada
A entrada deverá receber:

* Um número inteiro n, representando o número de ligações.
* Para cada ligação, uma linha contendo os valores a seguir separados por vírgula:
    * Um número inteiro representando a duração da ligação em minutos.
    * Uma string representando o tipo da ligação (`local`, `nacional`, ou `internacional`).
    * Um número decimal representando o valor do crédito por minuto para aquele tipo de ligação.

## Saída
A função deverá retornar o consumo total de crédito em uma única linha. O resultado deve ser um número decimal com duas casas decimais.

## Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

| Entrada | Saída |
| ------- | ----- |
| 3 | 3.00 |
| 10,local,0.10 | |
| 5,nacional,0.20 | |
| 2,internacional,0.50 | |

| Entrada | Saída |
| ------- | ----- |
| 2 | 2.05 |
| 20,local,0.05 | |
| 3,internacional,0.35 | |

| Entrada | Saída |
| ------- | ----- |
| 1 | 0.50 |
| 5,nacional,0.10 | |