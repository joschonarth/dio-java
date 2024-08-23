# Otimização de Inventário: Consulta, Filtragem e Duplicatas

## 2 / 3 - Filtro de Produtos por Faixa de Preço

## Descrição
Você está desenvolvendo um sistema de inventário para uma loja. O sistema precisa filtrar produtos por faixa de preço. Cada produto tem um nome, categoria e preço. Crie um programa que leia os dados dos produtos e retorne a lista de produtos dentro de uma faixa de preço específica.

## Entrada

1. Um número inteiro `n` representando a quantidade de produtos.

2. Para cada produto, serão fornecidos:

* `nome` (uma string representando o nome do produto)

* `categoria` (uma string representando a categoria do produto)

* `preco` (um número decimal representando o preço do produto)

3. Dois números decimais `preco_min` e `preco_max` representando a faixa de preço.

## Saída
* `String` contendo todos os produtos dentro da faixa de preço, cada um em uma linha no formato: "Nome: Preco"

## Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

| Entrada | Saída |
| ------- | ----- |
| 2 | Nome: Roteador - Preco: 250.00 |
| Roteador | |
| Rede | |
| 250.00 | |
| Switch | |
| Rede | |
| 400.00 | |
| 100.00 | |
| 300.00 | |

| Entrada | Saída |
| ------- | ----- |
| 3 | Nome: Teclado - Preco: 150.00 |
| Teclado | |
| Periferico | |
| 150.00 | |
| Mouse | |
| Periferico | |
| 80.00 | |
| Monitor | |
| Periferico | |
| 900.00 | |
| 100.00 | |
| 200.00 | |

| Entrada | Saída |
| ------- | ----- |
| 4 | Nome: Desktop - Preco: 3000.00 |
| Notebook | Nome: Smartphone - Preco: 3500.00 |
| Computador | | 
| 4500.00 | |
| Desktop | |
| Computador | |
| 3000.00 | |
| Tablet | |
| Dispositivo | |
| 2000.00 | |
| Smartphone | |
| Dispositivo | |
| 3500.00 | |
| 2500.00 | |
| 4000.00 | |