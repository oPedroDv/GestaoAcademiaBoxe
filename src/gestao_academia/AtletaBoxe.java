package gestao_academia;

public class AtletaBoxe extends Membro {
    private String categoria;

    public AtletaBoxe(String nome, double mensalidade, String categoria) {
        super(nome, mensalidade);
        this.categoria = categoria;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Categoria: " + this.categoria);
    }
}
