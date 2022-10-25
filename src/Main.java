/* Solicitar 2 numeros aos usuario (x e y). Imprimir todos os números
primos dentro desse intervalo e armazenar em arrays.*/

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static String valor;
    public static boolean validacao;
    public static int i, j, k, count;


    public static boolean validarEntrada(String texto){
        try {
            Integer.parseInt(texto);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int[] a = new int[2];

        for (i = 0; i <= 1 ; i++) {

            do{
                System.out.printf("Digite o %do valor: ", i+1);
                valor = entrada.nextLine();
                validacao = validarEntrada(valor);

                if(!validacao){
                    System.out.print("ERRO. Valor inserivo invalido. Digite um numero inteiro. ");
                }
            } while (!validacao);

            a[i] = Integer.parseInt(valor);
        }

        Arrays.sort(a);

        for(int valores: a){
            System.out.printf("%d ", valores);
        }
        System.out.println(" ");

        for (j = a[0]; j <= a[1]; j++){

            count = 0;

            for (k = 1; k <= j; k++) {
                if (j%k == 0){
                    count ++;
                }
            }

            if(count == 2){
                System.out.printf("%d ", j);
            }
        }
    }
}