import java.util.Scanner;
//Patrícia Ester
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char resposta;
        CadastroProdutos cadastrar = new CadastroProdutos();

        System.out.println("-------Seja muito bem vindo!------");
        System.out.println();
        System.out.println("Adicione o(s) produto(s) seguindo o passo a passo abaixo:");

        do {
            System.out.print("Nome: ");
            String nome = sc.next();

            System.out.print("Preco: ");

            double preco = sc.nextDouble();

            cadastrar.AdicionarProduto(nome, preco);
            System.out.print("Deseja continuar? s/n");
            resposta = sc.next().charAt(0);

        } while (resposta == 's');


        char res;
        do {
            System.out.print("Deseja buscar algum produto? s/n ");
            res = sc.next().charAt(0);

            if (res == 's') {
                System.out.print("Id do produto: ");
                int id = sc.nextInt();
                Produto pro = cadastrar.BuscarProdutos(id);

                if (pro != null) {
                    System.out.print(pro.getNome() + " , " + pro.getPreco());

                    System.out.print("\nDeseja atualizar esse produto ? s/n");
                    res = sc.next().charAt(0);

                    if (res == 's') {
                        System.out.print("Digite o novo nome: ");
                        String novoNome = sc.next();
                        System.out.print("Digite o novo preço: ");
                        double novoPreco = sc.nextDouble();

                        cadastrar.AtualizarProduto(id, novoNome, novoPreco);


                        System.out.println();
                        System.out.println("Produto atualizado:");
                        System.out.println("Novo Nome: " + novoNome);
                        System.out.println("Novo Preço: " + novoPreco);

                    }
                }
                 else {
                    System.out.println("Produto não encontrado!! Id inexistente!!");
                }
            }


            System.out.print("Deseja continuar? s/n ");
            res = sc.next().charAt(0);

        } while ( res == 's');
        System.out.println("---------------");
        System.out.println("Volte sempre! ");

    }
    }
