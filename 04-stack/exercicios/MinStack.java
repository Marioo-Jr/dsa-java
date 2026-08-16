import util.Assert;

/* LeetCode 155 — Min Stack [Medium] | Tópico: Stack
 * Padrão: pilha auxiliar (ou pares) para rastrear o mínimo em O(1)
 *
 * MINHA IDEIA (escrever ANTES de codar):
 *   1.
 *   2.
 *   3.
 *
 * Complexidade:  tempo O(?) por operação  espaço O(?)
 * Status: sozinho | com dica | viu o vídeo
 * Vídeo: ver PLAYLIST_INDEX.md
 */
public class MinStack {

    public MinStack() {
        throw new UnsupportedOperationException("TODO");
    }

    public void push(int val) {
        throw new UnsupportedOperationException("TODO");
    }

    public void pop() {
        throw new UnsupportedOperationException("TODO");
    }

    public int top() {
        throw new UnsupportedOperationException("TODO");
    }

    public int getMin() {
        throw new UnsupportedOperationException("TODO");
    }

    public static void main(String[] args) {
        // NOTA: como o construtor/métodos lançam TODO, este main() vai
        // lançar exceção até você implementar a classe — isso é esperado.
        MinStack s = new MinStack();
        s.push(-2);
        s.push(0);
        s.push(-3);
        Assert.equals(-3, s.getMin(), "getMin após 3 pushes");
        s.pop();
        Assert.equals(0, s.top(), "top após pop");
        Assert.equals(-2, s.getMin(), "getMin após pop");

        s.push(-2);
        Assert.equals(-2, s.getMin(), "getMin após novo push igual ao mínimo atual");
        s.pop();
        Assert.equals(-2, s.getMin(), "getMin volta ao mínimo anterior após pop");

        Assert.resumo();
    }
}
