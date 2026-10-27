# 01 · Envio de mensagens de marketing

## Enunciado

Criar um programa que envie a mesma mensagem de marketing para diferentes serviços: SMS, E-mail, Redes Sociais e WhatsApp. Cada serviço deve ter um método que recebe a mensagem como parâmetro.

## Estrutura

```
01-mensagens/
├── App.java            → ponto de entrada; envia a mensagem para todos os serviços
├── Servico.java        → interface com a regra enviar(String mensagem)
├── Sms.java
├── Email.java
├── RedesSociais.java
├── Whatsapp.java
├── Telegram.java       → serviço extra
└── Outlook.java        → serviço extra
```

## Como funciona

1. A interface `Servico` define a regra: todo serviço precisa ter o método `enviar(String mensagem)`.
2. Cada serviço é uma classe que implementa `Servico` (`implements`) e escreve o método do seu jeito, com `@Override`.
3. No `App`, todos os serviços ficam em uma `List<Servico>`. Um `forEach` com lambda chama `enviar` em cada um, passando a mesma mensagem.

Como a lista é do tipo da interface, ela aceita qualquer classe que cumpra a regra. Telegram e Outlook foram adicionados depois, só criando as classes e colocando na lista, sem mexer na lógica de envio.

## Como eu entendi

A interface funciona como o padrão de uma tomada: ela não sabe quais aparelhos existem, só define o formato do plugue. Qualquer aparelho com o plugue certo encaixa. Aqui, a tomada é `Servico` e os aparelhos são SMS, E-mail, WhatsApp e os outros.

## Conceitos praticados

- Interface, `implements` e `@Override`
- Polimorfismo: uma variável do tipo da interface guarda qualquer serviço
- `List.of` e `forEach` com lambda
- Extensão sem modificação: novos serviços entram sem alterar o código que já funciona (princípio aberto/fechado, o "O" do SOLID)

## Como executar

Pré-requisito: Java 9 ou superior.

Abra esta pasta no VS Code e rode o `App.java`, ou pelo terminal, dentro desta pasta:

```bash
javac *.java
java App
```

Saída esperada:

```
SMS: Promoção de 20% em tudo!
E-mail: Promoção de 20% em tudo!
Redes Sociais: Promoção de 20% em tudo!
WhatsApp: Promoção de 20% em tudo!
Telegram: Promoção de 20% em tudo!
Outlook: Promoção de 20% em tudo!
```