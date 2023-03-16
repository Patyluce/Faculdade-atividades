package Program;
//Dupla: Patrícia Ester e Devid da Silva
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double calculo;

        Scanner sc = new Scanner(System.in);
        System.out.println("Nome do produto: ");
        String name = sc.next();
        System.out.println("Valor unitário: ");
        double price = sc.nextDouble();
        System.out.println("Quantidade: ");
        int quantity = sc.nextInt();

        System.out.println();
        System.out.println("Produto: " + name);
        System.out.printf("Total a pagar: %.2f" , quantity * price);

        if (quantity <= 5) {
            calculo = (quantity * price) - 0.02;
            System.out.printf("\nCom desconto : %.2f" , calculo);
        } else if (quantity >5 && quantity <=10){
           calculo = (quantity * price)  - 0.03;
            System.out.printf("\nCom desconto : %.2f" , calculo);
        }
    else {
            calculo = (quantity * price)  - 0.05;
            System.out.printf("\nCom desconto : %.2f" , calculo);
        }



        sc.close();


    }
}
