public class Aluno {
    // atributos
    String nome;
    double media;

    // Construtor
    public Aluno(String nome, double media){
        this.nome = nome;
        this.media = media;
    }

    // metodo para mostrar situacao
    public void mostrarSituacao(){
        System.out.println("\n===== DADOS DO ALUNO =====");
        System.out.println("Nome: " + nome);
        System.out.println("Media: " + media);

        if (media >= 7){
            System.out.println("Situacao: Aprovado");
        } else if (media >= 5) {
            System.out.println("Situacao: Recuperacao");
        }else{
            System.out.println("Situacao: Reprovado");
        }
    }
}
