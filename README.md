# 📘 Documentação – Sistema de Aprovação Escolar em Java

## 📌 Visão Geral

Este programa implementa um **sistema simples de aprovação escolar**, executado no terminal, que calcula a média de três notas informadas pelo usuário e determina se o aluno está **aprovado** ou **reprovado**.

A decisão é feita com base na média aritmética das notas:

* Média maior ou igual a 7 → aprovado
* Média menor que 7 → reprovado

---

## 🧱 Estrutura do Programa

### Pacote

```java
package exercicios;
```

O pacote `exercicios` é utilizado para organizar códigos de prática e aprendizado.

---

### Importações

```java
import java.util.Scanner;
```

A classe `Scanner` permite a leitura de dados digitados pelo usuário no console.

---

### Classe Principal

```java
public class AprovacaoEscolar
```

A classe `AprovacaoEscolar` concentra toda a lógica do sistema de avaliação.

---

### Método `main`

```java
public static void main(String[] args)
```

Ponto de entrada da aplicação. Todas as instruções do programa são executadas a partir deste método.

---

## 🔄 Fluxo de Execução

### 1️⃣ Mensagens Iniciais

```java
System.out.println("sistema de aprovacao escolar");
System.out.println("digite as tres notas do aluno");
```

Exibe no console o título do sistema e solicita as notas do aluno.

---

### 2️⃣ Inicialização do Scanner

```java
Scanner sc = new Scanner(System.in);
```

Cria um objeto `Scanner` para capturar entradas do teclado.

---

### 3️⃣ Declaração das Variáveis

```java
int n1, n2, n3, media;
```

* `n1`, `n2`, `n3`: notas informadas pelo usuário
* `media`: resultado do cálculo da média aritmética

Todas as variáveis são do tipo `int`, o que implica que a média será um valor inteiro.

---

### 4️⃣ Leitura das Notas

```java
n1 = sc.nextInt();
n2 = sc.nextInt();
n3 = sc.nextInt();
```

O usuário informa três notas consecutivas via teclado.

---

### 5️⃣ Cálculo da Média

```java
media = (n1 + n2 + n3) / 3;
```

Calcula a média aritmética simples das três notas.

⚠️ Como as variáveis são inteiras, qualquer parte decimal é descartada.

---

### 6️⃣ Estrutura Condicional `if / else`

```java
if (media >= 7) {
    System.out.println("aprovado");
} else {
    System.out.println("reprovado");
}
```

Verifica se a média é suficiente para aprovação e exibe o resultado correspondente.

---

Uma base sólida para evoluir para sistemas mais completos 📚☕
