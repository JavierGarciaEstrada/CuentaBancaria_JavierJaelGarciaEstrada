import java.util.Scanner;
public class CuentaBancaria {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        byte opc1 = 0;
        byte opc2 = 0;
        DatosDeCuenta c1 = new DatosDeCuenta("Javier", "Garcia", 71243, 12332);

        do {
            do {
                System.out.println("1.-Realizar un deposito");
                System.out.println("2.-Realizar un retiro");
                System.out.println("0.-Salir");
                opc1 = sc.nextByte();
                System.out.println(" ");
                if (opc1 >= 3) {
                    System.out.println("Por favor ingresa una opcion valida");
                    System.out.println(" ");
                }
            } while (opc1 >=3);

            switch (opc1) {

                case 1:
                    c1.toString();
                    System.out.println("Ingrese la cantidad a depositar");
                    c1.deposit(sc.nextDouble());
                    System.out.println(" ");
                    break;

                case 2:
                    c1.toString();
                    System.out.println("Ingrese la cantidad a retirar");
                    c1.withdraw(sc.nextDouble());
                    System.out.println(" ");
                    break;

                case 0:
                    System.out.println("Gracias por usarnos");
                    break;

            }
        } while (opc1 != 0);

    }
}

