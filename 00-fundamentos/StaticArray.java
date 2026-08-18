import util.Assert;

/* Fase 0 — Fundamentos | RAM & Static Arrays
 *
 * IDEIA: um array estático tem tamanho fixo, alocado como um bloco contíguo
 * de memória. Acesso por índice é O(1) porque o endereço é calculado
 * diretamente: endereco_base + (indice * tamanho_do_elemento). Isso é a base
 * de por que arrays são rápidos para leitura mas caros para inserir/remover
 * no meio (tem que deslocar tudo).
 *
 * Este arquivo é só para fixar manipulação básica de índice antes de ir para
 * Dynamic Arrays (próximo tópico, dentro de 01-arrays-hashing/teoria).
 *
 * ANTES DE CODAR, escreva aqui sua ideia em 3 linhas para cada função:
 *      elementoDoMeio
 *   1. dividir o array por 2 vai pegar o numero do meio sempre, mesmo adicionando mais numeros no array.
 *   2. posso pegar o tamanho do array usando o length e depois dividir baseado no numero, porem n sei se devo me preocupar com resto
 *   3. 
 *   
 *    inverter
 *    1. talvez eu tenha que fazer um for para percorrer o arr, e fazer um contador para percorrer pra frente e depois um outro -1 para traz, e de alguma forma compara esse for
 *      pq quando eles estiverem no meio o numero vai ser igual e ai eles param, porem eu acho que fazendo isso eu crio um novo array
 *    2. nao sei se e possivel chamar uma funcao direta sem ter que criar uma variavel para armazenar o resultao
 *    3. talvez eu tenha que criar um novo arr e depois armazenar o resultado no arr da funcao
 * 
 *    somar todos os elementos
 *    1.imagino que vou ter que fazer um for, passar por todos os numeros e criar uma variavel que vai receber esse valor +=
 *    2.
 *    3.
 * 
 *    indiceDoMaior
 *    1. eu imagino que eu tenho que fazer um while pq tenho que passar por todos os numeros do arr usando o indice e comparar um com o outro.
 *    2. entao preciso usar um for e dentro do for um if para comparar os resultados.
 *     
 * 
 *    deslocarEinserir
 *    1. ta, entao eu recebo 3 parametros o array, a posicao que vai ser inserido, e o numero que vai ser inserido na posicao.
 *      Eu imagino que o primeiro passo é excluir o ultimo numero do array, e depois comparar oque precisa ser movido, se eu vou inserir
 *      no indice 1 o indice 0 mantem igual. 
 * 
 */
public class StaticArray {

    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};

        Assert.equals(30, elementoDoMeio(a), "elemento do meio de array ímpar");
        Assert.arrayEquals(new int[]{50, 40, 30, 20, 10}, inverter(a.clone()), "inverter in-place");
        Assert.equals(150, soma(a), "soma de todos elementos");
        Assert.equals(4, indiceDoMaior(a), "índice do maior elemento");
        Assert.arrayEquals(new int[]{10, 99, 20, 30, 40}, deslocarEinserir(a.clone(), 1, 99), "inserir com deslocamento");

        Assert.resumo();
    }

    // TODO: retorna o elemento do meio (assuma tamanho ímpar).
    static int elementoDoMeio(int[] arr) {
       
       return arr[arr.length /2];
    }

    // TODO: inverte o array IN-PLACE (sem criar outro array) usando dois
    // ponteiros (início e fim) que se cruzam no meio, e retorna o mesmo array.
    static int[] inverter(int[] arr) {

        int inicio = 0;
        int fim = arr.length-1;

        while (inicio < fim) {
            

            int temp = arr[inicio];
            arr[inicio] = arr[fim];
            arr[fim] = temp;
            
            inicio++;
            fim--;
        
        }
        
        return arr;
    }

    // TODO: soma todos os elementos.
    static int soma(int[] arr) {
        
        int soma = 0;

        for(int i = 0; arr.length > i; i++){
            soma += arr[i];
        }
        return soma;
    }

    // TODO: retorna o índice do maior elemento (primeira ocorrência em caso de empate).
    static int indiceDoMaior(int[] arr) {
        int indice = 0;

        for(int i = 1; arr.length > i; i++){
            if (arr[indice] < arr[i]) {
                indice = i;
            }
        }
        return indice;
    }

    // TODO: insere `valor` no índice `pos`, deslocando os elementos a partir
    // dali uma casa pra direita (o último elemento "cai fora" do array, já
    // que o tamanho é fixo — essa é exatamente a limitação que Dynamic Arrays
    // resolve, próximo tópico).
    static int[] deslocarEinserir( int[] arr, int pos, int valor) {
        
        

        for(int i = arr.length-1; pos < i ;i--){
            
            arr[i] = arr[i-1];
            
        }
        arr[pos] = valor;
        return arr;
    }
}
