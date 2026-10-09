import java.util.Scanner;

public class Main {

    // Função principal, ou função pela qual a IDE executa o projeto
     public static void main(String[] args) {

         // comando de Saida de dados
         System.out.println("Olá Adas Dev");

// comando de entrada de dados
         Scanner leitor = new Scanner(System.in);

         // Declarando variavéis
         String aluno = "Harry";
         int codigo = 123;
         double media = 7.8;
         boolean alunoAprovado = true;

         // Recebendo valores do usuário
         System.out.println("Óla diga qual seu nome ");
         String nome = leitor.next();

         System.out.println("Seja bem vindo ao sistema " + nome);

         // Condicional IF
         System.out.println("DIgite sua idade ");
         int idade = leitor.nextInt();

         if (idade >= 18) {
             System.out.println("Você já é MAIOR  de idade!");
         } else {
             System.out.println("Ainda tem menos que 18 anos...");
         }

         // Repetição FOR
         for (int contador = 1; contador <= idade; contador++) {
             System.out.println(contador + " - ");
         }

     }

}
