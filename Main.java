import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    //a
	static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {

        Banco banco = new Banco("Banco BBVA");
        CajeroAutomatico cajero = new CajeroAutomatico("Sucursal Centro", banco);

        List<Cliente> clientes = new ArrayList<>();
        List<Cuenta> cuentas = new ArrayList<>();

        // Clientes y cuentas de ejemplo
        Cliente cliente1 = new Cliente(1, "Juan Pérez", "Calle Falsa 123");
        Cliente cliente2 = new Cliente(2, "Ana Gómez", "Av. Siempre Viva 742");

        Cuenta cuenta1 = new CuentaAhorro("AHO123", cliente1, 5000, "1234");
        Cuenta cuenta2 = new CuentaCheques("CHQ456", cliente2, 3000, "5678");

        clientes.add(cliente1);
        clientes.add(cliente2);
        cuentas.add(cuenta1);
        cuentas.add(cuenta2);

        Cuenta cuentaAutenticada = null;

        System.out.println("=== Bienvenido al Cajero Automático ===");

        for (int intentos = 3; intentos > 0; intentos--) {
            System.out.println("Ingrese su Numero de cuenta:");
            String Num_cuenta = entrada.nextLine();
            System.out.println("Ingrese su Nip:");
            String Nip = entrada.nextLine();
            System.out.println("----------------------------------------------------");
            cuentaAutenticada = autenticarCuenta(Num_cuenta, Nip, cuentas);

            if (cuentaAutenticada != null) {
                System.out.println("\nAutenticación exitosa. Bienvenido, " +cuentaAutenticada.getCliente().getNombre() + ".");
                break;
            } else {
                System.out.println("Datos incorrectos. Intentos restantes: " + (intentos - 1));
            }
        }

        if (cuentaAutenticada == null) {
            System.out.println("Demasiados intentos fallidos. Operación cancelada.");
            entrada.close();
            return;
        }

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
                        realizarRetiro(entrada, cajero, cuentaAutenticada);
                        break;
                    case 2:
                        realizarTransferencia(entrada, cajero, cuentaAutenticada, cuentas);
                        break;
                    case 3:
                        System.out.println("Gracias por usar el cajero automático.");
                        break;
                    default:
                        System.out.println("Opción inválida.");
                }
            } while (opcion != 3);

            entrada.close();

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

        private static void realizarRetiro(Scanner scanner, CajeroAutomatico cajero, Cuenta cuenta) {
        System.out.print("Ingrese monto a retirar: ");
        double monto = scanner.nextDouble();
        cajero.retirar(cuenta, monto);
    }

    private static void realizarTransferencia(Scanner scanner, CajeroAutomatico cajero,
        Cuenta cuentaOrigen, List<Cuenta> cuentas) {
        System.out.print("Ingrese número de cuenta destino: ");
        String cuentaDestinoStr = scanner.next();

        Cuenta cuentaDestino = buscarCuenta(cuentaDestinoStr, cuentas);

        if (cuentaDestino == null) {
            System.out.println("Cuenta destino no encontrada.");
            return;
        }

        System.out.print("Ingrese monto a transferir: ");
        double monto = scanner.nextDouble();

        cajero.transferir(cuentaOrigen, cuentaDestino, monto);
    }

    private static Cuenta buscarCuenta(String numeroCuenta, List<Cuenta> cuentas) {
        for (Cuenta c : cuentas) {
            if (c.getNumeroCuenta().equalsIgnoreCase(numeroCuenta)) {
                return c;
            }
        }
        return null;
    }
}

