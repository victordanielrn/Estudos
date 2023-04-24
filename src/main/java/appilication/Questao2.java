package appilication;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = 0;
        int n2 = 1;
        int n3 = 0;
        int i;

        System.out.println("Digite um numero que seja da sequencia de fibonacci: ");
        i= sc.nextInt();

        while (i > n3 ){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }

        if (i == 0) {
            System.out.println("O numero 0 esta na sequencia de fibonacci.  O proximo numero e : 1");
        } else if (i == n3) {
            System.out.println("O numero " + i + " essa sequencia faz parte da sequencia fibonacci. O proximo numero e : " + (n1+i));
        } else {
            System.out.println("Este numero nao faz parte da sequencia de fibonacci");
        }
    }
}
