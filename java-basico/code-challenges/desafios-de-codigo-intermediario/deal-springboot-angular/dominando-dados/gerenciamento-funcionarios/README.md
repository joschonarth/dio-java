# Dominando Dados: Explorando a Administração de Funcionários

## 1 / 3 - Gerenciamento de Funcionários

## Descrição

Você está desenvolvendo um sistema de banco de dados para gerenciar funcionários de uma empresa. Cada funcionário tem um ID, nome e cargo. Crie um programa que adicione funcionários a uma "tabela" (lista) e liste todos os funcionários ordenados pelo ID.

## Entrada

1. Um número inteiro n representando a quantidade de funcionários.

2. Para cada funcionário, serão fornecidos dois dados:

* `nome` (uma string representando o nome do funcionário)

* `cargo` (uma string representando o cargo do funcionário)

## Saída

`String` contendo todos os funcionários listados em ordem crescente de ID, cada um em uma linha no formato: "ID: Nome - Cargo"

## Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

| Entrada | Saída |
| ------- | ----- |
| 2 | 1: Mariana - Desenvolvedora |
| Mariana | 2: Samuel - Analista |
| Desenvolvedora | |
| Samuel | |
| Analista | |

| Entrada | Saída |
| ------- | ----- |
| 3 | 1: Simone - Gerente |
| Simone | 2: Victor - Desenvolvedor |
| Gerente | 3: Ana - Analista |
| Victor | |
| Desenvolvedor | | 
| Ana | |
| Analista | |

| Entrada | Saída |
| ------- | ----- |
| 3 | 1: Patricia - Coordenadora |
| Patricia | 2: Fabio - Arquiteto |
| Coordenadora | 3: Marcelo - Gerente |
| Fabio | |
| Arquiteto | |
| Marcelo | |
| Gerente | |
