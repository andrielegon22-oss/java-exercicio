import java.util.Scanner;

public class ExercícioSequenciaImpressao {
    /*
    Imprimir uma sequencia de números seguindo as regras abaixo
    - pedir para o usuário o número final da contagem
    - imprimir a contagem até o número informado sendo
         -se o número for PAR imprimir o dobro do número
         - se o número for IMPAR imprimir a multiplicação do numero por 3
         - ao final do laço, imprimir o maior número PAR e o menor numero IMPAR
     */

    public static void main(String[] args) {
        System.out.println("Olá úsuario");

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digíte uma sequência de números");
        int numero = leitor.nextInt();

        int maiorPar = 0;
        int maiorImpar = 0;

        for (int contador = 1; contador <= numero; contador++) {

            int auxiliar = 0;

            if (contador % 2 == 0) {

                auxiliar = contador * 2;
                System.out.println((contador * 2) + " - ");
            } else {
                System.out.println((contador * 3) + " - ");
            }
        }
    }

    }