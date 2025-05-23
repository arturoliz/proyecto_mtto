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

    @Override
    public void imprimirTicket() {
        super.imprimirTicket();
        System.out.println("Cuenta destino: " + cuentaDestino.getNumeroCuenta());
        System.out.println("Titular destino: " + cuentaDestino.getCliente().getNombre());
        System.out.println("----------------------------------");
    }
}