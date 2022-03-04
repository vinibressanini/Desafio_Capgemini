package questions;

import java.util.Scanner;
import java.lang.Math;

public class Question3 {
    public static void main(String[] args) {
        String frase;
        double raiz,result;

        Scanner scanner = new Scanner(System.in);
        frase = scanner.nextLine();
        //Removendo espaços
        frase = frase.replace(" ", "");

        //Pegando o tamanho da frase
        result = frase.length();

        //Resultado raiz quadrada
        raiz = Math.sqrt(result);

        //Selecionando valores da linha e da tabela
        int linha = (int) Math.floor(raiz);
        int coluna = (int) Math.ceil(raiz);

        //Testando se a multiplicação entre elas é maior que a frase
        if (linha * coluna < result) {
            linha++;
        }

        String[][] msg = new String[linha][coluna];
        int carac = 0;

        //Fazendo a gravação dos caracteres
        for (int i = 0; i < linha; i++) {
            for (int i2 = 0; i2 < coluna; i2++) {
                if (carac < result) {
                    String letra = String.valueOf(frase.charAt(carac));
                    msg[i][i2] = letra;
                    carac++;
                }else{
                    msg[i][i2] = "";
                }
            }
        }

        //Saída de dados
        for (int i = 0;i < coluna;i++){
            System.out.println(" ");
            for (int i2 = 0; i2 < linha;i2++){
                System.out.print(msg[i2][i]);
            }
        }
    }
}