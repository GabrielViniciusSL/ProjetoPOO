package ibmec.edu.br.observer;
import ibmec.edu.br.resources.*;
public class ResumoFinanceiroObserver implements Observer {
    private Usuario usuario;

    public ResumoFinanceiroObserver(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public void update() {
        usuario.exibirResumoFinanceiro();
    }
}
