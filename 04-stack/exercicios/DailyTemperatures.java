import util.Assert;

/* LeetCode 739 — Daily Temperatures [Medium] | Tópico: Stack
 * Padrão: pilha monotônica decrescente (guarda índices)
 *
 * MINHA IDEIA (escrever ANTES de codar):
 *   1.
 *   2.
 *   3.
 *
 * Complexidade:  tempo O(?)  espaço O(?)
 * Status: sozinho | com dica | viu o vídeo
 * Vídeo: ver PLAYLIST_INDEX.md
 */
public class DailyTemperatures {

    public static void main(String[] args) {
        Assert.arrayEquals(new int[]{1, 1, 4, 2, 1, 1, 0, 0},
                dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73}), "caso clássico");
        Assert.arrayEquals(new int[]{1, 0}, dailyTemperatures(new int[]{50, 60}), "sobe uma vez só");
        Assert.arrayEquals(new int[]{0, 0}, dailyTemperatures(new int[]{60, 50}), "nunca esquenta, tudo zero");
        Assert.resumo();
    }

    // Para cada dia, retorna quantos dias faltam até uma temperatura mais
    // alta aparecer. Se nunca aparecer, o valor é 0.
    static int[] dailyTemperatures(int[] temperatures) {
        throw new UnsupportedOperationException("TODO");
    }
}
