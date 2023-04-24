package appilication;

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args){
        Scanner leitor = new Scanner (System.in);// entrada do usuario
        String entrada = leitor.next();// entrada vai ser uma palavra que pode ser altera pelo usuario
        String saida = " ";// para o retorno da entrada

        for (int i = entrada.length() -1; i>=0; i--){
           saida = saida +  entrada.charAt(i);//o charat pega o caracter do indice determinado, com isso concatenando todos os caracters do final pro começo
        }
        System.out.println(saida);
    }

}

