import java.util.Scanner;
public abstract class Clase_Abstractaa {
	String numero_cuenta;
    protected int transacciones, retiro, deposito,transferencia;
    private static int saldo;
    Scanner entrada = new Scanner(System.in);

    public void Numero_cuenta(){
    	 numero_cuenta = entrada.nextLine();
    }
	public void Retiro(){
        retiro = entrada.nextInt();
    }
    
    public void Deposito(){
        deposito = entrada.nextInt();
    }
    public void Transferencia(){
        transferencia = entrada.nextInt();
    }
    public abstract void Transacciones();

    public int getSaldo(){
        return saldo;
    }
    
    public void setSaldo(int saldo){
        this.saldo = saldo;
    }
    
}
