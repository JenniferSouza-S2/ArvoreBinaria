public class No<T> {
    T valor;
    No<T> esquerda;
    No<T> direita;

    public No(T valor) {
        this.valor = valor;
        this.esquerda = null;
        this.direita = null;
    }
}
