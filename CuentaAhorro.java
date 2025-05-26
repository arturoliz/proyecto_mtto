public class CuentaAhorro extends Cuenta {
  public CuentaAhorro(String numeroCuenta, Cliente cliente, double saldoInicial, String nip) {
      super(numeroCuenta, cliente, saldoInicial,nip);
  }

  @Override
  public String getTipoCuenta() {
    return "Cuenta de Ahorro";
}
}
