import util.Assert;

/* 05 — Binary Search | Teoria: Search Array & Search Range
 * Lição de referência: NeetCode DSA for Beginners → "Search Array" e "Search Range"
 *
 * IDEIA: em um array ORDENADO, cada comparação com o elemento do meio
 * descarta METADE do espaço de busca restante — daí O(log n) em vez de
 * O(n). Duas variantes:
 *
 *   1. Busca exata: procura um valor específico, retorna seu índice (ou -1).
 *   2. lower_bound: procura o PRIMEIRO índice i tal que arr[i] >= alvo —
 *      útil quando o valor exato pode não existir, mas você quer saber onde
 *      ele se encaixaria (base de várias variantes de busca binária, como
 *      "encontrar o menor elemento que satisfaz uma condição").
 *
 * ANTES DE CODAR, escreva aqui sua ideia em 3 linhas:
 *   1.
 *   2.
 *   3.
 */
public class BuscaBinaria {

    // TODO: busca binária clássica. Retorna o índice de target em arr
    // (ordenado, sem duplicados), ou -1 se não existir.
    static int buscaBinaria(int[] arr, int target) {
        throw new UnsupportedOperationException("TODO");
    }

    // TODO: retorna o PRIMEIRO índice i tal que arr[i] >= target. Se todos
    // os elementos forem menores que target, retorna arr.length.
    static int lowerBound(int[] arr, int target) {
        throw new UnsupportedOperationException("TODO");
    }

    public static void main(String[] args) {
        int[] arr = {-1, 0, 3, 5, 9, 12};
        Assert.equals(4, buscaBinaria(arr, 9), "encontra elemento no meio-fim");
        Assert.equals(-1, buscaBinaria(arr, 2), "elemento inexistente retorna -1");
        Assert.equals(0, buscaBinaria(arr, -1), "primeiro elemento");
        Assert.equals(5, buscaBinaria(arr, 12), "último elemento");
        Assert.equals(-1, buscaBinaria(new int[]{}, 1), "array vazio");

        int[] arr2 = {1, 3, 3, 5, 7};
        Assert.equals(0, lowerBound(arr2, 0), "alvo menor que tudo, lower bound é 0");
        Assert.equals(1, lowerBound(arr2, 3), "primeiro índice com valor >= 3");
        Assert.equals(3, lowerBound(arr2, 4), "4 não existe, primeiro >= 4 é o índice do 5");
        Assert.equals(5, lowerBound(arr2, 8), "alvo maior que tudo, retorna arr.length");

        Assert.resumo();
    }
}
