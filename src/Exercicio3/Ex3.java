package Exercicio3;
import java.util.Scanner;
public class Ex3 {
    //  Escreva um método Java que recebe a nota de um aluno como um
//double e a classifique e retorne um char de acordo com as seguintes
//regras:
  public static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Informe a nota do Aluno: ");
        System.out.println(RetornarClassAl(entrada.nextDouble()));

    }

    public static char RetornarClassAl (double nota){
        if(nota >= 9.00 ){
            return 'A';
        } else if (nota< 9.00 && nota >=8.00 ) {
            return 'B';
            
        } else if (nota < 8.00 && nota >= 7.00) {
            return 'C';
            
        } else if (nota< 7.00 && nota >= 6.00) {
            return 'D';
            
        }else{
            return 'E';
    }
}
}
