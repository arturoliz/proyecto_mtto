import java.util.Date;
public class Retiro extends Transaccion {

	public Retiro(String id, Date fecha, double monto, Cliente cliente, Banco banco) {
		super(id, fecha, "Retiro", monto, cliente, banco);
}
}
