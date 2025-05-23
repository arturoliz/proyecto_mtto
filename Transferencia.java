import java.util.Date;

public class Transferencia extends Transaccion {
    private Cuenta cuentaDestino;

    public Transferencia(String id, Date fecha, double monto, Cliente cliente, Banco banco, Cuenta cuentaDestino) {
        super(id, fecha, "Transferencia", monto, cliente, banco);
        this.cuentaDestino = cuentaDestino;
    }

    public Cuenta getCuentaDestino() {
        return cuentaDestino;
    }

    public void setCuentaDestino(Cuenta cuentaDestino) {
        this.cuentaDestino = cuentaDestino;
    }

    //metodo de imprimir ticket
}