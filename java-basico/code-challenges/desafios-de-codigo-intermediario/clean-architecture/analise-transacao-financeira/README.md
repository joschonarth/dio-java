# Explorando o Clean Architecture em Soluções de Desafios de Códigos

## 2 / 3 - Análise de Transações Financeiras


## Descrição
Neste desafio, você desenvolverá uma solução que analise transações financeiras de um cliente ao longo de um mês. O programa deve receber uma lista de transações e calcular o saldo final, a maior transação de depósito e a maior transação de retirada. Além disso, o programa deve verificar se o saldo final é positivo ou negativo.

Para resolver este desafio, você aplicará os conceitos de **Clean Architecture**. Seu objetivo é completar a classe `AnaliseTransacoesUseCase`, utilizando os conceitos de Clean Architecture. Dessa forma, implemente a condição necessária para a análise das transações e construa a saída de acordo com a análise.

**Saiba mais sobre: [Clean Architecture](https://engsoftmoderna.info/artigos/arquitetura-limpa.html)**

## Entrada
**O programa deve receber:**

1. O número de transações.

2. Uma lista de números representando as transações (valores positivos para depósitos e valores negativos ( - ) para retiradas).

## Saída
* `Saldo: X`, onde `X` é o saldo final após todas as transações.

* `Deposito: Y`, onde `Y` é o valor da maior transação de depósito.

* `Retirada: Z`, onde `Z` é o valor da maior transação de retirada.

* `Saldo positivo` ou `Saldo negativo`, dependendo do valor do saldo final.

## Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

| Entrada | Saída |
| ------- | ----- |
| 2 | Saldo: 1200.00 |
| 1500.00 | Deposito: 1500.00 |
| -300.00 | Retirada: -300.00 |
| | Saldo positivo |

| Entrada | Saída |
| ------- | ----- |
| 3 | Saldo: -100.00 |
| 600.00 | Deposito: 600.00 |
| 200.00 | Retirada: -900.00 |
| -900.00 | Saldo negativo |

| Entrada | Saída |
| ------- | ----- |
| 5 | Saldo: 2790.00 |
| 2500.00 | Deposito: 2500.00 |
| 400.00 | Retirada: -150.00 |
| 50.00 | Saldo positivo |
| -150.00 | |
| -10.00 | |