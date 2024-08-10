# Explorando o Clean Architecture em Soluções de Desafios de Códigos

## 1 / 3 - Verificação de Estoque de Produtos

## Descrição
Você está desenvolvendo um programa para verificar o estoque de produtos, e este desafio visa aplicar o conceito de **Clean Architecture** para uma solução mais estruturada e modular. A Clean Architecture, desenvolvida por Robert C. Martin (também conhecido como Uncle Bob), é uma abordagem que separa as responsabilidades de um sistema em camadas distintas. Isso permite uma melhor organização do código e facilita a manutenção e a escalabilidade.

Para este desafio, seu objetivo é implementar a camada de **Casos de Uso** utilizando o padrão **Strategy** para a lógica de verificação de estoque. Você precisará garantir que o código esteja organizado conforme os princípios da Clean Architecture. Você precisará implementar uma classe chamada `VerificarEstoqueStrategy` que deve seguir uma interface denominada `EstoqueStrategy`. Esta classe será responsável por verificar o nível de estoque de um produto e gerar uma mensagem adequada com base nesse nível.

**Resumindo:**

Você precisa implementar a classe `VerificarEstoqueStrategy` para:

- Implementar a interface `EstoqueStrategy`.
- Usar uma constante para definir o limite mínimo de estoque.
- Verificar a quantidade de estoque do produto e retornar uma mensagem apropriada com base nesse valor.

**Saiba mais sobre: [Clean Architecture](https://engsoftmoderna.info/artigos/arquitetura-limpa.html)**

## Entrada
O programa deve receber as seguintes entradas:

* **Nome do Produto:** Uma string representando o nome do produto.

* **Quantidade em Estoque:** Um inteiro representando a quantidade atual em estoque do produto.

## Saída
* "`Alerta: Estoque baixo de X`", onde X é o nome do produto, se a quantidade em estoque for menor do que o limite mínimo pré-definido de 10 unidades.

* "`Estoque de X esta em nivel adequado`", onde `X` é o nome do produto, se a quantidade em estoque for igual ou maior que o limite mínimo pré-definido de 10 unidades.

**IMPORTANTE:**

É fundamental que as saídas/retornos estejam idênticas como o solicitado na descrição do desafio.

## Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

| Entrada | Saída |
| ------- | ----- |
| Teclado | Alerta: Estoque baixo de Teclado |
| 8 | |
| SSD | Alerta: Estoque baixo de SSD |
| 9 | |
| Placa | Estoque de Placa Mae esta em nivel adequado |
| Mae | |
| 25 | |