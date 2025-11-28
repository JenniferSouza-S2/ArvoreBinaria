import java.util.*;

public class ArvoreBinariaBusca<T extends Comparable<T>> {
    private No<T> raiz;

    // Inserção BST
    public void inserir(T valor) {
        raiz = inserirRec(raiz, valor);
    }

    private No<T> inserirRec(No<T> atual, T valor) {
        if (atual == null) return new No<>(valor);
        int cmp = valor.compareTo(atual.valor);
        if (cmp < 0) atual.esquerda = inserirRec(atual.esquerda, valor);
        else if (cmp > 0) atual.direita = inserirRec(atual.direita, valor);
        return atual;
    }

    // Altura (raiz nível 1). Árvore vazia -> 0
    public int altura() {
        return alturaRec(raiz);
    }

    private int alturaRec(No<T> no) {
        if (no == null) return 0;
        return 1 + Math.max(alturaRec(no.esquerda), alturaRec(no.direita));
    }

    // Contar nós
    public int contarNos() {
        return contarNosRec(raiz);
    }

    private int contarNosRec(No<T> no) {
        if (no == null) return 0;
        return 1 + contarNosRec(no.esquerda) + contarNosRec(no.direita);
    }

    // Contar folhas
    public int contarFolhas() {
        return contarFolhasRec(raiz);
    }

    private int contarFolhasRec(No<T> no) {
        if (no == null) return 0;
        if (no.esquerda == null && no.direita == null) return 1;
        return contarFolhasRec(no.esquerda) + contarFolhasRec(no.direita);
    }

    // Percursos — retornam String em vez de imprimir diretamente (mais controlado)
    public String emOrdemString() {
        StringBuilder sb = new StringBuilder();
        emOrdemRec(raiz, sb);
        return sb.toString().trim();
    }

    private void emOrdemRec(No<T> no, StringBuilder sb) {
        if (no == null) return;
        emOrdemRec(no.esquerda, sb);
        sb.append(no.valor).append(" ");
        emOrdemRec(no.direita, sb);
    }

    public String preOrdemString() {
        StringBuilder sb = new StringBuilder();
        preOrdemRec(raiz, sb);
        return sb.toString().trim();
    }

    private void preOrdemRec(No<T> no, StringBuilder sb) {
        if (no == null) return;
        sb.append(no.valor).append(" ");
        preOrdemRec(no.esquerda, sb);
        preOrdemRec(no.direita, sb);
    }

    public String posOrdemString() {
        StringBuilder sb = new StringBuilder();
        posOrdemRec(raiz, sb);
        return sb.toString().trim();
    }

    private void posOrdemRec(No<T> no, StringBuilder sb) {
        if (no == null) return;
        posOrdemRec(no.esquerda, sb);
        posOrdemRec(no.direita, sb);
        sb.append(no.valor).append(" ");
    }

    // Impressão por níveis padrão (mantive caso queira usar)
    public void imprimirPorNiveis() {
        System.out.println("Por níveis:");
        if (raiz == null) {
            System.out.println("(vazia)");
            return;
        }
        Queue<No<T>> fila = new LinkedList<>();
        fila.offer(raiz);
        while (!fila.isEmpty()) {
            int qtd = fila.size();
            for (int i = 0; i < qtd; i++) {
                No<T> n = fila.poll();
                System.out.print(n.valor + " ");
                if (n.esquerda != null) fila.offer(n.esquerda);
                if (n.direita != null) fila.offer(n.direita);
            }
            System.out.println();
        }
    }

    // Novo: Impressão por níveis numerada (Nível 1: ..., Nível 2: ...)
    public void imprimirPorNiveisNumerado() {
        if (raiz == null) {
            System.out.println("(vazia)");
            return;
        }
        Queue<No<T>> fila = new LinkedList<>();
        fila.add(raiz);
        int nivel = 1;
        while (!fila.isEmpty()) {
            int qtd = fila.size();
            System.out.print("Nível " + nivel + ": ");
            for (int i = 0; i < qtd; i++) {
                No<T> atual = fila.poll();
                System.out.print(atual.valor + " ");
                if (atual.esquerda != null) fila.add(atual.esquerda);
                if (atual.direita != null) fila.add(atual.direita);
            }
            System.out.println();
            nivel++;
        }
    }
}
