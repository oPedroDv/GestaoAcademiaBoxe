package gestao_academia;

public class Membro {
    protected String nome;
    protected double mensalidade;

    public Membro(String nome, double mensalidade) {
        this.nome = nome;
        this.mensalidade = mensalidade;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome + ", Mensalidade: " + mensalidade);
    }
}
