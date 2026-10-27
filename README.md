# Exercícios de Java · DIO

Exercícios resolvidos durante o bootcamp de Java da [DIO](https://www.dio.me/), praticando os fundamentos da linguagem e de orientação a objetos.

## Exercícios

| # | Exercício | Conceitos praticados |
|---|-----------|----------------------|
| 01 | [Envio de mensagens de marketing](./01-mensagens) | Interface, polimorfismo, `List`, lambda |

## 01 · Envio de mensagens de marketing

Programa que envia a mesma mensagem de marketing para diferentes serviços: SMS, E-mail, Redes Sociais e WhatsApp. Também foram incluídos Telegram e Outlook para testar como o código se comporta ao receber serviços novos.

**Como foi resolvido:**

- A interface `Servico` define a regra: todo serviço precisa ter o método `enviar(String mensagem)`.
- Cada serviço é uma classe que implementa `Servico` e envia a mensagem do seu jeito.
- No `App`, os serviços ficam em uma `List<Servico>` e a mensagem é enviada para todos com `forEach` e lambda.

Para adicionar um serviço novo, basta criar uma classe que implementa `Servico` e incluí-la na lista. A lógica de envio não muda.

## Como executar

Pré-requisito: Java 9 ou superior.

Abra a pasta do exercício no VS Code e rode o `App.java`, ou, pelo terminal, dentro da pasta do exercício:

```bash
javac *.java
java App
```

## Autor

**Bruno Brito Silveira**

[GitHub](https://github.com/britodev21) · [LinkedIn](https://linkedin.com/in/bruno-brito-silveira) · [Portfólio](https://brunobrito.tech)
