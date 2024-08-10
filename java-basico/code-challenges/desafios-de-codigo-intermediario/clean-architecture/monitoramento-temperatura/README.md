# Explorando o Clean Architecture em Soluções de Desafios de Códigos

## 3 / 3 - Monitoramento de Temperatura em Data Centers

## Descrição
No seu desafio, você irá implementar um sistema de monitoramento de temperatura aplicando a **Clean Architecture**. Cada componente do sistema deve ser criado e utilizado conforme as regras da arquitetura para garantir uma separação clara de responsabilidades. Abaixo, você encontrará o detalhamento das tarefas que devem ser realizadas. Dessa forma, o objetivo é implementar o sistema de monitoramento de temperatura seguindo a **Clean Architecture**. Você deve focar na criação de classes e interfaces para cada parte da arquitetura, assegurando que as responsabilidades estejam bem definidas e separadas.

**Detalhamento das Tarefas:**

**1. Criação e execução do caso de uso:** Nesta parte do código, você deve instanciar a implementação do caso de uso `MonitoramentoTemperaturaUseCaseImpl`. Esta classe contém a lógica de monitoramento de temperatura e gera os alertas se alguma sala exceder o limite.

**2. Criação e execução do apresentador:** Aqui, você deve instanciar o apresentador que implementa a interface `MonitoramentoTemperaturaPresenter`. Esta instância será usada pelo controlador para apresentar os resultados ao usuário.

**3. Criação do controlador:** Nesta parte, você deve criar uma instância do controlador, passando o caso de uso (`useCase`) e o apresentador (`presenter`) como parâmetros. O controlador será responsável por orquestrar a execução do caso de uso e a apresentação dos resultados.

**Saiba mais sobre:** [Clean Architecture](https://engsoftmoderna.info/artigos/arquitetura-limpa.html)

## Entrada
O programa deve receber:

1. O número de salas no data center.

2. Para cada sala, a temperatura atual.

## Saída
* "`Alerta: Sala X excedeu o limite de temperatura!`" se a temperatura da sala X exceder o limite estabelecido.

## Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

| Entrada | Saída |
| ------- | ----- |
| 3 | Alerta: Sala 3 excedeu o limite de temperatura! |
| 25 | |
| 28 | |
| 31 | |

| Entrada | Saída |
| ------- | ----- |
| 2 | Nenhuma sala excedeu o limite de temperatura. |
| 29 | |
| 30 | |

| Entrada | Saída |
| ------- | ----- |
| 4 | Alerta: Sala 1 excedeu o limite de temperatura! |
| 31 | |
| 30 | |
| 29 | |
| 15 | |