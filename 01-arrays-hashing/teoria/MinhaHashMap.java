import util.Assert;

/* 01 — Arrays & Hashing | Teoria: Hash Implementation
 * Lição de referência: NeetCode DSA for Beginners → "Hash Usage" e "Hash Implementation"
 *
 * IDEIA: um HashMap guarda pares chave-valor num array de "baldes" (buckets).
 * Uma função de hash transforma a chave num índice do array. Como chaves
 * diferentes podem cair no mesmo índice (colisão), cada balde guarda uma
 * lista de pares — aqui, resolvido por "chaining" (encadeamento).
 *
 * get/put são O(1) médio *só* porque a função de hash distribui bem as
 * chaves. Implementar isso do zero é o que torna "O(1) médio, O(n) pior
 * caso" concreto em vez de decorado.
 *
 * ANTES DE CODAR, escreva aqui sua ideia em 3 linhas:
 *   1.
 *   2.
 *   3.
 */
public class MinhaHashMap {

    private static class No {
        String chave;
        int valor;
        No proximo;
        No(String chave, int valor) { this.chave = chave; this.valor = valor; }
    }

    private No[] baldes;
    private int quantidadeBaldes = 16;

    public MinhaHashMap() {
        baldes = new No[quantidadeBaldes];
    }

    // TODO: função de hash simples. Some os códigos dos caracteres da chave
    // (chave.charAt(i)) e faça módulo por quantidadeBaldes. Cuidado com
    // números negativos se usar outra fórmula.
    private int hash(String chave) {
        throw new UnsupportedOperationException("TODO");
    }

    // TODO: insere ou atualiza. Ache o balde com hash(chave). Percorra a
    // lista encadeada: se achar um nó com a mesma chave, atualize o valor. Se
    // não achar, adicione um nó novo no início (ou fim) da lista do balde.
    public void put(String chave, int valor) {
        throw new UnsupportedOperationException("TODO");
    }

    // TODO: retorna o valor associado à chave, ou -1 se não existir.
    public int get(String chave) {
        throw new UnsupportedOperationException("TODO");
    }

    // TODO: retorna true se a chave existe.
    public boolean containsKey(String chave) {
        throw new UnsupportedOperationException("TODO");
    }

    // TODO: remove a chave (se existir) da lista encadeada do balde.
    public void remove(String chave) {
        throw new UnsupportedOperationException("TODO");
    }

    public static void main(String[] args) {
        MinhaHashMap map = new MinhaHashMap();

        Assert.equals(-1, map.get("a"), "chave inexistente retorna -1");
        Assert.isTrue(!map.containsKey("a"), "containsKey false antes de inserir");

        map.put("a", 1);
        map.put("b", 2);
        Assert.equals(1, map.get("a"), "get após put");
        Assert.isTrue(map.containsKey("b"), "containsKey true após put");

        map.put("a", 99); // atualização, não duplicação
        Assert.equals(99, map.get("a"), "put sobrescreve valor existente");

        map.remove("b");
        Assert.equals(-1, map.get("b"), "get após remove");

        // Colisão proposital: chaves diferentes que podem cair no mesmo balde
        // com uma hash function simples — testa se a lista encadeada funciona.
        for (int i = 0; i < 50; i++) {
            map.put("chave" + i, i);
        }
        Assert.equals(25, map.get("chave25"), "resolve colisões com muitas chaves");

        Assert.resumo();
    }
}
