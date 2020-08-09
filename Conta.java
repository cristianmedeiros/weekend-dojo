
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


    /*
        Notas disponíveis de R$ 100,00; R$ 50,00; R$ 20,00 e R$ 10,00

    */

	public void processamento(double valorentrada){

        double valor = valorentrada;

		int notas[] = {  100, 50, 20, 10  };
				//                      0    1   2   3
		//Cliente saca 10 reais
		if  (valor == 10)  {
			System.out.println(valor);
		}

		//Cliente saca 90 reais
		int contador = 0;
		for  (int i = 0; i < notas.length; i++)  {
			if  (valor - notas[contador] >= 0)  {
				System.out.println("Valor da nota:" + notas[contador]);
				valor = valor - notas[contador];
				i = 0;
				contador = 0;
			}  else  {
				contador++;
			}

		}

	}
}
    