
public class Conta {

	double saldo;
	private int agencia;
	private int conta;
	public String titular;

	public Conta(int conta){
		this.conta = conta;
	}

	public void setAgencia(int agencia){
		this.agencia = agencia;
	}

	public int getAgencia() {
		return agencia;
	}

	public int getConta(){
		return conta;
	}

	public void setConta(int conta){
		this.conta = conta;
	}

	public void setTitular(String titular){
		this.titular = titular;
	}

	public String getTitular(){
		return this.titular;
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
    