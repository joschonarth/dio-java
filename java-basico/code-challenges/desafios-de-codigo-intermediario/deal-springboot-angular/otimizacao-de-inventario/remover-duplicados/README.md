# Otimização de Inventário: Consulta, Filtragem e Duplicatas

## 3 / 3 - Remoção de Duplicatas de Produtos de TI

## Descrição
Você está trabalhando em um sistema de gerenciamento de inventário para uma empresa de tecnologia e precisa de uma função que recebe uma lista de produtos de TI e remove quaisquer duplicados. A lista pode conter produtos com o mesmo nome, e você precisa garantir que cada produto apareça apenas uma vez na lista final.  Escreva uma função que receba uma lista de produtos e retorne uma nova lista com os produtos únicos, mantendo a ordem de sua primeira ocorrência.

O**bjetivo do Desafio**

Você deve completar o método `main` para chamar a função `removerDuplicados` e armazenar o resultado. Em seguida, deve imprimir a lista de produtos únicos. A função deve ser capaz de lidar com produtos que diferem apenas em letras maiúsculas e minúsculas, ou seja, "USB Drive" e "usb drive" devem ser considerados duplicados.

## Entrada
A função receberá uma lista de strings `produtos` onde cada string representa o nome de um produto de TI. A lista pode conter produtos duplicados.

## Saída
A função deve retornar uma lista de strings onde cada string representa o nome de um produto de TI, sem duplicatas e na mesma ordem em que apareceram pela primeira vez na lista de entrada.

## Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

| Entrada | Saída |
| ------- | ----- |
| 6 | Produtos unicos: |
| USB Drive | USB Drive |
| usb drive | External HDD |
| External HDD | Pen Drive |
| External HDD | |
| USB DRIVE | |
| Pen Drive | |

| Entrada | Saída |
| ------- | ----- |
| 6 | Produtos unicos: |
| Printer | Printer |
| Scanner | Scanner |
| Speaker | Speaker |
| Scanner | |
| Speaker | |
| Printer | |

| Entrada | Saída |
| ------- | ----- |
| 8 | Produtos unicos: |
| Router | Router |
| Switch | Switch |
| Router | Modem |
| Modem | Printer |
| Switch | Laptop |
| Printer | |
| Laptop | |
| Router | |
