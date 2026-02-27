package gestao_academia;

public class Treinador extends Membro {
    protected String especialidade;
    protected String experiencia;

    public Treinador(String especialidade, String nome, double valorAula, String experiencia) {
        super(nome, valorAula);
        this.especialidade = especialidade;
        this.experiencia = experiencia;

    }

    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Especialidade: " + this.especialidade + ",Experiencia: " + this.experiencia);
    }

}
