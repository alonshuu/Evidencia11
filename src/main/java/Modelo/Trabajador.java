package Modelo;

public class Trabajador extends Persona {
    private String isapre;
    private String afp;

    public Trabajador(String nombre, String apellido, String rut, String isapre, String afp) {
        super(nombre, apellido, rut);
        this.isapre = isapre;
        this.afp = afp;
    }

    public String getIsapre() {
        return isapre;
    }

    public String getAfp() {
        return afp;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("RUT: " + getRut());
        System.out.println("Isapre: " + isapre);
        System.out.println("AFP: " + afp);
    }
}
