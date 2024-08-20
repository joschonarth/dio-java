# Aplicando Fundamentos de Dados: Inclusão, Exclusão e Atualização

## 1 / 3 - Inserção de Elementos

## Descrição
Implemente um programa onde o usuário informa a quantidade de elementos que deseja inserir em uma tabela. Em seguida, o usuário deve inserir o ID e o nome de cada elemento. A tabela deve armazenar esses elementos e, ao final, o programa deve exibir todos os nomes armazenados na tabela, um abaixo do outro.

**Instrução**

**1. Implementar o Método `insert`**

* Você deve completar o método `insert` que insere um par (ID, nome) na tabela.

* Utilize o método `put` do `HashMap` para adicionar o par chave-valor ao mapa.

## Entrada

1. Um inteiro n representando a quantidade de elementos a serem inseridos.

2. Seguido por n pares de entradas onde cada par contém um inteiro (ID) e uma string (`nome`).

## Saída

* A lista de nomes armazenados na tabela, um abaixo do outro.

## Exemplos

A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

| Entrada | Saída |
| ------- | ----- |
| 2 | Anne |
| 1 | Marcos |
| Anne | |
| 2 | |
| Marcos | |

| Entrada | Saída |
| ------- | ----- |
| 3 | Luiz |
| 2 | Mariana |
| Luiz | Carlos |
| 2 | |
| Mariana | |
| 3 | |
| Carlos | |

| Entrada | Saída |
| ------- | ----- |
| 4 | Bob |
| 1 | Maria |
| Bob | Yule |
| 2 | Sara |
| Maria | |
| 3 | |
| Yule | |
| 4 | |
| Sara | |