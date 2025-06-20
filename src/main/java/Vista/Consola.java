package Vista;

import Modelo.Trabajador;

public class Consola {
    public void mostrarTrabajador(Trabajador t) {
        System.out.println("===== Datos del trabajador =====");
        t.mostrarDatos();
    }
}
