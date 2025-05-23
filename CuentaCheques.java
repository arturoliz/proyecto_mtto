public class CuentaCheques extends Cuenta {
  public CuentaCheques(String numeroCuenta, Cliente cliente, double saldoInicial, String nip) {
      super(numeroCuenta, cliente, saldoInicial, nip);
  }

  @Override
  public String getTipoCuenta() {
      return "Cuenta de Cheques";
  }
}
