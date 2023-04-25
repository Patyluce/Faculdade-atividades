import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int [] vet= new int[10] ;
         int maior, menor;

         for ( int i = 0 ; i < vet.length ; i++){
             System.out.print("Digite o valor " + (i + 1) + " do vetor: ");
              vet[i] = sc.nextInt();
         }


       exibeVetor(vet);

        double media = media(vet);
        System.out.println();
        System.out.printf("A média dos vetores é: %.2f " , media);
         maior = maior(vet);
        System.out.print("\nO maior valor é: " + maior);
        menor = menor(vet);
        System.out.print("\nO menor valor é: " + menor);


        System.out.print("\nDigite a chave que deseja encontrar: ");
        int chave = sc.nextInt();

         int pesquisa = buscaSequencial(vet,chave);

        if (pesquisa != -1) {
            System.out.print("\nA chave " + chave + " foi encontrada  usando pesquisa sequencial simples.");
        } else {
            System.out.print("\nA chave " + chave + " não foi encontrada usando pesquisa sequencial simples.");
        }

        }
        public static void exibeVetor(int [] vet){

        for (int i = 0 ; i < vet.length ; i++ ){
            System.out.print(vet[i] + " , ");
        }
        }
        public  static double media(int [] vet){
          double soma = 0.0;

           for (int i = 0 ; i< vet.length ; i++){
               soma = soma + vet[i];
           }
           return (soma/vet.length);
        }
        public static int maior(int [] vet){
        int maior = vet[0];
             for (int i = 0 ; i < vet.length ; i++){
                 if (vet[i] > maior){
                    maior = vet[i];
                 }
             }
             return (maior);
        }
        public  static int menor(int [] vet){
            int menor = vet[0];
            for (int i = 0 ; i < vet.length; i++){
                if (vet[i] < menor){
                    menor = vet[i];
                }
            }
            return (menor);
        }
    public static int buscaSequencial (int [] vet,int chave) {

        for (int i = 0; i < vet.length; i++) {
            if (vet[i] == chave) {
                return i;
            }
        }
        return  -1;
    }
    }
