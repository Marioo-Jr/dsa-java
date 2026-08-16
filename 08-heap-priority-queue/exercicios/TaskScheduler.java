import util.Assert;

/* LeetCode 621 — Task Scheduler [Medium] | Tópico: Heap / Priority Queue
 * Padrão: max-heap por frequência + fila de espera (cooldown) ou fórmula matemática
 *
 * MINHA IDEIA (escrever ANTES de codar):
 *   1.
 *   2.
 *   3.
 *
 * Complexidade:  tempo O(n log 26) = O(n)  espaço O(26) = O(1)
 * Status: sozinho | com dica | viu o vídeo
 * Vídeo: ver PLAYLIST_INDEX.md
 */
public class TaskScheduler {

    public static void main(String[] args) {
        Assert.equals(8, leastInterval(new char[]{'A', 'A', 'A', 'B', 'B', 'B'}, 2),
                "exemplo clássico, n=2 -> 8 (com idles)");
        Assert.equals(6, leastInterval(new char[]{'A', 'A', 'A', 'B', 'B', 'B'}, 0),
                "n=0, sem cooldown -> soma direta das tarefas");
        Assert.equals(16, leastInterval(new char[]{'A', 'A', 'A', 'A', 'A', 'A', 'B', 'C', 'D', 'E', 'F', 'G'}, 2),
                "tarefa muito dominante força idles -> 16");
        Assert.equals(1, leastInterval(new char[]{'A'}, 5), "tarefa única não precisa de cooldown");
        Assert.equals(0, leastInterval(new char[]{}, 2), "sem tarefas -> 0");
        Assert.resumo();
    }

    static int leastInterval(char[] tasks, int n) {
        throw new UnsupportedOperationException("TODO");
    }
}
