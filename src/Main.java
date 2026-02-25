import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Aluno> alunos = new ArrayList<>();

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
                    buscarAluno();
                    break;

                case 4:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opcao invalida!!");
            }

        }while (opcao != 4) ;
    }
    public static void mostrarMenu(){
        System.out.println("\n===== Menu =====");
        System.out.println("1 - Cadastrar Aluno");
        System.out.println("2 - Mostrar Aluno");
        System.out.println("3 - Buscar aluno pelo nome");
        System.out.println("4 - Sair");
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

        Aluno aluno = new Aluno(nome, media);
        alunos.add(aluno);
        System.out.println("Aluno cadastrado com sucesso!!");
    }


    public static void mostrarAluno(){

        if (alunos.isEmpty()){
            System.out.println("Nenhum aluno cadastrado.");
            return;
        }

        for (Aluno aluno : alunos) {
            aluno.mostrarSituacao();
        }
    }

    public static void buscarAluno(){
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado!");
            return;
        }

        System.out.println("Digite o nome do aluno para busca: ");
        String nomeBusca = scanner.nextLine();

        boolean encontrado = false;

        for (Aluno aluno : alunos) {

            if (aluno.nome.equalsIgnoreCase(nomeBusca)) {
                aluno.mostrarSituacao();
                encontrado = true;
                break;
            }
        }

        if(!encontrado) {
            System.out.println("Aluno nao encontrado!");
        }
    }

}