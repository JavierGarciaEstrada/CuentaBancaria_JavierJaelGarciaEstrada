

import java.util.Scanner;
public class CuentaBancaria {
    public static int menu (){
        Scanner sc = new Scanner (System.in);
        int opc1 = 0;
        System.out.println("[1] Ver el Saldo");
        System.out.println("[2] Realizar un deposito");
        System.out.println("[3] Realizar un retiro");
        System.out.println("[0] Salir");
        opc1 = sc.nextByte();
        System.out.println(" ");
        if (opc1 >= 4) {
            System.out.println("Por favor ingresa una opcion valida");
            System.out.println(" ");

        }
        return opc1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc1 = 0;

        DatosDeCuenta c1 = new DatosDeCuenta("Javier", "Garcia", 71243, 12332);


        do {
            opc1 = menu();
            //si se pone otra cosa solo se ejecuta el menu en forma de ciclo

            switch (opc1) {

                case 1:

                    c1.toString();
                    System.out.println(" ");
                    break;
                case 2:

                    System.out.println("Ingrese la cantidad a depositar");
                    c1.deposit(sc.nextDouble());

                    break;

                case 3:

                    System.out.println("Ingrese la cantidad a retirar");
                    c1.withdraw(sc.nextDouble());

                    break;

                case 0:
                    System.out.println("Gracias por usarnos");
                    break;
            }
        }while (opc1 != 0) ;
    }
}