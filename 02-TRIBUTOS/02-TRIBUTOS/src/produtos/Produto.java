package produtos;

// Classe pai de todos os produtos. É abstrata porque não existe
// produto genérico, todo produto é algum tipo de produto.
public abstract class Produto {
    
    // A propria classe, os filhos e as classes da mesma package enxergam, o resto não
    protected double valor;

    // Quando o produto é criado, o construtor roda. 
    // Ele recebe o preço e guarda em valor. 
    // Isso garante que nenhum produto existe sem preço.
    public Produto(double valor) {
        this.valor = valor;
    }

    // Cada filho precisa escrever sua propria conta, 
    // cada um tem sua própria tributação.
    public abstract double calcularTributo();
}
