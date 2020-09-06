import java.util.Scanner;

public class TestaConta {

        /*
         * 
         * Criar uma interface com o usuario, onde ele deverá fornecer:
         * 1. Nome
         * 2. Telefone
         * 3. Email
         * 4. Agencia 
         * 5. Conta
         * 6. Saldo inicial
         * 
         * O usuario deverá executar as operações:
         * 1. Deposita
         * 2. Saque
         * 3. Consulta Saldo
         *
         */

	public static void main(String args[]) {
        //Recebendo o valor da linha de comando
        double valor = Double.parseDouble(args[0]);
        
        //Criando uma nova conta
        Conta conta = new Conta(333);
        conta.setAgencia(3);
        System.out.println(conta.getAgencia());
        
        //Usando a conta
        conta.deposita(valor);
        conta.saca(33);
        conta.saca(1550);

        System.out.println("Saldo atual: "+ conta.saldo);

	} 

}
