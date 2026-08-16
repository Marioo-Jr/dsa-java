import util.Assert;

/* LeetCode 295 — Find Median from Data Stream [Hard] | Tópico: Heap / Priority Queue
 * Padrão: max-heap para a metade menor + min-heap para a metade maior (Two Heaps)
 *
 * MINHA IDEIA (escrever ANTES de codar):
 *   1.
 *   2.
 *   3.
 *
 * Complexidade:  addNum O(log n)  findMedian O(1)  espaço O(n)
 * Status: sozinho | com dica | viu o vídeo
 * Vídeo: ver PLAYLIST_INDEX.md
 */
public class FindMedianFromDataStream {

    public FindMedianFromDataStream() {
        throw new UnsupportedOperationException("TODO");
    }

    public void addNum(int num) {
        throw new UnsupportedOperationException("TODO");
    }

    public double findMedian() {
        throw new UnsupportedOperationException("TODO");
    }

    public static void main(String[] args) {
        FindMedianFromDataStream mf = new FindMedianFromDataStream();
        mf.addNum(1);
        mf.addNum(2);
        Assert.equals(1.5, mf.findMedian(), "mediana de [1,2] -> 1.5");
        mf.addNum(3);
        Assert.equals(2.0, mf.findMedian(), "mediana de [1,2,3] -> 2.0");

        FindMedianFromDataStream mf2 = new FindMedianFromDataStream();
        mf2.addNum(-1);
        Assert.equals(-1.0, mf2.findMedian(), "mediana com 1 elemento negativo");
        mf2.addNum(-2);
        Assert.equals(-1.5, mf2.findMedian(), "mediana de [-2,-1] -> -1.5");
        mf2.addNum(-3);
        Assert.equals(-2.0, mf2.findMedian(), "mediana de [-3,-2,-1] -> -2.0");
        mf2.addNum(-4);
        Assert.equals(-2.5, mf2.findMedian(), "mediana de [-4,-3,-2,-1] -> -2.5");

        Assert.resumo();
    }
}
