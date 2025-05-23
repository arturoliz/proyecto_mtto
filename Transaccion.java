import java.util.Date;

public class Transaccion implements TicketImprimible {
    protected String id;
    protected Date fecha;
    protected String tipo;
    protected double monto;
    protected Cliente cliente;
    protected Banco banco;

    public Transaccion(String id, Date fecha, String tipo, double monto, Cliente cliente, Banco banco) {
        this.id = id;
        this.fecha = fecha;
        this.tipo = tipo;
        this.monto = monto;
        this.cliente = cliente;
        this.banco = banco;
    }

    public String getId() {
        return id;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public double getMonto() {
        return monto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    @Override
    public void imprimirTicket() {
        System.out.println("----- TICKET DE TRANSACCIÓN -----");
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Banco: " + banco.getNombre());
        System.out.println("Tipo de Transacción: " + tipo);
        System.out.println("Monto: $" + monto);
        System.out.println("Fecha: " + fecha);
        System.out.println("----------------------------------");
    }
}
