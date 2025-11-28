public class Main {
    public static void main(String[] args) {

        // Cenário A — Degenerada à direita
        ArvoreBinariaBusca<Integer> a = new ArvoreBinariaBusca<>();
        int[] A = {10, 20, 30, 40, 50, 60, 70};
        for (int v : A) a.inserir(v);
        imprimirDiagnostico("Cenário A — Degenerada à Direita", A, a);

        // Cenário B — Degenerada à esquerda
        ArvoreBinariaBusca<Integer> b = new ArvoreBinariaBusca<>();
        int[] B = {70, 60, 50, 40, 30, 20, 10};
        for (int v : B) b.inserir(v);
        imprimirDiagnostico("Cenário B — Degenerada à Esquerda", B, b);

        // Cenário C — Quase balanceada com ramo profundo
        ArvoreBinariaBusca<Integer> c = new ArvoreBinariaBusca<>();
        int[] base = {50, 30, 70, 20, 40, 60, 80, 10, 25, 35, 45, 55, 65, 75, 85};
        for (int v : base) c.inserir(v);
        int[] alongar = {90, 95, 97, 98, 99};
        for (int v : alongar) c.inserir(v);
        imprimirDiagnostico("Cenário C — Quase Balanceada com Ramo Profundo", combinar(base, alongar), c);
    }

    private static void imprimirDiagnostico(String titulo, int[] valores, ArvoreBinariaBusca<Integer> arv) {
        System.out.println("\n==========================================================");
        System.out.println(titulo);
        System.out.println("==========================================================");

        System.out.print("Valores inseridos: ");
        for (int v : valores) System.out.print(v + " ");
        System.out.println("\n");

        System.out.println("Altura da árvore: " + arv.altura());
        System.out.println("Total de nós: " + arv.contarNos());
        System.out.println("Total de folhas: " + arv.contarFolhas());
        System.out.println();

        System.out.println("Em-ordem:  " + arv.emOrdemString());
        System.out.println("Pré-ordem: " + arv.preOrdemString());
        System.out.println("Pós-ordem: " + arv.posOrdemString());
        System.out.println("\nPor níveis:");
        arv.imprimirPorNiveisNumerado();

        System.out.println("==========================================================\n");
    }

    private static int[] combinar(int[] a, int[] b) {
        int[] r = new int[a.length + b.length];
        System.arraycopy(a, 0, r, 0, a.length);
        System.arraycopy(b, 0, r, a.length, b.length);
        return r;
    }
}
