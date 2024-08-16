package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainTransporte {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        var EmpresaTransporte = new EmpresaTransporte();

        System.out.println("Ingrese su nombre:");
        String nombre = entrada.nextLine();

        System.out.println("Ingrese su cedula:");
        String cedula = entrada.nextLine();

        System.out.println("Ingrese su email:");
        String email = entrada.nextLine();

        System.out.println("Ingrese su telefono:");
        String telefono = entrada.nextLine();

        System.out.println("Ingrese la marca de su vehiculo:");
        String marca = entrada.nextLine();

        System.out.println("Ingrese el modelo de su vehiculo:");
        String modelo = entrada.nextLine();

        System.out.println("Ingrese la placa del vehiculo:");
        String placa = entrada.nextLine();

        System.out.print("Ingrese el color del vehiculo:");
        String color = entrada.nextLine();

        System.out.println("Ingrese  la capacidad maxima de carga del vehiculo:");
        double carga = entrada.nextDouble();
        entrada.nextLine();

        System.out.println("Ingrese el numero de ejes del transporte:");
        int ejes = entrada.nextInt();
        entrada.nextLine();

        var vehiculo = new VehiculoCarga(marca, modelo, placa, color, carga, ejes);
        var propietario = new Propietario(nombre, cedula, email, telefono, vehiculo);
        EmpresaTransporte.agregarVehiculoCarga(vehiculo);
        EmpresaTransporte.agregarPropietario(propietario);

        System.out.print(propietario);

        entrada.close();

      /*Scanner totalPasajeros = new Scanner(System.in);

        System.out.println("Ingrese su nombre");
        String nombre2 = totalPasajeros.nextLine();

        System.out.println("Ingrese su cedula");
        String cedula2 = totalPasajeros.nextLine();

        System.out.println("Ingrese su email");
        String email2 = totalPasajeros.nextLine();

        System.out.println("Ingrese su telefono");
        String telefono2 = totalPasajeros.nextLine();

        System.out.println("Ingrese la placa del vehiculo");
        String placa2 = totalPasajeros.nextLine();

        System.out.println("ingrese el numero maximo de pasajeros ");
        int pasajeros = totalPasajeros.nextInt();

        var VehiculoCarga = new VehiculoCarga(carga, ejes, placa2);
        var propietario2 = new Propietario(nombre2, cedula2, email2, telefono2, vehiculo);

        totalPasajeros.close();
*/
    }



}