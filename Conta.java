
public class Conta {

	double saldo;
	private int agencia;
	private int conta;

	public Conta(int conta){
		this.conta = conta;
	}

	public void setAgencia(int agencia){
		this.agencia = agencia;
	}

	public int getAgencia() {
		return agencia;
	}

	public void deposita(double valor)  {
		saldo += valor;
	}

	public boolean saca (double valor) {
		if(this.saldo >= valor){
			this.saldo -= valor;
			return true;
		} else {
			
			System.out.println("Saldo Insuficiente, seu saldo é de "+ saldo + " vc esta tentado sacar "+valor);
			return false;
		} 
		
	}

}
    