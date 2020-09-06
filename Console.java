import java.util.Scanner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Console {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Digite sua conta: ");
        int c = s.nextInt();

        System.out.println("Digite sua agencia: ");
        int a = s.nextInt();

        System.out.println("Digite o saldo inicial: ");
        float saldoInicial = s.nextFloat();

        //Criando uma nova conta
        Conta conta = new Conta(c);
        conta.setAgencia(a);
        conta.setConta(c);
        System.out.println(conta.getAgencia());
        
        //Usando a conta
        conta.deposita(saldoInicial);
        conta.saca(33.3);
        conta.saca(1550);

        conta.setTitular("titular");

        System.out.println("Saldo atual: "+ conta.saldo);

        ContaDao dao = new ContaDao();
        dao.adiciona(conta);

    }
}