# 2 / 3 - Verificação de Horários de Reuniões

## Descrição

Você está desenvolvendo um programa para verificar os horários de reuniões empresariais. Seu algoritmo deve verificar se o horário desejado está dentro do intervalo permitido para as reuniões e exibir uma mensagem informando se a reunião pode ser agendada ou não. Um detalhe importante é que o sistema possui um horário mínimo e máximo já pré-definidos.

Neste desafio, você deverá utilizar o padrão de projeto **Factory Method**. Esse padrão de criação fornece uma interface para criar objetos em uma superclasse, mas permite que as subclasses alterem o tipo de objetos que serão criados. Nesse caso, você implementará o padrão Factory Method na classe `TimeFactory`, especificamente no método `createTime`. Este método deve garantir que a string fornecida pelo usuário seja convertida corretamente em um objeto `LocalTime`.

**Saiba mais sobre:** [Factory Method](https://refactoring.guru/pt-br/design-patterns/factory-method)

## Entrada

O programa deve receber as seguintes entradas:

1. Horário Desejado para a Reunião: Uma string representando o horário desejado para a reunião (no formato "HH:MM").

2. Horário Atual do Sistema: Uma string representando o horário atual do sistema (no formato "HH:MM").

## Saída

* "Reunião pode ser agendada.", se o horário desejado está dentro do intervalo permitido.

* "Reunião não pode ser agendada. Horário fora do intervalo permitido.", se o horário desejado está fora do intervalo permitido.

## Exemplos

A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

| Entrada | Saída |
| ------- | ----- |
| 08:59 | Reuniao nao pode ser agendada. |
| 06: 00 | Horario fora do intervalo permitido.|

| Entrada | Saída |
| ------- | ----- |
| 10:00 | Reuniao pode ser agendada.|
| 14:53 | |

| Entrada | Saída |
| ------- | ----- |
| 18:01 | Reuniao nao pode ser agendada. |
| 08:00 | Horario fora do intervalo permitido. |