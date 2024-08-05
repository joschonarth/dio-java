# Calculando Consumo e Limite de Dados Móveis

## 2 / 2 - Verificação de Limite de Dados Móveis

## Descrição
Desenvolva um sistema para monitorar o consumo mensal de dados móveis de clientes, verificando se excede o limite do plano adquirido. O sistema deve comparar o limite mensal, recebido em gigabytes (GB), com o consumo total de dados acumulado até o momento, fornecido em megabytes (MB). Se o consumo total ultrapassar o limite mensal, o sistema deverá informar ao cliente para adquirir ou renovar o pacote; caso contrário, deve retornar quanto em megabytes (MB) ainda está disponível para uso no mês.

## Entrada
A entrada do programa é fornecida em duas linhas:

* A primeira linha contém o limite mensal de dados em **gigabytes (GB)**.
* A segunda linha contém o consumo total de dados móveis em **megabytes (MB)**.

## Saída
Dever

## Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

| Entrada | Saída |
| ------- | ----- |
| 10 | 	Limite de dados excedido. Compre ou renove seu pacote. |
| 11264 |  |

| Entrada | Saída |
| ------- | ----- |
| 25 | Voce ainda possui 5120 MB disponiveis. |
| 20480 |  |

| Entrada | Saída |
| ------- | ----- |
| 20 | Voce ainda possui 1024 MB disponiveis. |
| 19456 | |