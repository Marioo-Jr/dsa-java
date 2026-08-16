import util.Assert;

/* 04 — Stack | Teoria: Stacks (implementação do zero)
 * Lição de referência: NeetCode DSA for Beginners → "Stacks"
 *
 * IDEIA: uma pilha (LIFO — last in, first out) pode ser implementada com um
 * array dinâmico: push/pop/peek só mexem na PONTA (índice `topo`), nunca no
 * meio, então todas as operações são O(1) amortizado — o mesmo truque de
 * dobrar a capacidade da DynamicArray do tópico 01 se aplica aqui.
 *
 * ANTES DE CODAR, escreva aqui sua ideia em 3 linhas:
 *   1.
 *   2.
 *   3.
 */
public class MinhaStack {

    private int[] dados;
    private int topo; // quantidade de elementos = índice do próximo slot livre
    private int capacidade;

    public MinhaStack() {
        capacidade = 2;
        dados = new int[capacidade];
        topo = 0;
    }

    // TODO: adiciona valor no topo. Se topo == capacidade, dobre a
    // capacidade (novo array do dobro do tamanho, copie os elementos) ANTES
    // de inserir.
    public void push(int valor) {
        throw new UnsupportedOperationException("TODO");
    }

    // TODO: remove e retorna o elemento do topo. Lance
    // RuntimeException("pilha vazia") se estiver vazia.
    public int pop() {
        throw new UnsupportedOperationException("TODO");
    }

    // TODO: retorna (sem remover) o elemento do topo. Lance
    // RuntimeException("pilha vazia") se estiver vazia.
    public int peek() {
        throw new UnsupportedOperationException("TODO");
    }

    public boolean isEmpty() {
        return topo == 0;
    }

    public int size() {
        return topo;
    }

    public static void main(String[] args) {
        MinhaStack pilha = new MinhaStack();
        Assert.isTrue(pilha.isEmpty(), "começa vazia");

        pilha.push(10);
        pilha.push(20);
        pilha.push(30); // força pelo menos um resize (capacidade inicial = 2)
        Assert.equals(3, pilha.size(), "tamanho após 3 pushes");
        Assert.equals(30, pilha.peek(), "peek retorna o topo sem remover");
        Assert.equals(3, pilha.size(), "peek não altera o tamanho");

        Assert.equals(30, pilha.pop(), "pop retorna o topo (LIFO)");
        Assert.equals(20, pilha.pop(), "pop seguinte retorna o próximo");
        Assert.equals(1, pilha.size(), "tamanho após 2 pops");
        Assert.isTrue(!pilha.isEmpty(), "ainda tem 1 elemento");

        pilha.pop();
        Assert.isTrue(pilha.isEmpty(), "vazia após remover tudo");

        Assert.resumo();
    }
}
