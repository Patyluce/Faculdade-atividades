package Program;
//Dupla: Patrícia Ester e Devid da Silva
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double calculo , desconto , resultado;

        Scanner sc = new Scanner(System.in);
        System.out.print("Nome do produto: ");
        String name = sc.next();
        System.out.println("Valor unitário: ");
        double price = sc.nextDouble();
        System.out.println("Quantidade: ");
        int quantity = sc.nextInt();

        System.out.println();
        System.out.println("Produto: " + name);
        System.out.printf("Total a pagar: %.2f" , calculo = (quantity * price));



        if (quantity <= 5) {

            desconto = calculo * 0.02;
            resultado = calculo - desconto;
            System.out.printf("\nCom desconto : %.2f", resultado);
        }
         else if (quantity >5 && quantity <=10){
            desconto = calculo * 0.03;
            resultado = calculo - desconto;
            System.out.printf("\nCom desconto : %.2f" ,resultado);
        }
    else {
            desconto = calculo * 0.05;
            resultado = calculo - desconto;
            System.out.printf("\nCom desconto : %.2f" ,resultado);
        }
        sc.close();


    }
}
