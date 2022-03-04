package questions;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        int[] nums = new int[7] ;
        int x,num,pares = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a diferença desejada:");
        x = scanner.nextInt();

        // Coletando números
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Posição " +i);
            num = scanner.nextInt();
            nums[i] = num;
        }

        // Comparando todos os valores do array
        for (int l = 0;l < nums.length; l++ ){
            for (int l2 = 0;l2 < nums.length; l2++){
                if (nums[l] - nums[l2] == x){
                    pares++;
                }
            }
        }
        System.out.println("Pares com diferença de " + x  + ": " + pares);
    }
}
