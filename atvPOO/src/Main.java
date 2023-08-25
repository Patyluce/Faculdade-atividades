public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Patrícia Ester", "123.456.789-01", "Recife", "01234-567", "Brasil");


        Agencia agencia1 = new Agencia(1234);


        ContaCorrente conta1 = new ContaCorrente(cliente1, agencia1, 1001, 1500.0);

        System.out.println("Conta Corrente do(a) : " + conta1.usuario.nome);

        System.out.println("Agência: " + conta1.agencia.num);
        System.out.println("Número da Conta: " + conta1.num);
        System.out.println("Saldo: R$" + conta1.saldo);

        conta1.Deposito(900.0);


    }

    static class Cliente {
        String nome;
        String cpf;
        String estado;
        String cep;
        String pais;

        public Cliente(String nome, String cpf, String estado, String cep, String pais) {
            this.nome = nome;
            this.cpf = cpf;
            this.estado = estado;
            this.cep = cep;
            this.pais = pais;
        }
    }

    static class Agencia {
        int num;

        public Agencia(int num) {
            this.num = num;
        }
    }

    static class ContaCorrente {
        Cliente usuario;
        Agencia agencia;
        int num;
        double saldo;

        public ContaCorrente(Cliente usuario, Agencia agencia, int num, double saldoInicial) {
            this.usuario = usuario;
            this.agencia = agencia;
            this.num = num;
            this.saldo = saldoInicial;
        }
        void Deposito(double valor) {
            saldo += valor;
            System.out.println("Depósito concluído com sucesso. Saldo atual: R$" + saldo);
        }
    }

    static class ContaUniversitaria {
        Cliente usuario;
        Agencia agencia;
        int num;
        double saldo;
        double juros;

        public ContaUniversitaria(Cliente usuario, Agencia agencia, int num, double saldoInicial, double juros) {
            this.usuario = usuario;
            this.agencia = agencia;
            this.num = num;
            this.saldo = saldoInicial;
            this.juros = juros;
        }
        void Saque(double valor) {
            if (saldo >= valor) {
                saldo -= valor;
                System.out.println("Saque realizado. Novo saldo: R$" + saldo);
            } else {
                System.out.println("Saldo insuficiente para o saque.");
            }
        }
    }

    static class Transacoes {
        double saque;
        double deposito;
    }
}
