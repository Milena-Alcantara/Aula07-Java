package Exercicio1;
//Crie um programa que pode controlar o volume e trocar os canais
//da televisão. O controle de volume permite:
//a. aumentar ou diminuir a potência do volume de som em uma
//unidade de cada vez;
//b. aumentar e diminuir o número do canal em uma unidade
//trocar para um canal indicado;
//c. consultar o valor do volume de som e o canal selecionado.
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Ex1 {
    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Informe a opção desejada: ");
        System.out.println("1 - Controlar o som \n 2 - Mudar de Canal ");
        Decidir(entrada.nextInt());

    }

    public static void Decidir(int VolouCanal) {

        switch (VolouCanal) {
            case 1:
                aumentarVol();
                break;
            case 2:
                mudarcanal();
                break;

            default:
                System.out.println("Opção inválida.");
        }
    }
   public static int volume [] = {0,1,2,3,4,5,6,7,8,9,10};
    public static int opcao;
    public static void aumentarVol() {
        System.out.println(" Informe: \n 1 - Para Aumentar o volume \n 2- Para Diminuir");
        opcao = entrada.nextInt();


        if (opcao == 1) {
            System.out.println("Informe quanto deseja aumentar: ");

            System.out.println("Seu volume atual é: "+volume[entrada.nextInt()]);
        }else{
            System.out.println("Informe quanto deseja diminuir: ");
            System.out.println("Seu volume atual é: "+volume[entrada.nextInt()]);
        }
        System.out.println("Deseja continuar? \n1 - SIM \n 2 - NÃO");
        opcao = entrada.nextInt();
       switch (opcao){
           case 1:
           System.out.println("1 - Controlar o som \n 2 - Mudar de Canal ");
           Decidir(entrada.nextInt());

           case 2:
               System.out.println("Programa Finalizado.");
               break;
       }

       }
    public static void mudarcanal(){
        String canais [] = {"Globo", "SBT","RecordTV", "Band"};
        System.out.println("Informe o canal desejado: \n 0 - Globo \n 1 - SBT \n 2 - RecordTV \n 3 - Band ");
        System.out.println("Seu canal atual é: "+canais[entrada.nextInt()]);
        System.out.println("Deseja continuar? \n1 - SIM \n 2 - NÃO");
        opcao = entrada.nextInt();
        switch (opcao){
            case 1:
        Decidir(entrada.nextInt());
            case 2:
                System.out.println("Programa Finalizado."); //não consegui fazer com que não repetisse esse comando de programa finalizado :/
                break;


    }

  }
}







