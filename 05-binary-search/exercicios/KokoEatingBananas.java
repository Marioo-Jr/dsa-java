import util.Assert;

/* LeetCode 875 — Koko Eating Bananas [Medium] | Tópico: Binary Search
 * Padrão: busca binária sobre a RESPOSTA (velocidade de comer k), não sobre o array
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
public class KokoEatingBananas {

    public static void main(String[] args) {
        Assert.equals(4, minEatingSpeed(new int[]{3, 6, 7, 11}, 8), "caso clássico");
        Assert.equals(30, minEatingSpeed(new int[]{30, 11, 23, 4, 20}, 5), "h igual ao número de pilhas: precisa comer a maior pilha inteira por hora");
        Assert.equals(23, minEatingSpeed(new int[]{30, 11, 23, 4, 20}, 6), "uma hora extra permite velocidade menor");
        Assert.equals(1, minEatingSpeed(new int[]{1, 1, 1, 1}, 100), "muito tempo sobrando, velocidade mínima 1");
        Assert.resumo();
    }

    // Koko come bananas a uma velocidade k (bananas/hora) constante. Cada
    // pilha leva pelo menos 1 hora se ela não for zerada (não passa pra
    // próxima pilha na mesma hora). Retorna o menor k tal que ela termina
    // todas as pilhas em até h horas.
    static int minEatingSpeed(int[] piles, int h) {
        throw new UnsupportedOperationException("TODO");
    }
}
