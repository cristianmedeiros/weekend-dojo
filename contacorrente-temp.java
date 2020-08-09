public class ContaCorrente {

    /*
        Notas disponíveis de R$ 100,00; R$ 50,00; R$ 20,00 e R$ 10,00

    */

    public static void main(String args[]){
        
        double valor = Double.parseDouble(args[0]);
        int notas[] = {100, 50, 20, 10};
//                      0    1   2   3
        //Cliente saca 10 reais
        if(valor == 10){
            System.out.println(valor);
        }

        //Cliente saca 90 reais
        //if(valor == 90){
            int contador = 0;
            for(int i = 0; i < notas.length; i++){

                if(valor - notas[contador] >= 0){
                    System.out.println("Valor atual: " + valor);
                    System.out.println("Valor da nota:" + notas[contador]);
                    valor = valor - notas[contador];
                    contador = 0;
                    i = 0;
                }else{
                    contador++;
                }
                

            }
 //       }


        /*
        
        #############
        se for 10 = 10 
        se 20 = 10 e 10 
        90 = 50 + 20 + 20
        
        
        #############
        */

    }
}
