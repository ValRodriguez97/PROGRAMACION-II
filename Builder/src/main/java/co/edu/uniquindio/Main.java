package co.edu.uniquindio;

import co.edu.uniquindio.Builder.Arquitecto;
import co.edu.uniquindio.Builder.Empleado;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Empleado empleado = Empleado.builder().setNombre("Jhon").build();
        Arquitecto arquitecto = (Arquitecto) Arquitecto.builder().setSalario(1999).build();

    }
}