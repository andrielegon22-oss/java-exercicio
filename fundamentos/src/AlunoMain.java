import modelos.Aluno;


public class AlunoMain {
    public static void main(String[] args) {

        // Declarar um objeto do tipo da classe Aluno com construtor vazio
        Aluno aluno1 = new Aluno();

        System.out.println("-- Dados do Aluno --");
        System.out.println("Nome: " + aluno1.nome);

        // Declarar um objeto do tipo da classe Aluno , com construtor com parametros
        Aluno aluno2 = new Aluno( "Harry");
       aluno2.exibirDados();

        Aluno aluno3 = new Aluno("Hermione", 18);
        aluno3.exibirDados();

    }


}

