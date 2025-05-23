public abstract class Cuenta {
protected String numeroCuenta;
protected Cliente cliente;
protected double saldo;
private String nip;

public Cuenta(String numeroCuenta, Cliente cliente, double saldo, String nip) {
    this.numeroCuenta = numeroCuenta;
    this.cliente = cliente;
    this.saldo = saldo;
    this.nip = nip;
}

public String getNumeroCuenta() {
    return numeroCuenta;
}

public Cliente getCliente() {
    return cliente;
}

public double getSaldo() {
    return saldo;
}

public void setNumeroCuenta(String numeroCuenta) {
    this.numeroCuenta = numeroCuenta;
}

public void setCliente(Cliente cliente) {
    this.cliente = cliente;
}

public void setSaldo(double saldo) {
    this.saldo = saldo;
}

public boolean verificarNip(String nipIngresado) {
    return this.nip.equals(nipIngresado);
}

}