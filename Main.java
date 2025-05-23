import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    //a
	static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {

        List<Cuenta> cuentas = new ArrayList<>();

        Cuenta cuentaAutenticada = null;

        System.out.println("----------------------------------------------------");
        System.out.println("Ingrese su Numero de cuenta:");
        String Num_cuenta = entrada.nextLine();
        System.out.println("Ingrese su Nip:");
        String Nip = entrada.nextLine();
        System.out.println("----------------------------------------------------");

        cuentaAutenticada = autenticarCuenta(Num_cuenta, Nip, cuentas);

        if(cuentaAutenticada != null) {
            // Menú de operaciones
            int opcion;
            do {
                System.out.println("\n==== Menú de operaciones ====");
                System.out.println("1. Hacer retiro");
                System.out.println("2. Hacer transferencia");
                System.out.println("3. Salir");
                System.out.print("Seleccione una opción: ");
                opcion = entrada.nextInt();

                switch (opcion) {
                    case 1:
                        //Retirar
                        break;
                    case 2:
                        //Transferir
                        break;
                    case 3:
                        //Salir
                        break;
                    default:
                        //Opcion invalida
                }
            } while (opcion != 3);

            entrada.close();
        }else {
        	System.out.println("===============================================");
            System.out.println("Alguno de sus datos es erroneo, intente denuevo");
        	System.out.println("===============================================");
        }
    }
    public String getNombre(){
        return getNombre();
    }

    private static Cuenta autenticarCuenta(String numeroCuenta, String nip, List<Cuenta> cuentas) {
        for (Cuenta c : cuentas) {
            if (c.getNumeroCuenta().equalsIgnoreCase(numeroCuenta) && c.verificarNip(nip)) {
                return c;
            }
        }
        return null;
    }
}

