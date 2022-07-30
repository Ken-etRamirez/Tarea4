package clases;

import java.util.Scanner;

public class CuentaBancaria {
    //ATRIBUTOS
    private long numeroCuenta;
    private String DPI;
    private double saldoActual;
    private float interesAnual;


    //CONTADOR PARA CORRELATIVOS AUTOMATICAMENTE DE NUMERO DE CUENTA
    long contadorNumeroCuenta=10000;

    //SCANNER PARA PARA PEDIR DATOS
    Scanner entrada= new Scanner(System.in);

    //CONSTRUCTOR VACIO/DEFECTO
    public CuentaBancaria() {
    }

    //CONSTRUCTOR CON PARAMETROS
    public CuentaBancaria(String DPI, double saldoActual, float interesAnual){
        //Hacemos que sume de 1 en 1 automaticamente el no. de cuenta
        this.numeroCuenta=contadorNumeroCuenta++;
        this.DPI=DPI;
        this.saldoActual=saldoActual;
        this.interesAnual=interesAnual;
    }

    //METODOS GETTER
    public long getNumeroCuenta(){
        return  this.numeroCuenta;
    }

    public String getDPI() {
        return this.DPI;
    }

    public double getSaldoActual() {
        return this.saldoActual;
    }

    public float getInteresAnual() {
        return this.interesAnual;
    }


    //METODO SETTER
    public void setDPI(String DPI){
        this.DPI=DPI;
    }

    public void setNumeroCuenta(long numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public void setInteresAnual(float interesAnual) {
        this.interesAnual = interesAnual;
    }


    //FUNCION CREAR CUENTA BANCARIA
    public void crearCuenta(String DPI, double saldoActual, float interesAnual){
        this.numeroCuenta=contadorNumeroCuenta++;
    }

    //FUNCION MOSTRAR DATOS DE CUENTA
    public void mostrarDatosCuenta(String DPI, double saldoActual, float interesAnual){
        System.out.println("---------------------------------------------------");
        System.out.println("Numero de Cuenta: "+(this.numeroCuenta=contadorNumeroCuenta++));
        System.out.println("DPI: "+DPI);
        System.out.println("Saldo Actual: "+saldoActual);
        System.out.println("Intereses: "+interesAnual);
        System.out.println("---------------------------------------------------");
    }

    //FUNCION ACTUALIZAR SALDO
    public float calcularInteresAnual(float interesAnual,double saldoActual){
        float montoInteresAnual=(float)(((interesAnual/100)/365)*saldoActual);
        return montoInteresAnual;
    }

    //FUNCION INGRESAR SALDO
    public double ingresarSaldo(double ingreso,double saldoActual){
        double subtotal=ingreso+saldoActual;
        return subtotal;
    }

    //FUNCION RETIRAR  SALDO
    public double retirarSaldo(double retiro, double saldoActual){
        double subtotal=saldoActual-retiro;
        return subtotal;
    }

}
