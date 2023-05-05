package Exercicio2;

import java.util.Scanner;

public class Ex2 {
    public static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Informe seu nome: ");
        System.out.println(dizerInfo(entrada.next()));

        System.out.println("Informe sua idade: ");
        System.out.println(dizerInfoIdade(entrada.nextInt()));

        System.out.println("Informe seu peso e altura: ");
        System.out.println(dizerInfoPeso(entrada.nextDouble(), entrada.nextDouble()));

    }
    public static String dizerInfo(String nome){
        System.out.println("Meu nome é: "+nome);
        return nome;
    }
    public static String dizerInfoIdade(int idade){
        return "Minha idade é " + idade;
//       String Anos = String.valueOf(idade);
//tentei usar isso aqui mas não era o que o exercicio pedia
    }
    public static String dizerInfoPeso(double peso, double altura){

        return "Meu peso é: "+peso+ " e minha altura é: "+altura;
    }

}