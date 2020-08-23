
public class TestaConta {
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
