package gestao_academia;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Membro membro1 = new AtletaBoxe("Pedro", 129.99, "Peso Médio");
        Membro membro2 = new AtletaBoxe("Paulo", 129.99, "Peso Médio");
        Membro m3 = new Treinador("Boxe", "Roberto", 50.0, "Experiente");

        ArrayList<Membro> listaMembros = new ArrayList<>();

        listaMembros.add(membro1);
        listaMembros.add(membro2);
        listaMembros.add(m3);

        double total = 0;

        for (Membro m : listaMembros) {
        m.exibirDados();
        total += m.mensalidade;
        }

        if(total < 400){
            System.out.println("Orçamento está controlado, parabéns!" + total);
        } else {
            System.out.println("Stop! Orçamento estourado" + total);
        }
    }
}
