public class Binary {

    public static int binary_search(int[] v, int item) {
        int inicio = 0;
        int fim = v.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim ) / 2;
            int chute = v[meio];

            if (chute == item) {
                return meio;
            } else if (chute > item) {
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) throws Exception {
        int [] vetor = new int[] { -7, -6, -3, -1, 0, 1, 3, 4, 5, 6, 7, 8, 9 };
        int item = 4;
        int posicao = vetor.length -1;

        System.out.println("O vetor possui: "+ posicao +" posições.");
        System.out.println( binary_search(vetor, item) );
    }
}
