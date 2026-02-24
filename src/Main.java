import java.util.Scanner;
public class Main {

    static Scanner scanner = new Scanner(System.in);
    static Aluno ultimoAluno;
    public static void main(String[] args) {

        int opcao;

        do {
            mostrarMenu();
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpa o ENTER no nextInt()


            switch (opcao) {

                case 1:
                    cadastrarAluno();
                    break;

                case 2:
                    mostrarAluno();
                    break;

                case 3:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opcao invalida!!");
            }

        }while (opcao != 3) ;
    }
    public static void mostrarMenu(){
        System.out.println("\n===== Menu =====");
        System.out.println("1 - Cadastrar Aluno");
        System.out.println("2 - Mostrar Aluno");
        System.out.println("3 - Sair");
        System.out.println("Escolha: ");
    }

    public static void cadastrarAluno(){

        System.out.println("Digite o nome do Aluno: ");
        String nome = scanner.nextLine();

        System.out.println("Digite sua nota 1: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite sua nota2 :");
        double nota2 = scanner.nextDouble();
        scanner.nextLine(); // limpa o Buffer

        double media = (nota1 + nota2) / 2;

        // Criar objeto Aluno
        ultimoAluno  = new Aluno(nome, media);
        System.out.println("Aluno cadastrado com sucesso!");
    }

    // Guardar esse aluno em variavel global se quiser usar depois


    public static void mostrarAluno(){
        if (ultimoAluno != null){
            ultimoAluno.mostrarSituacao();
        } else {
            System.out.println("Nenhum aluno cadastrado ainda!!");
        }
    }

}