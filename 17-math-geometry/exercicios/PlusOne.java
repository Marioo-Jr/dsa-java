import util.Assert;

/* LeetCode 66 — Plus One [Easy] | Tópico: Math & Geometry
 * Padrão: somar 1 da direita pra esquerda, propagando carry; se sobrar carry no início, crescer o array
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
public class PlusOne {

    public static void main(String[] args) {
        Assert.arrayEquals(new int[]{1, 2, 4}, plusOne(new int[]{1, 2, 3}), "sem carry");
        Assert.arrayEquals(new int[]{4, 3, 2, 2}, plusOne(new int[]{4, 3, 2, 1}), "último dígito 1 -> 2");
        Assert.arrayEquals(new int[]{1, 0}, plusOne(new int[]{9}), "carry que cresce o array");
        Assert.arrayEquals(new int[]{1, 0, 0}, plusOne(new int[]{9, 9}), "carry em cascata por todos os dígitos");
        Assert.resumo();
    }

    static int[] plusOne(int[] digits) {
        throw new UnsupportedOperationException("TODO");
    }
}
