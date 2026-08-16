import util.Assert;

/* 01 — Arrays & Hashing | Teoria: Dynamic Arrays
 * Lição de referência: NeetCode DSA for Beginners → "Dynamic Arrays"
 *
 * IDEIA: um ArrayList/Vector por baixo dos panos é um array estático que
 * dobra de capacidade quando enche. Isso dá inserção no fim O(1) amortizado:
 * a maioria das inserções é O(1), mas de vez em quando (quando enche) custa
 * O(n) para copiar tudo pro array novo maior — e essa cópia cara acontece tão
 * raramente que a MÉDIA por inserção ainda é O(1).
 *
 * Implementar isso do zero é o que faz "amortizado" deixar de ser um
 * conceito abstrato e virar algo que você viu acontecer.
 *
 * ANTES DE CODAR, escreva aqui sua ideia em 3 linhas:
 *   1.
 *   2.
 *   3.
 */
public class DynamicArray {

    private int[] dados;
    private int tamanho;    // quantidade de elementos usados
    private int capacidade; // tamanho do array interno

    public DynamicArray() {
        capacidade = 2;
        dados = new int[capacidade];
        tamanho = 0;
    }

    public int size() {
        return tamanho;
    }

    public int get(int indice) {
        if (indice < 0 || indice >= tamanho) throw new IndexOutOfBoundsException();
        return dados[indice];
    }

    // TODO: adiciona valor no fim. Se tamanho == capacidade, dobre a
    // capacidade (crie um array novo do dobro do tamanho, copie os elementos,
    // troque a referência) ANTES de inserir.
    public void pushback(int valor) {
        throw new UnsupportedOperationException("TODO");
    }

    // TODO: remove e retorna o último elemento. Não precisa encolher o array.
    public int popback() {
        throw new UnsupportedOperationException("TODO");
    }

    public static void main(String[] args) {
        DynamicArray arr = new DynamicArray();
        Assert.equals(0, arr.size(), "começa vazio");

        arr.pushback(10);
        arr.pushback(20);
        arr.pushback(30); // força pelo menos um resize (capacidade inicial = 2)
        Assert.equals(3, arr.size(), "tamanho após 3 pushes");
        Assert.equals(10, arr.get(0), "get(0)");
        Assert.equals(30, arr.get(2), "get(2) após resize");

        Assert.equals(30, arr.popback(), "popback retorna o último");
        Assert.equals(2, arr.size(), "tamanho após popback");

        Assert.resumo();
    }
}
