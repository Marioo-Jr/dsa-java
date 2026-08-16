import util.Assert;

/* 18 — Bit Manipulation | Teoria: Bit Manipulation
 * Lição de referência: NeetCode DSA for Beginners → "Bit Manipulation"
 *
 * IDEIA: um int em Java tem 32 bits. Cada bit i (contando da direita, i=0 é o
 * bit menos significativo) pode ser lido, ligado ou desligado com operadores
 * bit a bit:
 *   - getBit:   (num >> i) & 1            -> desloca o bit i até a posição 0 e isola com & 1
 *   - setBit:   num | (1 << i)            -> liga o bit i sem mexer nos outros
 *   - clearBit: num & ~(1 << i)           -> desliga o bit i sem mexer nos outros
 *   - countBits: percorrer os 32 bits (ou usar num & (num-1) para apagar o bit
 *     1 menos significativo a cada iteração) e contar quantos são 1
 *
 * Esses 4 blocos aparecem disfarçados em quase todo problema de bit
 * manipulation da trilha (Single Number, Counting Bits, Reverse Bits...).
 *
 * ANTES DE CODAR, escreva aqui sua ideia em 3 linhas:
 *   1.
 *   2.
 *   3.
 */
public class BitsBase {

    // TODO: retorna true se o bit i de num é 1, false se é 0.
    public static boolean getBit(int num, int i) {
        throw new UnsupportedOperationException("TODO");
    }

    // TODO: retorna num com o bit i ligado (setado para 1), demais bits inalterados.
    public static int setBit(int num, int i) {
        throw new UnsupportedOperationException("TODO");
    }

    // TODO: retorna num com o bit i desligado (setado para 0), demais bits inalterados.
    public static int clearBit(int num, int i) {
        throw new UnsupportedOperationException("TODO");
    }

    // TODO: conta quantos bits 1 num tem (sem usar Integer.bitCount).
    public static int countBits(int num) {
        throw new UnsupportedOperationException("TODO");
    }

    public static void main(String[] args) {
        Assert.isTrue(getBit(0b1010, 1), "bit 1 de 1010 é 1");
        Assert.isTrue(!getBit(0b1010, 0), "bit 0 de 1010 é 0");

        Assert.equals(0b1011, setBit(0b1010, 0), "liga o bit 0 de 1010");
        Assert.equals(0b1010, setBit(0b1010, 1), "bit já ligado continua ligado");

        Assert.equals(0b1000, clearBit(0b1010, 1), "desliga o bit 1 de 1010");
        Assert.equals(0b1010, clearBit(0b1010, 0), "bit já desligado continua desligado");

        Assert.equals(0, countBits(0), "zero não tem nenhum bit 1");
        Assert.equals(2, countBits(0b1010), "1010 tem 2 bits 1");
        Assert.equals(32, countBits(-1), "-1 em complemento de 2 é 32 bits 1");

        Assert.resumo();
    }
}
