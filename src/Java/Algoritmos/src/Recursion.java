public class Recursion {
    static int i = 0;
    static int total = 0;      
    static int maior = 0;

    public static void main(String[] args) throws Exception {

        int vet[] = new int[] {5, 12, 8, 20, 3, 15, 7, 10, 18, 2};

        somar(vet); // 4.1
        contarTamanhoArray(vet); // 4.2
        encontrarMaiorValorArray(vet); // 4.3

    }

    public static void somar(int[] vet) {
        if ( i > (vet.length - 1 ) ) {
            System.out.println("A soma dos elementos: "+ total);
        } else {
            total += vet[i];
            i++;
            somar(vet);
        }
    }

    public static void contarTamanhoArray(int[] vet) {
        if ( i > (vet.length - 1 ) ) {
            System.out.println("A quantidade de itens é: " + total);
        } else {
            System.out.println("O "+( i+1 )+"º item é o: "+ vet[i]);
            total = i+1;
            i++;
            contarTamanhoArray(vet);
        }
    }

    static void encontrarMaiorValorArray( int v[] ) {
        if ( i > v.length-1)  System.out.println("O maior numero do vetor é: "+maior);
        else {
            if (v[i] > maior)
                maior = v[i];
            i++;
            encontrarMaiorValorArray(v);
        }
    }

}
