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
    
    public Retiro retirar(Cuenta cuenta, double monto) {
      if (cuenta.getSaldo() >= monto) {
          cuenta.setSaldo(cuenta.getSaldo() - monto);
          Retiro retiro = new Retiro(generarId(), new Date(), monto, cuenta.getCliente(), banco);
          retiro.imprimirTicket();
          return retiro;
      } else {
          System.out.println("Saldo insuficiente.");
          return null;
      }
  }

  public Transferencia transferir(Cuenta origen, Cuenta destino, double monto) {
      if (origen.getSaldo() >= monto) {
          origen.setSaldo(origen.getSaldo() - monto);
          destino.setSaldo(destino.getSaldo() + monto);
          Transferencia transferencia = new Transferencia(generarId(), new Date(), monto, origen.getCliente(), banco, destino);
          transferencia.imprimirTicket();
          return transferencia;
      } else {
          System.out.println("Saldo insuficiente para transferir.");
          return null;
      }
  }

  private String generarId() {
      return UUID.randomUUID().toString();
  }
}