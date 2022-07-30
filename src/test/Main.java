package test;

import clases.CuentaBancaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Iniciamos Scanner
        Scanner entrada= new Scanner(System.in);

        //Pedimos datos de Cliente
        System.out.println("C U E N T A - B A N C A R I A");
        System.out.print("Ingrese No. DPI: ");
        String DPI= entrada.nextLine();
        System.out.print("Ingrese Saldo Actual: ");
        double saldoActual= entrada.nextDouble();
        System.out.print("Ingrese % de Interes Anual: ");
        float interesAnual=entrada.nextFloat();

        //Creamos Objeto
        CuentaBancaria c1= new CuentaBancaria();

       //PEDIMOS QUE INGRESE UN MONTO EL CLIENTE
        System.out.println("Digite monto a depositar: ");
        double ingreso= entrada.nextDouble();

        //Mandamos a mostrarle el saldo
        System.out.println("El nuevo saldo es:  "+c1.ingresarSaldo(ingreso,saldoActual));

    }
}
