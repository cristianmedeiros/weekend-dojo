
public class TestaConta {
	public static void main(String args[]) {
        //Recebendo o valor da linha de comando
		double valor = Double.parseDouble(args[0]);
        
        //Criando uma nova conta
        Conta conta = new Conta(333);
        conta.setAgencia(3);
        System.out.println(conta.getAgencia());
        
        //Usando a conta
        conta.processamento(valor);
        conta.deposita(500.5);
        conta.deposita(50.5);
        conta.deposita(10.5);
        System.out.println(conta.saldo);

	}


}
