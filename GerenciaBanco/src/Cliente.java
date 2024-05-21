public class Cliente {
    private String nome;
    private String sobrenome;
    private String cpf;
    private double saldo;

    //Construtor
     public Cliente(String nome, String sobrenome, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.saldo = 0.0;
    }

    //Metodos
    public void consultarSaldo(){
        System.out.println("Seu saldo atual é R$ " + saldo);

    }

    public void depositar(double valor){
        if (valor > 0){
            saldo += valor;
            System.out.println("Deposito no valor de R$ " + valor + " realizado com sucesso!");
        }else{
            System.out.println("Valor de deposito invalido!");
        }
    }

    public void sacar(double valor){
        if(valor > 0 && valor <= saldo){
            saldo -= valor;
            System.out.println("Saque no valor de R$ " + valor + " foi realizado com sucesso!");
        }
        else{
            System.out.println("Saldo insuficiente ou valor de saque invalido!");
        }

    }

}
