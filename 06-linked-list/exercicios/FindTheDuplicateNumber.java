import util.Assert;

/* LeetCode 287 — Find The Duplicate Number [Medium] | Tópico: Linked List
 * Padrão: Floyd's cycle detection aplicado ao array como se fosse uma lista ligada
 * (nums[i] funciona como o "próximo índice", então o número repetido cria um ciclo)
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
public class FindTheDuplicateNumber {

    public static void main(String[] args) {
        Assert.equals(2, findDuplicate(new int[]{1, 3, 4, 2, 2}), "exemplo 1 do LeetCode");
        Assert.equals(3, findDuplicate(new int[]{3, 1, 3, 4, 2}), "exemplo 2 do LeetCode");
        Assert.equals(1, findDuplicate(new int[]{1, 1}), "menor caso possível (n=1, array de tamanho 2)");
        Assert.equals(2, findDuplicate(new int[]{2, 2, 2, 2, 2}), "duplicado repetido muitas vezes");

        Assert.resumo();
    }

    static int findDuplicate(int[] nums) {
        throw new UnsupportedOperationException("TODO");
    }
}
