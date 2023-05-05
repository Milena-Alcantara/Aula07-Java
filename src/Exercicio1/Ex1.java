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
        System.out.println( "1 - Controlar o som \n 2 - Mudar de Canal \n 3 - Consultar Volume e Canal Atual");
        Decidir(entrada.nextInt());
    }
    public static void  Decidir(int VolouCanal){

        switch (VolouCanal){
            case 1:
                aumentarVol();
                break;
            case 2:
                mudarcanal();
                break;
            case 3:
                verifCanaleSom();
            default:
                System.out.println("Opção inválida.");
        }
    }
    public static int aumentarVol(){
        System.out.println(" Informe: \n 1 - Para Aumentar o volume \n 2- Para Diminuir");
        int opcao = entrada.nextInt();
       int volume = 0;
        if(opcao == 1){
            for (int i = 0; i <=10 ; i++) {
                volume++;
            }

        } else if (opcao == 2) {
            if(volume <=10){
            volume --;
        }else;
//Tentei até aqui pois foi onde consegui ;-;

    }

    }
}
