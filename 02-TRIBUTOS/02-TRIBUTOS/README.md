# 02 · Cálculo de tributos de produtos

## Enunciado

Criar um programa que calcule o valor de tributo de produtos de quatro tipos. Todo produto deve ter um método que retorna o seu valor de tributo, de acordo com o percentual do seu tipo:

| Tipo | Tributo |
|------|---------|
| Alimentação | 1% |
| Saúde e bem-estar | 1,5% |
| Vestuário | 2,5% |
| Cultura | 4% |

## Estrutura

```
02-tributos/
├── App.java                → ponto de entrada; cria os produtos e mostra os tributos
└── produtos/
    ├── Produto.java        → classe abstrata (pai de todos os produtos)
    ├── Alimentacao.java
    ├── SaudeBemEstar.java
    ├── Vestuario.java
    └── Cultura.java
```

## Como funciona

1. `Produto` é uma classe abstrata com o atributo `valor` (o preço) e o método abstrato `calcularTributo()`.
2. O construtor de `Produto` exige o preço, então nenhum produto existe sem valor.
3. Cada tipo de produto herda de `Produto` (`extends`), repassa o preço para o pai com `super(valor)` e escreve a própria conta em `calcularTributo()`.
4. O método só calcula e devolve o tributo. O preço do produto não é alterado.

## Por que classe abstrata e não interface

No [exercício 01](../01-mensagens), os serviços compartilhavam só um comportamento (enviar mensagem), então uma interface bastava.

Aqui os produtos compartilham um **dado** (o preço) e um **comportamento** (calcular o tributo). Como a interface não guarda atributos, a classe abstrata é a escolha certa: o pai guarda o preço e obriga cada filho a ter o método.

## Como eu entendi

O `Produto` não sabe qual percentual usar, porque não sabe de que tipo ele é. Cada filho precisa escrever sua própria conta, já que cada um tem sua própria tributação.

## Conceitos praticados

- Classe abstrata e método abstrato
- Herança com `extends` e `super`
- Encapsulamento com `protected`
- Pacotes com `package` e `import`
- Polimorfismo: uma variável do tipo `Produto` guarda qualquer tipo de produto

## Como executar

Pré-requisito: JDK instalado.

Abra a pasta `02-tributos` no VS Code e rode o `App.java`, ou pelo terminal, dentro dela:

```bash
javac App.java produtos/*.java
java App
```

## Exemplo

Para um produto de R$ 100,00:

| Tipo | Tributo |
|------|---------|
| Alimentação | R$ 1,00 |
| Saúde e bem-estar | R$ 1,50 |
| Vestuário | R$ 2,50 |
| Cultura | R$ 4,00 |