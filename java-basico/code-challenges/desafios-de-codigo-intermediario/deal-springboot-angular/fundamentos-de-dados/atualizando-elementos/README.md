# Aplicando Fundamentos de Dados: Inclusão, Exclusão e Atualização

## 3 / 3 - Atualizando Elementos

## Descrição
Implemente o método `update` na classe `Table` que permita ao usuário atualizar o nome de um elemento na tabela. O usuário deve informar o ID do elemento e o novo nome. O método deve verificar se a chave (ID) existe na tabela. Se existir, o valor associado a essa chave deve ser atualizado com o novo nome. Caso contrário, exiba a mensagem "ID nao encontrado.".

Após todas as atualizações, o programa deve exibir a tabela atualizada com todos os nomes.

## Entrada
Um inteiro `n` representando a quantidade de atualizações a serem feitas.

Seguido por `n` pares de entradas onde cada par contém:

* Um inteiro (ID) que representa a chave do elemento na tabela.

* Uma string (novo nome) que representa o novo valor a ser associado à chave.

## Saída

* A lista de nomes atualizados na tabela, um abaixo do outro.

## Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

| Entrada | Saída |
| ------- | ----- |
| 2 | Alice |
| 5 | Bob |
| Erica | Charlie |
| 6 | Debora |
| Fabio | Erica |
| | Fabio |

| Entrada | Saída |
| ------- | ----- |
| 3 | Angela |
| 1 | Bruce |
| Angela | Chris |
| 2 | Debora |
| Bruce | Eduardo |
| 3 | Fernanda |
| Chris | |

| Entrada | Saída |
| ------- | ----- |
| 4 | Alice |
| 2 | Brad |
| Brad | Charlie |
| 3 | Derek |
| Charlie | Emma |
| 4 | Fernanda |
| Derek | |
| 5 | |
| Emma | |


