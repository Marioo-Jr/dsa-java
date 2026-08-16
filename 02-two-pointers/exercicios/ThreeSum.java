import util.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* LeetCode 15 — 3Sum [Medium] | Tópico: Two Pointers
 * Padrão: ordenar + fixar um elemento + dois ponteiros no restante
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
public class ThreeSum {

    public static void main(String[] args) {
        // Ordem das triplas e ordem dentro de cada tripla pode variar, então
        // comparamos uma representação canônica (cada tripla ordenada, lista
        // de triplas ordenada).
        Assert.equals("[[-1, -1, 2], [-1, 0, 1]]",
                canonico(threeSum(new int[]{-1, 0, 1, 2, -1, -4})), "caso clássico");
        Assert.equals("[]", canonico(threeSum(new int[]{0, 1, 1})), "nenhuma tripla soma zero");
        Assert.equals("[[0, 0, 0]]", canonico(threeSum(new int[]{0, 0, 0})), "todos zeros");
        Assert.equals("[]", canonico(threeSum(new int[]{})), "array vazio");
        Assert.resumo();
    }

    private static String canonico(List<List<Integer>> triplas) {
        List<String> reps = new ArrayList<>();
        for (List<Integer> t : triplas) {
            List<Integer> ordenada = new ArrayList<>(t);
            Collections.sort(ordenada);
            reps.add(ordenada.toString());
        }
        Collections.sort(reps);
        return reps.toString();
    }

    // Retorna todas as triplas ÚNICAS [a, b, c] com a + b + c == 0.
    static List<List<Integer>> threeSum(int[] nums) {
        throw new UnsupportedOperationException("TODO");
    }
}
