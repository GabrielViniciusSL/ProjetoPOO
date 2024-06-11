package projeto;

import java.util.Date;

public class Meta {
    private double valorMeta;
    private Date dataLimite;

    public Meta(double valorMeta, Date dataLimite) {
        this.valorMeta = valorMeta;
        this.dataLimite = dataLimite;
    }

    public double getValorMeta() {
        return valorMeta;
    }

    public Date getDataLimite() {
        return dataLimite;
    }
}
