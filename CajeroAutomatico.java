import java.util.Date;
import java.util.UUID;

public class CajeroAutomatico {
    private String ubicacion;
    private Banco banco;

    public CajeroAutomatico(String ubicacion, Banco banco) {
        this.ubicacion = ubicacion;
        this.banco = banco;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }
}