package projeto;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        SistemaDeFinancas sistema = new SistemaDeFinancas();

        Observador observador1 = new Observador() {
            @Override
            public void atualizar() {
                System.out.println("Atualização recebida pelo observador 1.");
            }
        };

        Observador observador2 = new Observador() {
            @Override
            public void atualizar() {
                System.out.println("Atualização recebida pelo observador 2.");
            }
        };

        sistema.registrarObservador(observador1);
        sistema.registrarObservador(observador2);

        Categoria categoriaAlimentacao = new Categoria("Alimentação");
        CriadorDeDespesas criador = new CriadorDeDespesasConcreto();
        Despesa despesa1 = criador.criarDespesa(50.0, new Date(), "Jantar", categoriaAlimentacao);

        sistema.adicionarDespesa(despesa1);

        Meta meta1 = new Meta(500.0, new Date());
        sistema.adicionarMeta(meta1);
    }
}
