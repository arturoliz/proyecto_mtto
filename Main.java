import java.util.Scanner;

public class Main {
    //a
	static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("----------------------------------------------------");
        System.out.println("Ingrese su Nombre:	(Catalina)");
        String Nombre = entrada.nextLine();
        System.out.println("Ingrese su Numero de cuenta:	(23140972)");
        String Num_cuenta = entrada.nextLine();
        System.out.println("Ingrese su Nip:		(8002)");
        int Nip = entrada.nextInt();
        System.out.println("----------------------------------------------------");
        if(Nombre.equals("Catalina") && Num_cuenta.equals("23140972") && Nip==8002) {
        	System.out.println("===============================================");
        	System.out.print(Nombre);

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
}

