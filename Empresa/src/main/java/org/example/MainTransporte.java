package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainTransporte {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        var EmpresaTransporte = new EmpresaTransporte();

        System.out.println("Ingrese su nombre");
        String nombre = entrada.nextLine();

        System.out.println("Ingrese su cedula");
        String cedula = entrada.nextLine();

        System.out.println("Ingrese su email");
        String email = entrada.nextLine();

        System.out.println("Ingrese su telefono");
        String telefono = entrada.nextLine();

        System.out.println("Ingrese  la capacidad maxima de carga del vehiculo");
        double carga = entrada.nextDouble();
        entrada.nextLine();

        System.out.println("Ingrese el numero de ejes del transporte");
        int ejes = entrada.nextInt();
        entrada.nextLine();

        var vehiculo = new VehiculoCarga(carga, ejes);
        var propietario = new Propietario(nombre, cedula, email, telefono, vehiculo);

        entrada.close();
    }
}