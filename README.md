<p align="center">
  <img src="https://imgur.com/JbV2rfH.png" alt="Logo da Target Sistemas">
</p>

# Desafio Tech - Target Sistemas

Este repositório contém a solução para o **Desafio Tech** proposto pela **Target Sistemas**. O desafio envolve a implementação de algoritmos em Java para resolver diferentes problemas técnicos, incluindo lógica de programação, análise de strings, cálculo de sequências, e um problema clássico de interruptores e lâmpadas.

## Estrutura do Projeto

O projeto foi organizado em diferentes classes para facilitar a modularização e reuso de código, conforme os problemas propostos no desafio.

### 1) Verificação de número na sequência de Fibonacci

#### Descrição:
Implementa um método para verificar se um número informado pertence à sequência de Fibonacci.

#### Arquivo: `FibonacciChecker.java`
- Método `isFibonacci(int n)`: Verifica se o número pertence à sequência.

#### Execução:
No arquivo `Main.java`, chamamos a classe `FibonacciChecker` para verificar se o número fornecido pelo usuário está presente na sequência de Fibonacci.

---

### 2) Verificação de ocorrência da letra 'a' em uma string

#### Descrição:
Implementa um método para contar quantas vezes a letra 'a' (maiúscula ou minúscula) aparece em uma string.

#### Arquivo: `StringAnalyzer.java`
- Método `countLetterA(String input)`: Conta quantas vezes a letra 'a' ocorre na string fornecida.

#### Execução:
No arquivo `Main.java`, chamamos a classe `StringAnalyzer` para contar e exibir o número de ocorrências de 'a' em uma string fornecida pelo usuário.

---

### 3) Cálculo do valor final da variável SOMA

#### Descrição:
O código realiza a soma iterativa de valores, conforme o trecho fornecido no desafio.

#### Execução:
No arquivo `Main.java`, implementamos a lógica que calcula o valor final da variável `SOMA` conforme a sequência de operações definidas no desafio.

---

### 4) Lógica de Sequências

#### Descrição:
Cada sequência lógica foi resolvida em métodos separados, dentro da classe `SequenceSolver`, que fornece o próximo valor da sequência com base na lógica definida.

#### Arquivo: `SequenceSolver.java`
- Métodos: `nextInSequenceA()`, `nextInSequenceB()`, ..., `nextInSequenceF()`: Cada método retorna o próximo número de uma das sequências fornecidas no desafio.

#### Execução:
No arquivo `Main.java`, chamamos a classe `SequenceSolver` para calcular e imprimir o próximo valor de cada sequência.

---

### 5) Problema dos interruptores e lâmpadas

#### Descrição:
Este problema envolve um cenário prático onde três interruptores controlam três lâmpadas em salas diferentes. A solução é conceitual e foi explicada na resposta original, sem código implementado, pois não se aplica à lógica de programação, mas sim à dedução.

---

## Requisitos

- **Java 8 ou superior**
- IDE compatível com Java (Eclipse, IntelliJ, VS Code etc.)

## Sobre o Desafio
Este projeto foi desenvolvido como parte de um Desafio Tech da Target Sistemas, com o objetivo de testar habilidades de lógica de programação, análise de strings, cálculo de sequências e resolução de problemas práticos utilizando a linguagem Java.

Desenvolvido por Ivanderson do Amaral.


