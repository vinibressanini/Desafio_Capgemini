package questions;

import java.util.Arrays;
import java.util.Scanner;

public class Question1 {

    public static void main(String[]args){
        int mediana,num;
        int[] arr = new int[7];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0;i < arr.length;i++){
            // Fazendo a coleta dos números pelo console
            System.out.println("Posição " + i);
            num = scanner.nextInt();
            arr[i] = num;
        }
        // Ordena o array
        Arrays.sort(arr);

        // Busca o comprimento do array e divide por 2, descobrindo assim a mediana
        mediana = arr[arr.length/2];
        System.out.println("A mediana é: " + mediana);
    }
}
